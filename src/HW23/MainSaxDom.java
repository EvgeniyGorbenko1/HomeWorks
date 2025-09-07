package HW23;

import HW23.Main.Sonnet;
import HW23.Parse.DomMain;
import HW23.Parse.SaxMain;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainSaxDom {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("Choose an option: 1 - SaxParse , 2 - DomParse");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Sonnet sonnet = new Sonnet();
        switch (option) {
            case 1:
                SaxMain.main();
                case 2:
                    DomMain.main();
        }
        String fileName = sonnet.getAuthor().getFirstName() + " " + sonnet.getAuthor().getLastName() + " " + sonnet.getTitle() + ".txt";
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            List <String> lines = sonnet.getLines();
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
