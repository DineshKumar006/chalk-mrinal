package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cart;
import main.Item;
import main.Shop;
//import main.Item;
class CartTest {

	Cart c;
	Shop s;
	@BeforeEach
	void setUp() throws Exception {
		c = new Cart();
		s = new Shop();
		
	}

	@SuppressWarnings("static-access")
	@Test
	void test() {
//		s.itemAvailable[0]
	    for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
        s.itemAvailable[0].addItem("maggi", 24);
        s.itemAvailable[1].addItem("coffee", 100);
        c.updateCart(s.itemAvailable[0], 5);
        c.updateCart(s.itemAvailable[1], 6);
        assertEquals(2,c.noOfItems);
		
		 
	}
	@SuppressWarnings("static-access")
	@Test
	void test3() {
		Cart c1 = new Cart();
		Shop s1 = new Shop();
		
		//		s.itemAvailable[0]
	    for(int i=0;i<2;i++){
            s1.itemAvailable[i] = new Item();
        }
        s1.itemAvailable[0].addItem("maggi", 24);
        s1.itemAvailable[1].addItem("coffee", 100);
        c1.updateCart(s.itemAvailable[0], 5);
        c1.updateCart(s.itemAvailable[1], 6);
        assertEquals(2,c1.noOfItems);
		
		 
	}
	@SuppressWarnings("static-access")
	@Test
	void test4() {
//		s.itemAvailable[0]
		Cart c2 = new Cart();
		Shop s2 = new Shop();
	    for(int i=0;i<2;i++){
            s2.itemAvailable[i] = new Item();
        }
        
        assertEquals(0,c2.noOfItems);
		
		 
	}


}
