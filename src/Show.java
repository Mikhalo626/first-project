import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> actors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Предупреждение: Актёр уже в списке!");
        } else {
            actors.add(actor);
        }
    }

    public void replaceActor(int index, Actor actor) {
        if (index >= 0 && index < actors.size()) {
            actors.set(index, actor);
        } else {
            System.out.println("Ошибка: Актёр с индексом " + index + " не найден.");
        }
    }

    public void printActors() {
        System.out.println("Актёры спектакля " + title + ":");
        for (Actor a : actors) {
            System.out.println(a);
        }
    }
}