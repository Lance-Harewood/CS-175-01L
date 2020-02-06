import java.util.*;
public class Car_Cost_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Cost of regular car:");
		double regCarCost=input.nextDouble();
		System.out.println("Enter Miles per gallon of regular car:");
		double regMiles=input.nextDouble();
		System.out.println("Enter Cost of hybrid car:");
		double hyCarCost=input.nextDouble();
		System.out.println("Enter Miles per gallon of hybrid car:");
		double hyMiles=input.nextDouble();
		System.out.println("Enter miles traveled in a year:");
		double yearlyMiles=input.nextDouble();
		System.out.println("Enter cost per gallon of gas:");
		double gasCost=input.nextDouble();
		
		double regYearly=gasCost*(yearlyMiles/regMiles);
		double hyYearly=gasCost*(yearlyMiles/hyMiles);
		
		double reg1Yr=regCarCost+regYearly*1;
		double hy1Yr=hyCarCost+hyYearly*1;
		double reg2Yrs=regCarCost+regYearly*2;
		double hy2Yrs=hyCarCost+hyYearly*2;
		double reg3Yrs=regCarCost+regYearly*3;
		double hy3Yrs=hyCarCost+hyYearly*3;
		double reg4Yrs=regCarCost+regYearly*4;
		double hy4Yrs=hyCarCost+hyYearly*4;
		double reg5Yrs=regCarCost+regYearly*5;
		double hy5Yrs=hyCarCost+hyYearly*5;
		
		System.out.println("Cost to own after year 1 for regular car:"+reg1Yr+" for hybrid car:"+hy1Yr);
		System.out.println("Cost to own after year 2 for regular car:"+reg2Yrs+" for hybrid car:"+hy2Yrs);
		System.out.println("Cost to own after year 3 for regular car:"+reg3Yrs+" for hybrid car:"+hy3Yrs);
		System.out.println("Cost to own after year 4 for regular car:"+reg4Yrs+" for hybrid car:"+hy4Yrs);
		System.out.println("Cost to own after year 5 for regular car:"+reg5Yrs+" for hybrid car:"+hy5Yrs);
		
		if(reg5Yrs<hy5Yrs) {
			System.out.println("The regular car pays itself back after 5 years");
		}
		else {
			System.out.println("The hybrid car pays itself back after 5 years");
		}
		
	}

}
