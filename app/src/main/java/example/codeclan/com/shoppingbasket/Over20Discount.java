package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 07/05/2017.
 */

public abstract class Over20Discount implements Discountable {

    public Integer discount(Integer totalPrice){
        if (totalPrice > 2000){
            double discount = totalPrice * 0.10;
            int roundedDiscount = ((int) Math.ceil(discount));
            totalPrice -= roundedDiscount;
        }
        return totalPrice;
    }

}
