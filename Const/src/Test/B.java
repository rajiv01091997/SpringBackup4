package Test;

public class B extends A{
	
	private int price;

	public B() {
		super();
		System.out.println("default constructor of B");
		
	}

	public B(int price) {
		super();
		System.out.println("param constructor of B");
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	

}
