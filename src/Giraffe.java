/**
 * Created by h205p2 on 9/15/17.
 */
public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name, "leaves");
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
