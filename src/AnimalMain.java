import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Animal("Joe"));
        animals.add(new Animal(true));
        animals.add(new Animal("Joe2", false));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Animal Menu " + "\n");
        System.out.print("Entering nothing will stop the loop" + "\n");
        while (true) {
            System.out.print("Enter animal name: " + "\n");
            String animalName = scanner.nextLine();

            if(animalName.equalsIgnoreCase(""))
                break;
            System.out.println("Is it a dog? Yes or no: ");
            boolean dog;
            while (true) {
                String myDog = scanner.nextLine();
                if (!myDog.equals("yes") && !myDog.equals("no")){
                    System.out.println("Please enter yes or no");
                }else {
                    if(myDog.equals("yes")){
                        dog=true;
                    } else {
                        dog = false;
                    }
                    break;
                }
            }
            // Add animal to the list
            animals.add(new Animal(animalName, dog));
        }

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
