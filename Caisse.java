package tp1bis;

import java.util.Scanner;

public class Caisse {

	private Scanner reader;
	private int totalPrice = 0;
	private int ceriseNumber = 0;
	
	public Caisse(){
		 reader = new Scanner(System.in);
	}
	
	public String ajouter(){
		String resp = reader.nextLine();
		System.out.println(resp);
		return resp;
	}
	
	public void ajouter(String toAdd){
		if (toAdd.equals("Pommes")){
			ajouterPomme();
		}
		if (toAdd.equals("Cerises")){
			ceriseNumber += 1;
			ajouterCerise();
		}
		if (toAdd.equals("Bananes")){
			ajouterBanane();
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
		int reducCerise = 20;
		return totalPrice - (ceriseNumber / 2 * reducCerise);
	}
	
	
}
