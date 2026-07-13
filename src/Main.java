import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Юрий", "Соломин", Gender.MALE, 178);
        Actor actor2 = new Actor("Евгений", "Леонов", Gender.MALE, 165);
        Actor actor3 = new Actor("Нонна", "Мордюкова", Gender.FEMALE, 170);
        Director director1 = new Director("Георгий", "Товстоногов", Gender.MALE, 175);
        Director director2 = new Director("Марк", "Захаров", Gender.MALE, 40);
        Person musicAuthor = new Person("Александра", "Пахмутова", Gender.FEMALE);
        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);
        Show show = new Show("Гамлет", 122, director1, new ArrayList<>());
        show.addActor(actor1);
        show.addActor(actor2);
        Opera opera = new Opera("Необычный день", 102, director1, new ArrayList<>(), musicAuthor, "Однажды в сказочном лесу запели птицы...", 15);
        opera.addActor(actor1);
        opera.addActor(actor3);
        Ballet ballet = new Ballet("Танцуют все!", 111, director1, new ArrayList<>(), musicAuthor, "Танцевать-танцевать, я не знаю, как начать, брошу кепочку на веточку...", choreographer);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();
        ballet.replaceActor(opera.getListOfActors().get(0), ballet.getListOfActors().get(0).getSurname());
        ballet.printListOfActors();
        opera.replaceActor(actor1, actor2.getSurname());
        opera.printLibretto();
        ballet.printLibretto();
    }
}
