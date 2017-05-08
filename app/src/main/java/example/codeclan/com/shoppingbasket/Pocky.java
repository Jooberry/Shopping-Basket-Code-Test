package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 07/05/2017.
 */

public class Pocky implements Item {

    String name;
    int price;
    boolean bogof;

    public Pocky(){
        this.name = "Original Pocky";
        this.price = 200;
        this.bogof = true;
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
