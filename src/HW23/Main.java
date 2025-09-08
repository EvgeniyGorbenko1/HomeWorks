package HW23;

import HW23.Models.Sonnet;
import HW23.Parse.SaxHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        Sonnet sonnet = null;

        SaxHandler handler = new SaxHandler();

        saxParser.parse(new File("src\\HW23\\File.xml"), handler);
        sonnet =  handler.getSonnet();

        String fileName = "src\\HW23\\" +
                sonnet.getAuthor().getFirstName() + "_" + sonnet.getAuthor().getLastName() + "_" + sonnet.getTitle() + ".txt";
        File file = new File(fileName);
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            for(String line : sonnet.getLines()) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        }
    }
