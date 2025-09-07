package HW23.Parse;

import HW23.Main.Sonnet;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxMain {
    public static Sonnet main() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        SaxHandler handler = new SaxHandler();

        saxParser.parse(new File("C:\\Users\\79815\\IdeaProjects\\HomeWorks\\src\\HW23\\File.xml"), handler);
      return handler.getSonnet();

    }
}
