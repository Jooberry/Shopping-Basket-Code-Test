package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 07/05/2017.
 */

public class Chainsaw implements Item {

    String name;
    int price;
    boolean bogof;

    public Chainsaw(){
        this.name = "Hurtful Chainsaw";
        this.price = 1000;
        this.bogof = false;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public boolean isBOGOF(){
        return this.bogof;
    }

}
