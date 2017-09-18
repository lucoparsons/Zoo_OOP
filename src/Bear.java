/**
 * Created by h205p2 on 9/14/17.
 */
public class Bear extends Animal {
    String favoriteFood = "fish";

    public Bear(String name){
        super(name, "fish");
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(name + " hibernates for 4 months");
    }

}
