public class Actor extends Person {
    private int height;

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
        return this.getName() + " " + this.getSurname() + " (" + this.height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Actor actor = (Actor) obj;
        return this.getName() == actor.getName() && this.getSurname() == actor.getSurname() && this.height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (this.getName() != null) {
            hash += this.getName().hashCode();
        }
        hash *= 31;
        if (this.getSurname() != null) {
            hash += this.getSurname().hashCode();
        }
        hash *= 31;
        hash += height;
        return hash;
    }
}
