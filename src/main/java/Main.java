import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Main {
    public static void main (String[] args) throws IOException, ParserConfigurationException {
        XMLLexer lexer = new XMLLexer(CharStreams.fromFileName("books.xml"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser xmlParser = new XMLParser(tokens);
        ParseTree tree = xmlParser.complex_tag();
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomBaseListener customBaseListener = new CustomBaseListener();
        walker.walk(customBaseListener, tree);

    }
}
