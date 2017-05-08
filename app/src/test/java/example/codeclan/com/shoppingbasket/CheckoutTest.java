package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class CheckoutTest {

    Checkout checkout;
    ShoppingBasket shoppingBasket;
    Pocky pocky1;
    Pocky pocky2;
    Pocky pocky3;
    Pocky pocky4;
    Chainsaw chainsaw1;
    Chainsaw chainsaw2;
    Balaclava balaclava1;
    Balaclava balaclava2;
    Balaclava balaclava3;
    Over20Discount discount2;

    @Before
    public void before(){
        checkout = new Checkout();
        shoppingBasket = new ShoppingBasket();
        pocky1 = new Pocky();
        pocky2 = new Pocky();
        pocky3 = new Pocky();
        pocky4 = new Pocky();
        chainsaw1 = new Chainsaw();
        chainsaw2 = new Chainsaw();
        balaclava1 = new Balaclava();
        balaclava2 = new Balaclava();
        balaclava3 = new Balaclava();
        discount2 = new Over20Discount();
    }

    @Test
    public void testReturnsZeroWhenBasketEmpty(){
        assertEquals(0, checkout.getBasketTotalPrice(shoppingBasket));
    }

    @Test
    public void testCanGetSingleItemTotalPrice(){
        shoppingBasket.addItem(pocky1);
        assertEquals(200, checkout.getBasketTotalPrice(shoppingBasket));
    }

    @Test
    public void testCanGetMultipleItemsTotalPrice(){
        shoppingBasket.addItem(pocky1);
        shoppingBasket.addItem(chainsaw1);
        shoppingBasket.addItem(balaclava1);
        assertEquals(1700, checkout.getBasketTotalPrice(shoppingBasket));
    }

    @Test
    public void test10PercentDiscountApplied(){
        assertEquals();
    }

}
