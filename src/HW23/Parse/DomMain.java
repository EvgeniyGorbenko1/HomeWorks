package HW23.Parse;

import HW23.Main.Author;
import HW23.Main.Sonnet;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomMain {
    public static Sonnet main() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document doc = factory.newDocumentBuilder().parse(new File("C:\\Users\\79815\\IdeaProjects\\HomeWorks\\src\\HW23\\File.xml"));
        doc.normalize();

        Sonnet sonnet = new Sonnet();
        Author author = new Author();
        author.setFirstName(doc.getElementsByTagName("firstName").item(0).getTextContent());
        author.setLastName(doc.getElementsByTagName("lastName").item(0).getTextContent());
        sonnet.setAuthor(author);
        sonnet.setTitle(doc.getElementsByTagName("title").item(0).getTextContent());
        NodeList allLines = doc.getElementsByTagName("line");
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < allLines.getLength(); i++) {
           lines.add(allLines.item(i).getTextContent());
        }
        sonnet.setLines(lines);
        return sonnet;

    }
}
