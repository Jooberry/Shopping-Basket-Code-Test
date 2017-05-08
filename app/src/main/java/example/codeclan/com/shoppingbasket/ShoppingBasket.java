package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 07/05/2017.
 */

public class ShoppingBasket {

    ArrayList<Item> contents;

    public ShoppingBasket(){
        this.contents = new ArrayList<Item>();
    }

    public ArrayList<Item> getContents(){
        return this.contents;
    }

    public void addItem(Item item){
        this.contents.add(item);
    }

    public void removeItem(Item item){
        this.contents.remove(item);
    }

    public void emptyBasket(){
        this.contents.clear();
    }

    public int basketCount(){
        return this.contents.size();
    }

}
