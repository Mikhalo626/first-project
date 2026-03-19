public class MusicalShow extends Show {
    String composer;
    String libretto;

    public MusicalShow(String title, int duration, Director director, String composer, String libretto) {
        super(title, duration, director);
        this.composer = composer;
        this.libretto = libretto;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля " + title + ": " + libretto);
    }
}