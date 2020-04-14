
public class CounterTester {

	public static void main(String[] args) {
		Counter venue = new Counter();
		
		for(int count=0;count<=10;count++) {
			venue.click();	
			}
		for(int count=5;count>=0;count--) {
			venue.unclick();	
			}
		int result=venue.getValue();
		System.out.println("Expected venue:5");
		System.out.println("Actual venue:"+result);
		
		venue.reset();
		
		for(int count=0;count<=3;count++) {
			venue.click();	
			}
		for(int count=4;count>=0;count--) {
			venue.unclick();	
			}
		
		result=venue.getValue();
		System.out.println("Expected venue:-1");
		System.out.println("Actual venue:"+result);
		
	}

}
