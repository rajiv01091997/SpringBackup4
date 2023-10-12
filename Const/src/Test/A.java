package Test;

public class A {

	private int id;
	private String name;
	public A() {
		super();
		System.out.println("default constructor A");
	}
	public A(int id, String name) {
		super();
		System.out.println("parameterised constructor called A");
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
