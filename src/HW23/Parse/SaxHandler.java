package HW23.Parse;

import HW23.Models.Author;
import HW23.Models.Sonnet;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    private Sonnet sonnet;
    public Author author;
    public List<String> lines;

    boolean isLastName = false;
    boolean isFirstName = false;
    boolean isTitle = false;
    boolean isLine = false;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("sonnet")) {
            sonnet = new Sonnet();
            sonnet.setType(attributes.getValue("type"));
        }
        if (qName.equals("author")) {
            author = new Author();
        }
        if (qName.equals("lines")) {
            lines = new ArrayList<>();
        }
        if (qName.equals("firstName")) {
            isFirstName = true;
        }
        if (qName.equals("lastName")) {
            isLastName = true;
        }
        if (qName.equals("title")) {
            isTitle = true;
        }
        if (qName.equals("line")) {
            isLine = true;
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (isFirstName) {
            author.setFirstName(new String(ch, start, length));
            isFirstName = false;
        }
        if (isLastName) {
            author.setLastName(new String(ch, start, length));
            isLastName = false;
        }
        if (isTitle) {
            sonnet.setTitle(new String(ch, start, length));
            isTitle = false;
        }
        if (isLine) {
            lines.add(new String(ch, start, length));
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("author")) {
            sonnet.setAuthor(author);
        }
        if (qName.equals("lines")) {
            sonnet.setLines(lines);
        }
        if (qName.equals("line")) {
            isLine = false;
        }
    }

    public Sonnet getSonnet() {
        return sonnet;
    }
}
