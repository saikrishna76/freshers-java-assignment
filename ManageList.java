package shop;
import java.util.ArrayList;
import java.util.Scanner;
public class ManageList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		boolean keepGoing = true;
		int choice = 0;
		int input = 0;
		int index=0;
		int total = 0;
		Integer item;

		while(keepGoing)
		{
		System.out.println("\nMenu - Shopping Cart Options");
		System.out.println("1 add an item to the cart");
		System.out.println("2 remove an item from the cart");
		System.out.println("3 view the items in the cart");
		System.out.println("4 Exit and check-out");
		System.out.println("5 Empty the cart");
		System.out.println("6 Exit");
		System.out.println("Select a menu option");
		choice = scan.nextInt();
		if (choice <1 || choice >6)
		{
		System.out.println("Enter a value between 1 and 6:");
		}
		else
		{
		switch (choice)
		{
		case 1:
		//add an integer
		System.out.println("Enter an item you want:");
		input = scan.nextInt();
		item = new Integer(input);
		intList.add(item);
		//intList.add(input);
		break;
		case 2:
		//remove from the list
		System.out.println("Enter and item to remove:");
		input = scan.nextInt();
		item = new Integer(input);
		if (intList.contains(item))
		{
		intList.remove(item);
		System.out.println(item + " has been removed.");
		}
		else
		{
		System.out.println(item + " was not found in your shopping cart.");
		}
		break;
		case 3:
		//view the items in your cart
		System.out.println(intList);
		break;
		case 4:
		//Exit and add up the total
		for (int i = 0; i<intList.size(); i++)
		{
		item = intList.get(i);
		total = total + item.intValue();
		}
		System.out.println("Total is "+ total);
		System.out.println("Goodbye");
		keepGoing = false;
		break;
		case 5:
		//Empty the list
		intList.clear();
		break;
		case 6:
		//exit
		keepGoing = false;
		System.out.println("Goodbye");
		break;

		}
		}	
		}
		}
		}
		