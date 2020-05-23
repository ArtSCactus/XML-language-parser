import builder.DocumentConstructor;
import builder.MainConstructor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Main {
    public static void main (String[] args) throws IOException, ParserConfigurationException, TransformerException {
        XMLLexer lexer = new XMLLexer(CharStreams.fromFileName("code.xml"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser xmlParser = new XMLParser(tokens);
        ParseTree tree = xmlParser.script();
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomBaseListener customBaseListener = new CustomBaseListener();
        walker.walk(customBaseListener, tree);
        Visitor visitor = new Visitor();
        visitor.visit(tree);
        DocumentConstructor documentConstructor = new DocumentConstructor();
        documentConstructor.buildDocument(visitor.getConstants());
        System.out.println(visitor.getDocuments());
        MainConstructor constructor = new MainConstructor();
        constructor.transformDocumentToJavaCode(visitor.getDocuments().get("mydocname"));
        System.out.println(constructor.getCode());
        FileWriter fileWriter = new FileWriter("Main.java");
        fileWriter.write(constructor.getCode());
        fileWriter.close();
    }
}
