package shopping_cart;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Products {
	static Customer_details c;
	static Use u;
		public void choice() throws IOException{
			System.out.println("enter your choice");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			switch(a){
			case 1:
				System.out.println("Mobile phones");
				break;
			case 2:
				System.out.println("Computers");
				break;
			case 3:
				System.out.println("Laptops");
				break;
			case 4:
				System.out.println("Tablets");
				break;
			}
		}
	public static void main(String[] args) throws IOException {
		Product_Details p1=new Product_Details();
		Product_Details p2=new Product_Details();
		Product_Details p3=new Product_Details();
		Product_Details p4=new Product_Details();
		Product_Details p5=new Product_Details();
		Product_Details p6=new Product_Details();
		Product_Details p7=new Product_Details();
		Product_Details p8=new Product_Details();
		Product_Details p9=new Product_Details();
		Product_Details p10=new Product_Details();
		Product_Details p11=new Product_Details();
		Product_Details p12=new Product_Details();
		
		p1.setItemcode("M001");
		p1.setItemcost(5000);
		p1.setItemtype("Mobiles phones");
		p1.setStock(20);
		p2.setItemcode("M002");
		p2.setItemcost(10000);
		p2.setItemtype("Mobile phones");
		p2.setStock(20);
		p3.setItemcode("M003");
		p3.setItemcost(15000);
		p3.setItemtype("Mobile phones");
		p3.setStock(20);
		p4.setItemcode("C001");
		p4.setItemcost(20000);
		p4.setItemtype("Computers");
		p4.setStock(15);
		p5.setItemcode("C002");
		p5.setItemcost(25000);
		p5.setItemtype("Computers");
		p5.setStock(10);
		p6.setItemcode("C003");
		p6.setItemcost(30000);
		p6.setItemtype("Computers");
		p6.setStock(5);
		p7.setItemcode("L001");
		p7.setItemcost(28000);
		p7.setItemtype("Laptops");
		p7.setStock(10);
		p8.setItemcode("L002");
		p8.setItemcost(29000);
		p8.setItemtype("Laptops");
		p8.setStock(8);
		p9.setItemcode("L003");
		p9.setItemcost(30000);
		p9.setItemtype("Laptops");
		p9.setStock(9);
		p10.setItemcode("T001");
		p10.setItemcost(8000);
		p10.setItemtype("Tablets");
		p10.setStock(15);
		p11.setItemcode("T002");
		p11.setItemcost(16000);
		p11.setItemtype("Tablets");
		p11.setStock(15);
		p12.setItemcode("T003");
		p12.setItemcost(29000);
		p12.setItemtype("Tablets");
		p12.setStock(5);
		 ArrayList<Product_Details> item=new ArrayList<Product_Details>();
		 item.add(p1);
		 item.add(p2);
		 item.add(p3);
		 item.add(p4);
		 item.add(p5);
		 item.add(p6);	 
		 item.add(p7);
		 item.add(p8);
		 item.add(p9);
		 item.add(p10); 
		 item.add(p11);
		 item.add(p12);
		for(Product_Details pi:item){
		System.out.println(pi.getItemcode());
		System.out.println(pi.getItemcost());
		System.out.println(pi.getItemtype());
		System.out.println(pi.getStock());
		
		c=new Customer_details("saikrishna", 21,"Heavy","Mobiles phones", 213673);
		u.Basic();
				c.display();
		 
		} }
}
