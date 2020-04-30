import java.util.Scanner;
public class heatindex {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("                                                       NOAA's Nation Weather Service");
		System.out.println("                                                                 Heat Index");
		System.out.println("\n                                                               Temperature(F)");
		
		System.out.println("");
		System.out.print("                                     80");
		for(int temperature=82; temperature<=110; temperature+=2) {
			System.out.printf("   %3s", temperature);
		}
		System.out.println();
		System.out.println("Relative Humidity %");
		System.out.println("                            _____________________________________________________________________________________________________");
		for( int humidity=40; humidity<=100; humidity+=5) {
			System.out.printf("                           %3s | ", humidity);
			for( int T=80; T<=110; T+=2) {
				
			
			int total=(int)((-42.379+(2.04901523*T)+(10.14333127+humidity)-(0.22475541*T*humidity)-(.00683783*T*T)-(.05481717*humidity*humidity)+(.00122874*T*T*humidity)+(.00085282*T*humidity*humidity)-(.00000199*T*T*humidity*humidity)));
			if(total<=137) {
				System.out.printf("%6s", total);
			}
			else {
				System.out.printf("%6s", "");
			}
		}
			System.out.println();
	}
		boolean start=true;
		while(start=true) {
			System.out.print("Enter Temp or 0 to end: ");
			double tempValue=input.nextDouble();
			if(tempValue==0)
			{
		start=false;
		System.out.println("The program has ended");
		break;
		}
			System.out.println("Please enter the relative humidity: ");
			double humidValue=input.nextDouble();
			
			double totalValue=(int)((-42.379+(2.04901523*tempValue)+(10.14333127+humidValue)-(0.22475541*tempValue*humidValue)-(.00683783*tempValue*tempValue)-(.05481717*humidValue*humidValue)+(.00122874*tempValue*tempValue*humidValue)+(.00085282*tempValue*humidValue*humidValue)-(.00000199*tempValue*tempValue*humidValue*humidValue)));
			System.out.println("The THI for a temperature of "+tempValue+" and relative of "+humidValue+" is:"+totalValue);
			if (totalValue<=90) {
				System.out.println("ADVISORY: CAUTION");
			}
			else if (totalValue<=105) {
				System.out.println("ADVISORY: EXTREME CAUTION");
			}
			else if (totalValue<=126) {
				System.out.println("ADVISORY: DANGER");
			}
			else {
				System.out.println("ADVISORY: EXTREME DANGER");
			}	
		}	
	}
}
