public class Opera extends MusicalShow{
    private int choirSize; //количество человек в хоре

    public Opera(MusicalShow musicalShow, int choirSize) {
        super(musicalShow, musicalShow.getMusicAuthor(), musicalShow.getLibrettoText());
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
