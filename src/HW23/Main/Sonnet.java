package HW23.Main;

import java.util.List;

public class Sonnet {

    private Author author;
    private List<String> lines;
    private String type;
    private String title;

    public Sonnet(Author author, List<String> lines, String type, String title) {
        this.author = author;
        this.lines = lines;
        this.type = type;
        this.title = title;
    }

    public Sonnet() {

    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "author=" + author +
                ", lines=" + lines +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
