public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(String title, int duration, Director director, String composer, String libretto, String choreographer) {
        super(title, duration, director, composer, libretto);
        this.choreographer = choreographer;
    }
}
