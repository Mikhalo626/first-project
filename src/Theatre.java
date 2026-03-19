public class Theatre {
    public static void main(String[] args) {
        Actor a1 = new Actor("Михаил", "Щепкин", "М", 175);
        Actor a2 = new Actor("Мария", "Ермолова", "Ж", 165);
        Actor a3 = new Actor("Константин", "Станиславский", "М", 180);

        Director d1 = new Director("Кристофер", "Нолан", "М", 12);
        Director d2 = new Director("Всеволод", "Мейерхольд", "М", 15);

        Show drama = new Show("Чайка", 150, d1);
        Opera opera = new Opera("Евгений Онегин", 180, d2, "Чайковский", "История о любви", 40);
        Ballet ballet = new Ballet("Щелкунчик", 110, d1, "Пётр Чайковский", "Сказка о деревянной кукле", "Юрий Григорович");


        drama.addActor(a1);
        drama.addActor(a3);
        opera.addActor(a2);
        opera.addActor(a1);
        ballet.addActor(a2);

        drama.printActors();
        opera.printActors();
        ballet.printActors();

        System.out.println("\n--- Замена ---");
        drama.replaceActor(0, a2);
        drama.printActors();

        System.out.println("\n--- Ошибка замены ---");
        drama.replaceActor(99, a1);

        System.out.println("\n--- Либретто ---");
        opera.printLibretto();
        ballet.printLibretto();
    }
}