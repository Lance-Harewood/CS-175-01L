import java.util.Scanner;

public class GroceryDiscount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter in the the cost of your groceries.");
		System.out.println("Or enter in 0 to stop the program");
		Scanner input=new Scanner(System.in);  
		boolean going=true;
		double discount=0;
		double cost;
		
		cost=input.nextDouble();
		while(going==true) {
		
		if(!input.hasNextDouble())
		{System.out.println("This is not an appropriate price!");
		break;}
		else if(cost==0)           
		{System.out.println("You have quit the program!");going=false;}
		else if(cost>1000||cost<10&&cost!=0)           
		{System.out.println("Your price is not between $10 and $1000");
		System.out.println("Enter in another price or press 0 to end program.");
		cost=input.nextDouble();}
		else if(cost>=10 && cost<=60)
		{discount=.08;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f\n",coupon);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);
		System.out.println("Enter in another price or press 0 to end program.");
		cost=input.nextDouble();}
		else if(cost>60 && cost<=150)
		{discount=.10;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f\n",coupon);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);
		System.out.println("Enter in another price or press 0 to end program.");
		cost=input.nextDouble();}
		else if(cost>=150 && cost<=210)
		{discount=.12;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f\n",coupon);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);
		System.out.println("Enter in another price or press 0 to end program.");
		cost=input.nextDouble();}
		else 
		{discount=.14;
		double coupon=cost*discount;
		double newPrice=cost-(cost*discount);
		System.out.printf("The value of the coupon is $%.2f\n",coupon);
		System.out.printf("The new discounted price is $%.2f\n",newPrice);
		System.out.println("Enter in another price or press 0 to end program.");
		cost=input.nextDouble();}
		}
	}
}


