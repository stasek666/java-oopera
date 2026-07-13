public class Director extends  Person{
    protected int numberOfShows; //количество поставленных спектаклей

    Director (String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    Director (Person person, int numberOfShows) {
        super(person.getName(), person.getSurname(), person.getGender());
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}
