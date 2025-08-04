package Lesson14;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        //Проанализировать и записать в другой файл самое длинное слово.
       StringBuilder stringBuilder = new StringBuilder();
 00`      try (FileReader fileReader = new FileReader("C:\\romeo-and-juliet.txt")) {
           int i;
           while ((i = fileReader.read()) != -1) {
               stringBuilder.append((char) i);
           }
       } catch (IOException e) {
           System.out.println("Не нашел нужный файл!");
       }
       String [] words = String.valueOf(stringBuilder).split("[^A-z]");
       String longestWord = "";
       for (String word : words) {
           if (word.length() > longestWord.length()) {
               longestWord = word;
           }
       }
        FileWriter fileWriter = new FileWriter("C:\\longest.txt");
       fileWriter.write(longestWord);
       fileWriter.close();
 }
}
