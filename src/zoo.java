/**
 * Created by h205p2 on 9/12/17.
 */
public class zoo {

    public static void main(String[] args) {
        zoo z = new zoo();
        //z.sleep("Dingus");
        z.eat("Dingus", "meat");
        z.eat("Dingus", "bacon");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";
    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if(food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food + "!!");
        }
        else {
            sleep(name);
        }
    }


}
