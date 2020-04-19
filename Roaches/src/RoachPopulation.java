
public class RoachPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	double roach;
	double breedRoach;
	double sprayRoach;
	int percent;
	int cycle;
	public RoachPopulation(int roachNum) {
		roach=roachNum;
		System.out.println("The Initial Roach population is "+(int)roach);
	}
	public void breed() {
		roach*=2;
		breedRoach=roach;
		cycle++;
	}
	public void spray(int killPercent) {
		percent=killPercent;
		roach-=((roach*(killPercent*.01)));
		roach=Math.round(roach);
		sprayRoach=roach;
	}
	public void getRoaches() {
		System.out.println("The Roach population after cycle "+cycle+" of breeding is "+(int)breedRoach);
		System.out.println("The Roach population after cycle "+cycle+" at "+percent+"% spraying is "+(int)sprayRoach);
	}
}
