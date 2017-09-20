/**
 * Created by h205p2 on 9/14/17.
 */
public class Animal {
    // Put your instance variables here
    String name;
    String favoriteFood;
    static int population;

    public Animal(String name, String favoriteFood) {
        // put your initializer content here
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public static int populationCount() {
        return population;
    }

    public void sleep() {
        // complete your sleep function here
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        // complete your eat function here
        System.out.println(name + " eats " + food);
        if(food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            sleep();
        }
    }
}
