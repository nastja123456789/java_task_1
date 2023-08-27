import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[9];
        for (int i = 0; i < 3; i++) {
            animals[i] = new Dog("Собака " + (i + 1));
        }
        for (int i = 3; i < 6; i++) {
            animals[i] = new HouseCat("Домашний кот " + (i - 2));
        }
        for (int i = 6; i < 9; i++) {
            animals[i] = new Tiger("Тигр " + (i - 5));
        }
        Random random = new Random();
        for (Animal animal : animals) {
            int distance = random.nextInt(1000) + 1;
            animal.run(distance);

            if (animal instanceof Dog) {
                distance = random.nextInt(10) + 1;
                animal.swim(distance);
            } else if (animal instanceof Tiger) {
                distance = random.nextInt(50) + 1;
                animal.swim(distance);
            }
            System.out.println();
        }
    }
}
