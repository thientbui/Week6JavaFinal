package JavaFinalProject;

public class Card {
	
	private int value;
	private String name;
	
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

	public Card(int value, String name) {
		this.value = value;
		this.name = name;
		}
	
	public String describe() {
		return this.value + " of " + this.name;
	}

	@Override
	public String toString() {
		return value + " of " + name;
	}
	



}