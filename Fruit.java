package tp1;

public class Fruit {

	protected double price;
	protected double number;
	private int numberLimit;
	private String name;
	
	public Fruit(int pNum){
		number = pNum;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNumberLimit(){
		return numberLimit;
	}
	
	public void setNumber(double d){
		this.number = d;
	}
	
	public double getNumber(){
		return this.number;
	}
	
	public double getTotalPrice(){
		return this.number * this.price * 100;
	}
	
	public void setNumberLimit(int limit){
		numberLimit = limit;
	}
	
	public boolean isPossible(){
		return number < numberLimit;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setName(String pName) {
		name = pName;
	}

}
