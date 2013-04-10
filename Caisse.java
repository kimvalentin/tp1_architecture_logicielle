package tp1bis;

import java.util.Scanner;

import tp1.Banane;

public class Caisse {

	private Scanner reader;
	private int totalPrice = 0;
	private int 	ceriseNumber = 0,
					bananeNumber = 0,
					pommeNumber = 0,
					appleNumber = 0,
					meleNumber = 0,
					fruitNumber = 0;
	
	public Caisse(){
		 reader = new Scanner(System.in);
	}
	
	public String ajouter(){
		String resp = reader.nextLine();
		System.out.println(resp);
		return resp;
	}
	
	public void ajouter(String toAdd){
		String [] toCheck = toAdd.split(", ");
		for (int i = 0 ; i < toCheck.length; i++){
			if (toCheck[i].equals("Pommes")){
				pommeNumber += 1;
				fruitNumber++;
				ajouterPomme();
			}
			if (toCheck[i].equals("Mele")){
				pommeNumber += 1;
				meleNumber += 1;
				fruitNumber++;
				ajouterPomme();
			}
			if (toCheck[i].equals("Apples")){
				pommeNumber += 1;
				appleNumber += 1;
				fruitNumber++;
				ajouterPomme();
			}
			if (toCheck[i].equals("Cerises")){
				ceriseNumber += 1;
				fruitNumber++;
				ajouterCerise();
			}
			if (toCheck[i].equals("Bananes")){
				bananeNumber += 1;
				fruitNumber++;
				ajouterBanane();
			}
		}
		
	}
	
	public void ajouterPomme(){
		totalPrice += 100;
	}
	
	public void ajouterCerise(){
		totalPrice += 75;
	}
	
	public void ajouterBanane(){
		totalPrice += 150;
	}
	
	public int getTotalPrice(){
		int 	reducCerise = 20,
				reducBanane = 150,
				reducApple = 100,
				reducMele = 50,
				reducPomme = 100,
				reducFruit = 200;
		
		return totalPrice - ceriseNumber / 2 * reducCerise - 
				bananeNumber / 2 * reducBanane -
				appleNumber / 3 * reducApple -
				meleNumber / 2 * reducMele -
				pommeNumber / 4 * reducPomme -
				fruitNumber / 5 * reducFruit;
	}
	
	
}
