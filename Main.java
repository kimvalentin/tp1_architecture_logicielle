package tp1bis;

import java.util.Scanner;

public class Main {

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

}
