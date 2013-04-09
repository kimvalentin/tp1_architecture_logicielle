package tp1bis;

import java.util.HashMap;

public class Scanner {

	/*
	 * Correction du prof
	 */
	HashMap <String,Integer> prices = new HashMap<>();
	Integer sum = 0;
	
	public Scanner(){
		prices.put("Pommes", 100);
		prices.put("Cerises", 75);
		prices.put("Bananes", 150);
	}
	
	public int add(String product){
		sum += prices.get(product);
		return sum;
	}

}
