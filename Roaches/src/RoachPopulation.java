
public class RoachPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	double roach;
	int cycle;
	public RoachPopulation(int roachNum) {
		roach=roachNum;
		System.out.println("The Initial Roach population is "+(int)roach);
	}
	public void breed() {
		roach*=2;
		cycle++;
		System.out.println("The Roach population after cycle "+cycle+" breeding is "+(int)roach);
	}
	public void spray(int killPercent) {
		roach-=((roach*(killPercent*.01)));
		roach=Math.round(roach);
		System.out.println("The Roach population after cycle "+cycle+" "+killPercent+" spraying is "+(int)roach);
	}
	public int getRoaches() {
		return (int) (roach);
	}
}
