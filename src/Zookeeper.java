/**
 * Created by h205p2 on 9/19/17.
 */
import java.util.ArrayList;
public class Zookeeper {
    String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> a, String food) {
        Animal lastA = a.get(a.size() - 1);
        int pop = lastA.populationCount();
        System.out.println(name + " is feeding " + food + " to " + a.size() + " of " + pop + " animals");
        for(int i = 0; i < a.size(); i++) {
            a.get(i).eat(food);
        }

    }

}
