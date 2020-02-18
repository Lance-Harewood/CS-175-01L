import java.util.Scanner;

public class Car_Decision_2 {

public static void main(String[] args) {
// TODO Auto-generated method stub

	Scanner input= new Scanner(System.in);
	System.out.println("Enter the name, cost, and miles per gallon of a regular car:");
	String regSpecs=input.nextLine();
	System.out.println("Enter the name, cost, and miles per gallon of a hybrid car:");
	String hySpecs=input.nextLine();
	
	String regCarName=regSpecs.substring(0,14);
	String regCarCost=regSpecs.substring(15,20);
	String regMiles=regSpecs.substring(21,23);
	int regCarCost$ = Integer.parseInt(regCarCost);
	int regMiles$ = Integer.parseInt(regMiles);
	
	String hyCarName=hySpecs.substring(0,12);
	String hyCarCost=hySpecs.substring(13,18);
	String hyMiles=hySpecs.substring(19,21); 
	int hyCarCost$ = Integer.parseInt(hyCarCost);
	int hyMiles$ = Integer.parseInt(hyMiles);
	
	System.out.println("Enter miles traveled in a year:");
	double yearlyMiles=input.nextDouble();
	System.out.println("Enter cost per gallon of gas:");
	double gasCost=input.nextDouble();
	
	double regYearly=gasCost*(yearlyMiles/regMiles$);
	double hyYearly=gasCost*(yearlyMiles/hyMiles$);
	
	double reg1Yr=regCarCost$+regYearly*1;
	double hy1Yr=hyCarCost$+hyYearly*1;
	double reg2Yrs=regCarCost$+regYearly*2;
	double hy2Yrs=hyCarCost$+hyYearly*2;
	double reg3Yrs=regCarCost$+regYearly*3;
	double hy3Yrs=hyCarCost$+hyYearly*3;
	double reg4Yrs=regCarCost$+regYearly*4;
	double hy4Yrs=hyCarCost$+hyYearly*4;
	double reg5Yrs=regCarCost$+regYearly*5;
	double hy5Yrs=hyCarCost$+hyYearly*5;
	
	System.out.println("Cost to own "+regCarName+" after year 1: $"+reg1Yr+" and for "+hyCarName+": $"+hy1Yr);
	System.out.println("Cost to own "+regCarName+" after year 1: $"+reg2Yrs+" and for "+hyCarName+": $"+hy2Yrs);
	System.out.println("Cost to own "+regCarName+" after year 1: $"+reg3Yrs+" and for "+hyCarName+": $"+hy3Yrs);
	System.out.println("Cost to own "+regCarName+" after year 1: $"+reg4Yrs+" and for "+hyCarName+": $"+hy4Yrs);
	System.out.println("Cost to own "+regCarName+" after year 1: $"+reg5Yrs+" and for "+hyCarName+": $"+hy5Yrs);
	
	if(reg5Yrs<hy5Yrs) 
	{System.out.println("The regular car pays itself back after 5 years");}	
	else if(reg5Yrs==hy5Yrs)
	{System.out.println("The prices are equal!");}
	else
	{System.out.println("The hybrid car pays itself back after 5 years");}
}

}
