/**
 * Created by h205p2 on 9/12/17.
 */
public class zoo {

    public static void main(String[] args) {
        //zoo z = new zoo();
        //z.eat("Dingus", "meat");
        //z.eat("Dingus", "bacon");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");


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
