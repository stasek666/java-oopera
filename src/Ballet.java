public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(MusicalShow musicalShow, Person choreographer) {
        super(musicalShow, musicalShow.getMusicAuthor(), musicalShow.getLibrettoText());
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
