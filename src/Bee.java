/**
 * Created by h205p2 on 9/18/17.
 */
public class Bee extends Animal {

    public Bee(String name) {
        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        }
        else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
