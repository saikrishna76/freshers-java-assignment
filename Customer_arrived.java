package shopping_cart;
import java.util.Date;
public class Customer_arrived 
	implements Runnable {

		@Override
		public void run() {
		System.out.println("Cart Taken");
		Date d=new Date();
		System.out.println(d);
		}
}
