import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        Bird bird1 = new Bird();
        System.out.println(bird1.fly());
        Airplane airplane1 = new Airplane();
        System.out.println(airplane1.fly());

        // Задача 2

        Submarine submarine1 = new Submarine();
        System.out.println(submarine1.dive());
        System.out.println(submarine1.swim());

        // Задача 3

        Human human1 = new Human();
        System.out.println(human1.eat());

        // Задача 5

        Programmer programmer1 = new Programmer();
        programmer1.work();
        Teacher teacher1 = new Teacher();
        teacher1.work();

        Workable[] wokers = {new Programmer(), new Teacher()};
        for (int i = 0; i < wokers.length; i++){
            wokers[i].work();
        }
    }
}