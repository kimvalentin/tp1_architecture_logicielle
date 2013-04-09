package tp1bis;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

//	@Test
//	public void ite0(){
//		Caisse c = new Caisse();
//		assertEquals(c.ajouter(), "bob");
//	}
	
	@Test
	public void ite1a(){
		Caisse c = new Caisse();
		c.ajouter("Pommes");
		assertEquals(100, c.getTotalPrice());
	}
	
	@Test
	public void ite1b(){
		Caisse c = new Caisse();
		c.ajouter("Pommes");
		c.ajouter("Bananes");
		c.ajouter("Bananes");
		assertEquals(400, c.getTotalPrice());
	}
	
	@Test
	public void ite1c(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		c.ajouter("Bananes");
		c.ajouter("Bananes");
		c.ajouter("Cerises");
		assertEquals(530, c.getTotalPrice());
	}
	
	@Test
	public void ite2a(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Cerises");
		assertEquals(130,c.getTotalPrice());
	}
	
	@Test
	public void ite2b(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		c.ajouter("Bananes");
		assertEquals(380,c.getTotalPrice());
	}
	
	@Test
	public void ite2c(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		c.ajouter("Bananes");
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		assertEquals(710,c.getTotalPrice());
	}
	
	@Test
	public void ite3a(){
		Caisse c = new Caisse();
		c.ajouter("Pommes, Cerises, Bananes");
		assertEquals(325,c.getTotalPrice());
	}

}
