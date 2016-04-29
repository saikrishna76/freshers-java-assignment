package shopping_cart;

public class Customer_details {
	private String name;
	private int age;
	private String typeofshopper;
	private String shoppingtype;
	private int phoneno;
	public Customer_details(String name, int age, String typeofshopper, String shoppingtype,
			int phoneno) {
		
		this.name = name;
		this.age = age;
		this.typeofshopper = typeofshopper;
		this.shoppingtype = shoppingtype;
		this.phoneno =phoneno ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTypeofshopper() {
		return typeofshopper;
	}
	public void setTypeofshopper(String typeofshopper) {
		this.typeofshopper = typeofshopper;
	}
	public String getShoppingtype() {
		return shoppingtype;
	}
	public void setShoppingtype(String shoppingtype) {
		this.shoppingtype = shoppingtype;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int timingPreference) {
		this.phoneno = phoneno;
	}

	public void display(){
		System.out.println(getAge());
		System.out.println(getName());
		System.out.println(getTypeofshopper());
		System.out.println(getShoppingtype());
		System.out.println(getPhoneno());
	}

}
