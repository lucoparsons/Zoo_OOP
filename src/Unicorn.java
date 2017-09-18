/**
 * Created by h205p2 on 9/15/17.
 */
public class Unicorn extends Animal {

    public Unicorn(String name) {
        super(name, "marshmallows");
    }

    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }

}
