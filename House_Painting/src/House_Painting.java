import java.util.Scanner;
public class House_Painting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input dimensions
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter in the length of the house: ");
		int house_Length= scan.nextInt();
		System.out.print("Enter in the width of the house: ");
		int house_Width= scan.nextInt();
		System.out.print("Enter in the height of the house: ");
		int house_Height= scan.nextInt();
		System.out.print("How many windows do you have: ");
		int window_num= scan.nextInt();
		System.out.print("Enter in the length of the window: ");
		int window_Length= scan.nextInt();
		System.out.print("Enter in the width of the window: ");
		int window_Width= scan.nextInt();
		System.out.print("How many doors do you have: ");
		int door_num= scan.nextInt();
		System.out.print("Enter in the length of the doors: ");
		int door_Length= scan.nextInt();
		System.out.print("Enter in the width of the doors: ");
		int door_Width= scan.nextInt();
		System.out.print("How much should the painter charge per square foot: ");
		double painter_charge= scan.nextDouble();
		
		//Computations
		int house_Area=house_Length*house_Width;
		int normal_Sides=(house_Area*2);
		double peak_Sides=(.5*(house_Length*(house_Height-house_Width))+(house_Area))*2;
		//double peak_Sides=((1/2)*(house_Length*(house_Height-house_Width))+(house_Area))*2;
		double house_Total=normal_Sides+peak_Sides;
		int win_Area= window_Length* window_Width;
		int win_Total= win_Area* window_num;
		int door_Area= door_Length* door_Width;
		int door_Total= door_Area* door_num;
		double SqFt=house_Total-(door_Total+win_Total);
		double final_Cost=SqFt*painter_charge;
		
		//Print result
		System.out.println("The amount of house is "+SqFt + " square ft");
		System.out.println("The painter will charge "+final_Cost + " for his services");
		
		
	}

}
