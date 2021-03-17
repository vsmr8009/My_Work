package practise;

import java.util.*;

public class Main {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no of products to be carted");

		int n=sc.nextInt();

		OrderLineItem oli[]=new OrderLineItem[n];

		for(int i=0;i<n;i++) {

			System.out.println("Enter the Item id");

			String itemId=sc.next();

			System.out.println("Enter the Item name");

			String name=sc.next();

			System.out.println("Enter the item cost per quantity");

			double icq=sc.nextDouble();

			System.out.println("Enter the Quantity");

			int q=sc.nextInt();

			oli[i]=new OrderLineItem(itemId, name, icq, q);

		}

		CartService obj=new CartService();

		System.out.println("The no of Bulk items among the given items are:");

		System.out.println(obj.countOfBulkOrderLineitems(oli));

		System.out.println("The total order Amount is ");

		double toa=obj.calculateOrderTotalAmount(oli);

		System.out.println(toa);

		System.out.println("Total discount is");

		double discount=obj.calculateDiscount(toa);

		System.out.println(discount);

		System.out.println("Amount to be paid is:");

		System.out.println(toa-discount);
		sc.close();
	
	}
}











