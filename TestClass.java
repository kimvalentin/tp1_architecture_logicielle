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
		assertEquals(250, c.getTotalPrice());
	}
	
	@Test
	public void ite1c(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		c.ajouter("Bananes");
		c.ajouter("Bananes");
		c.ajouter("Cerises");
		assertEquals(180, c.getTotalPrice());
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
		assertEquals(510,c.getTotalPrice());
	}
	
	@Test
	public void ite3b(){
		Caisse c = new Caisse();
		c.ajouter("Pommes, Cerises, Bananes, Cerises");
		assertEquals(380,c.getTotalPrice());
	}
	
	@Test
	public void ite3c(){
		Caisse c = new Caisse();
		c.ajouter("Pommes, Cerises, Bananes, Cerises, Pommes");
		assertEquals(280,c.getTotalPrice());
	}
	
	@Test
	public void ite3d(){
		Caisse c = new Caisse();
		c.ajouter("Pommes, Cerises, Bananes, Cerises, Pommes");
		c.ajouter("Cerises, Cerises, Pommes, Cerises");
		assertEquals(585,c.getTotalPrice());
	}
	
	@Test
	public void ite3e(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Cerises");
		c.ajouter("Bananes");
		c.ajouter("Bananes");
		assertEquals(280,c.getTotalPrice());
	}
	
	@Test
	public void ite4(){
		Caisse c = new Caisse();
		c.ajouter("Cerises");
		c.ajouter("Pommes");
		c.ajouter("Cerises");
		c.ajouter("Bananes");
		c.ajouter("Apples");
		assertEquals(280,c.getTotalPrice());
	}
	
	@Test
	public void ite5(){
		Caisse c = new Caisse();
		c.ajouter("Mele");
		c.ajouter("Apples");
		c.ajouter("Apples");
		c.ajouter("Pommes");
		c.ajouter("Apples");
		c.ajouter("Mele");
		c.ajouter("Cerises");
		c.ajouter("Cerises");
		assertEquals(280,c.getTotalPrice());
	}
	
	
	@Test
	public void ite5a(){
		Caisse c = new Caisse();
		c.ajouter("Mele, Apples, Apples, Pommes, Apples, Mele, Cerises, Cerises, Bananes");
		assertEquals(430, c.getTotalPrice());
	}
	
	@Test
	public void ite6(){
		Caisse c = new Caisse();
		c.ajouter("Mele, Apples, Apples, Mele");
		c.ajouter("Bananes");
		assertEquals(200, c.getTotalPrice());
	}
	
	@Test
	public void ite6a(){
		Caisse c = new Caisse();
		c.ajouter("Mele, Apples, Apples, Pommes, Mele");
		assertEquals(150, c.getTotalPrice());
	}
	
	@Test
	public void ite6b(){
		Caisse c = new Caisse();
		c.ajouter("Mele, Apples, Apples, Pommes, Mele");
		c.ajouter("Mele, Apples, Apples, Pommes, Mele");
		assertEquals(200, c.getTotalPrice());
	}
	
	@Test
	public void ite6c(){
		Caisse c = new Caisse();
		c.ajouter("Mele, Apples, Apples, Pommes, Mele");
		c.ajouter("Mele, Apples, Apples, Pommes, Mele");
		c.ajouter("Cerises");
		c.ajouter("Bananes");
		c.ajouter("Cerises");
		c.ajouter("Pommes, Cerises");
		assertEquals(455, c.getTotalPrice());
	}
	
	

}
