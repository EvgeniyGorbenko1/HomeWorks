package Lesson10;

import java.util.Objects;

public class UserSyst {
    private int id;
    private String name;
    private String surname;

    public UserSyst(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "UserSyst{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserSyst userSyst = (UserSyst) o;
        return Objects.equals(id, userSyst.id) && Objects.equals(name, userSyst.name) && Objects.equals(surname, userSyst.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }

}
