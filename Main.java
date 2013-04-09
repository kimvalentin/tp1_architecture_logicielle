<<<<<<< HEAD
package tp1bis;
=======
package tp1;
>>>>>>> 58fe35c547958a4fe79741245be77a1e84df16c3

import java.util.Scanner;

public class Main {

<<<<<<< HEAD
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String resp = "";
		Scanner reader = new Scanner(System.in);
		Caisse c = new Caisse();
		
		while(!resp.equalsIgnoreCase("quitter")){
			System.out.println("What do you wanna buy ?");
			resp = reader.nextLine();
			printPrice(resp,c);
		}
	}

	private static void printPrice(String resp, Caisse c) {
		String [] toCheck = resp.split(", ");
		for (int i = 0; i < toCheck.length; i++){
			c.ajouter(toCheck[i]);
		}
		System.out.println("  > " + c.getTotalPrice());
	}

=======
	public static void main(String[] args) {
		String resp = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		Pomme p = new Pomme(0);
		Cerise c = new Cerise(0);
		Banane b = new Banane(0);
		int numberOfFruit = 0;
		int totalPrice = 0;
		while(!resp.equalsIgnoreCase("quitter")){
			System.out.println("What do you wanna buy ?");
			resp = reader.nextLine();
			
			printPrice(resp,p,c,b,totalPrice,numberOfFruit);
		}
	}

	private static void printPrice(String resp, Pomme p, Cerise c, Banane b, int totalPrice,
			int numberOfFruit) {
		String [] toCheck = resp.split(", ");
		double reducTotal = 200;
		double reduc = 0;
		numberOfFruit += toCheck.length;
		
		if (toCheck.length >= 5)
			totalPrice -= reducTotal * numberOfFruit/5;
		
		for (int i = 0; i < toCheck.length; i++){
			if (toCheck[i].equals("Pommes") || toCheck[i].equals("Apples") || toCheck[i].equals("Mele")){
				p.setNumber(p.getNumber() + 1);
				if (toCheck[i].equals("Pommes")){
					if (p.getNumber() % 4 == 0)
						reduc = 100;
					totalPrice += p.getNumber() * p.getPrice() * 100 - reduc;
				}
				if (toCheck[i].equals("Apples")){
					if (p.getNumber() % 3 == 0)
						reduc = 100;
					totalPrice += p.getNumber() * p.getPrice() * 100 - reduc;
				}
				if (toCheck[i].equals("Mele")){
					if (p.getNumber() % 2 == 0)
						reduc = 50;
					totalPrice += p.getNumber() * p.getPrice() * 100 - reduc;
				}
					
			}
			if (toCheck[i].equals("Cerises")){
				c.setNumber(c.getNumber() + 1);
				totalPrice += c.getNumber()*c.getPrice()*100 - c.getNumber()/2 * 100; 
						
			}
			if (toCheck[i].equals("Bananes")){
				b.setNumber(b.getNumber() + 1);
				totalPrice += c.getNumber()*c.getPrice()*100 - c.getPrice() * 100; 
			}
		}
		
		
		System.out.println("  > " + totalPrice);
	}
>>>>>>> 58fe35c547958a4fe79741245be77a1e84df16c3
}
