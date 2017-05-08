package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Pocky pocky1;
    Pocky pocky2;
    Pocky pocky3;
    Chainsaw chainsaw1;
    Balaclava balaclava1;
    Balaclava balaclava2;
    Balaclava balaclava3;


    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        pocky1 = new Pocky();
        pocky2 = new Pocky();
        pocky3 = new Pocky();
        chainsaw1 = new Chainsaw();
        balaclava1 = new Balaclava();
        balaclava2 = new Balaclava();
        balaclava3 = new Balaclava();

    }

    @Test
    public void testShoppingBasketStartsEmpty(){
        assertEquals(0, shoppingBasket.getContents().size());
    }

    @Test
    public void testCanAddItemToBasket(){
        ArrayList<Item> expected = new ArrayList<Item>();
        expected.add(pocky1);
        shoppingBasket.addItem(pocky1);
        assertEquals(expected, shoppingBasket.getContents());
    }

    @Test
    public void testCanAddMultipleTypesToBasket(){
        ArrayList<Item> expected = new ArrayList<Item>();
        expected.add(pocky1);
        expected.add(pocky2);
        expected.add(chainsaw1);
        expected.add(balaclava1);
        shoppingBasket.addItem(pocky1);
        shoppingBasket.addItem(pocky2);
        shoppingBasket.addItem(chainsaw1);
        shoppingBasket.addItem(balaclava1);
        assertEquals(expected, shoppingBasket.getContents());
    }

    @Test
    public void testCanRemoveItemFromBasket(){
        ArrayList<Item> expected = new ArrayList<Item>();
        expected.add(chainsaw1);
        shoppingBasket.addItem(balaclava1);
        shoppingBasket.addItem(chainsaw1);
        shoppingBasket.removeItem(balaclava1);
        assertEquals(expected, shoppingBasket.getContents());
    }

    @Test
    public void testCanEmptyBasket(){
        shoppingBasket.addItem(pocky1);
        shoppingBasket.addItem(pocky2);
        shoppingBasket.addItem(chainsaw1);
        shoppingBasket.addItem(balaclava1);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.basketCount());
    }

}
