package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class ItemTest {

    Pocky pocky;
    Chainsaw chainsaw;

    @Before
    public void before(){
        pocky = new Pocky();
        chainsaw = new Chainsaw();
    }

    @Test
    public void testItemHasName(){
        assertEquals("Original Pocky", pocky.getName());
        assertEquals("Hurtful Chainsaw", chainsaw.getName());
    }

    @Test
    public void testItemHasPrice(){
        assertEquals(200, pocky.getPrice());
        assertEquals(1000, chainsaw.getPrice());
    }

    @Test
    public void testItemHasBOGOF(){
        assertEquals(true, pocky.isBOGOF());
        assertEquals(false, chainsaw.isBOGOF());
    }

}
