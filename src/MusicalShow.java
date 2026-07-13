import java.util.ArrayList;

public class MusicalShow extends Show{
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    // Ирек, я сделал правку параметров конструкторов (и их вызовов) по замечаниям, но оставил и альтернативную версию
    // На "Вебинаре про декомпозицию кода" (спринт 3, тема 8, урок 7, в диапазоне времени 13:30 - 16:40) говорилось о том,
    // что в идеале кол-во параметров методов должно быть не более 2, а как решение для передачи большего кол-ва информации,
    // чем 2 простых значения, предлагалось создавать специальные обобщающие классы. А здесь, при наследовании, даже создавать
    // ничего не нужно, классы уже есть, надо только использовать. Если считаешь, что данный подход неверный, то есть смысл
    // оставить замечание к уроку. Т.к. я со своей стороны лишь стараюсь руководствоваться рекомендациями текущего курса.
    public MusicalShow(Show show, Person musicAuthor, String librettoText) {
        super(show.getTitle(), show.getDuration(), show.getDirector(), show.getListOfActors());
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля '" + this.getTitle() + "':");
        System.out.println(this.librettoText);
    }

}
