package HW23.Main;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private String nationality;
    private int yearOfBirth;
    private int yearOfDeath;

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }

    public Author(String firstName, String lastName, String nationality, int yearOfBirth, int yearOfDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfDeath;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return yearOfBirth == author.yearOfBirth && yearOfDeath == author.yearOfDeath && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, nationality, yearOfBirth, yearOfDeath);
    }
}
