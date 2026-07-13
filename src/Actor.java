public class Actor extends Person {
    protected int height;

    Actor (String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    Actor (Person person, int height) {
        super(person.getName(), person.getSurname(), person.getGender());
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Actor actor = (Actor) obj;
        return super.equals(obj) && this.height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash *= 31;
        hash += height;
        return hash;
    }
}
