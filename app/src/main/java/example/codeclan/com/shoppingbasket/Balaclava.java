package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 07/05/2017.
 */

public class Balaclava implements Item {

    String name;
    int price;
    boolean bogof;

    public Balaclava(){
        this.name = "Black Balaclava";
        this.price = 500;
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
