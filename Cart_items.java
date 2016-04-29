package shopping_cart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cart_items {
	public static void main(String[] args)throws Exception {
		int i=0,x,op,sum=0,m=0;
		String con="";
		int a[]=new int[10];
		int n[]=new int[10];
		String s[]={"Mobilephone(RS.5000)","Computer(RS.20000)",
		"Laptop(RS.30000)","Tablet(RS.8000)","Laptop(RS.29000)"};
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		do
		{
			System.out.println("Select items from the list:\n");
			System.out.println("1.Mobilephone\tRS.5000\n");
			System.out.println("2.Computer\tRS.20000");
			System.out.println("3.Laptop\tRS.30000");
			System.out.println("4.Tablet\tRS.8000");
			System.out.println("5.Laptop\tRS.29000");
			System.out.println("\nselect the item number:");
			x=Integer.parseInt(br.readLine());
		if(x<1||x>5)continue;
		a[i]=x;
		System.out.println("enter quantity:");
		n[i]=Integer.parseInt(br.readLine());
		i++;

		System.out.println("Add more Items?(y,n):");

		con=br.readLine();


		} while(con.equals("y"
				+ ""));

		m=i; // number of items


		System.out.println("\n 1. Check out \n 2. Cancel the order \n");

		System.out.println("Enter option:");

		op=Integer.parseInt(br.readLine());


		if(op==1)

		{

		System.out.println("==========================================");

		System.out.println("\nItem\tQuantity");

		System.out.println("==========================================");


		for(i=0;i!=m;i++)
		{

		if(a[i]==1)

		sum=sum+n[i]*5000;

		else if(a[i]==2)

		sum=sum+n[i]*20000;

		else if(a[i]==3)

		sum=sum+n[i]*30000;

		else if(a[i]==4)

		sum=sum+n[i]*8000;
		
		else if(a[i]==5)

		sum=sum+n[i]*29000;



		System.out.println("\n"+s[a[i]]+"\t"+n[i]);

		}

		System.out.println("==========================================");

		System.out.println("\nTotal Bill:"+sum);

		System.out.println("==========================================");

		}
		
		}
}
