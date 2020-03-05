import java.util.*;	
public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter in the the cost of your groceries.");
		System.out.println("Or enter in 0 to stop the program");
		Scanner input=new Scanner(System.in);  
		double discount=0;
		
		double cost=input.nextDouble();
		
		if(cost<10)
		{System.out.println("You are not eligible for a coupon at this time.");}
		else if(cost>=10 && cost<=60)
		{discount=.08;
		double percent=discount*100;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f (%.0f%% of your purchase) \n",coupon,percent);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);}
		else if(cost>60 && cost<=150)
		{discount=.10;
		double percent=discount*100;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f (%.0f%% of your purchase) \n",coupon,percent);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);}
		else if(cost>=150 && cost<=210)
		{discount=.12;
		double percent=discount*100;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f (%.0f%% of your purchase) \n",coupon,percent);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);}
		else 
		{discount=.14;
		double percent=discount*100;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f (%.0f%% of your purchase) \n",coupon,percent);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);}
		}
	}


