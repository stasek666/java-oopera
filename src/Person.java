import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    Person (String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (this.name != null) {
            hash += this.name.hashCode();
        }
        hash *= 31;
        if (this.surname != null) {
            hash += this.surname.hashCode();
        }
        hash *= 31;
        if (this.gender != null) {
            hash += this.gender.hashCode();
        }
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
    }
}
