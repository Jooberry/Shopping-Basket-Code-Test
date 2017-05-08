package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 07/05/2017.
 */

public class Checkout {

    public int getBasketTotalPrice(ShoppingBasket shoppingBasket){
        int totalPrice = 0;
        for (Item item : shoppingBasket.getContents()){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }



}
