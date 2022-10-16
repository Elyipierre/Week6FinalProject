package Week6FinalProject;

public class Card {
	
	//create the following class fields of  value and name fields. 
	//value (contains a value from 2-14 representing cards 2-Ace)
	//name (e.g. Ace of Diamonds, or Two of Hearts)
	
	private String name;
	private int value;
	
	public Card (String name, int value) {
		this.name = name;
		this.value = value;
	
	}
	
	//getter and setter methods
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public String describe() {
		
		return name;
	}
}