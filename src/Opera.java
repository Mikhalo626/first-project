public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director, String composer, String libretto, int choirSize) {
        super(title, duration, director, composer, libretto);
        this.choirSize = choirSize;
    }
}