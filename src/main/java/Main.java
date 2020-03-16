import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * @author ArtSCactus
 * @version 1.0
 */
public class Main {
    public static void main (String[] args) throws IOException {
        XMLLexer lexer = new XMLLexer(CharStreams.fromFileName("books.xml"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser parser = new XMLParser(tokens);
        ParseTree tree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Walker(), tree);
    }
}
