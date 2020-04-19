
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoachPopulation bugs=new RoachPopulation(10);
		bugs.breed();
		bugs.spray(50);
		bugs.getRoaches();
		bugs.breed();
		bugs.spray(60);
		bugs.getRoaches();
		bugs.breed();
		bugs.spray(70);
		bugs.getRoaches();
		bugs.breed();
		bugs.spray(80);
		bugs.getRoaches();
	}

}
