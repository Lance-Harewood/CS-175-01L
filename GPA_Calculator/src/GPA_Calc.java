import java.util.Scanner;
public class GPA_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		double courseGradeLetterValue=0;
		int courseGradeHoursValue=0;
		int classes=0;
		int sum=0;
		double gradePts;
		double gradePtsCombined=0;
		double GPA=0;
		
		while(sum<10) {
		
		System.out.println("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit: ");
		String courseInfo=input.nextLine();
		
		if(courseInfo.equals("Q")||courseInfo.equals("q")){
			System.out.println("You have quit the program");
			break;}
		
		String [] parameters=courseInfo.split(",");
		String courseGradeHours=parameters[1];	
		String courseGradeLetter=parameters[2];
		
		if(courseGradeLetter.equals("A"))
		{courseGradeLetter="4.0";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("A-"))
		{courseGradeLetter="3.7";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("B+"))
		{courseGradeLetter="3.33";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("B"))
		{courseGradeLetter="3.0";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("B-"))
		{courseGradeLetter="2.7";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("C+"))
		{courseGradeLetter="2.3";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("C"))
		{courseGradeLetter="2.0";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("C-"))
		{courseGradeLetter="1.7";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("D+"))
		{courseGradeLetter="1.3";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("D"))
		{courseGradeLetter="1.0";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("D-"))
		{courseGradeLetter=".70";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("F")||courseGradeLetter.equals("WF"))
		{courseGradeLetter="0";
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);
		courseGradeLetterValue=Double.parseDouble(courseGradeLetter);}
		
		else if(courseGradeLetter.equals("P")||courseGradeLetter.equals("NP")||courseGradeLetter.equals("I")||courseGradeLetter.equals("W")) 
		{courseGradeLetter=null;
		courseGradeHoursValue=Integer.parseInt(courseGradeHours);}
		
		else
		{System.out.println("This is not a valid grade.");
		courseGradeLetter=null;
		courseGradeHoursValue=0;}
		
		classes++;
		sum+=courseGradeHoursValue;
		System.out.println(classes+ " classe(s) ");
		System.out.println(sum+ " credit(s) ");
		
		gradePts=courseGradeLetterValue*courseGradeHoursValue;	
		
		if(sum>10)
		{System.out.println("\nYou can only enter a maximum of 10 credits");
		classes--;
		sum-=courseGradeHoursValue;
		System.out.println(classes+ " classe(s) ");
		System.out.println(sum+ " credit(s)");
		gradePts=0;}
	
		gradePtsCombined+=gradePts;
		System.out.printf("Current Grade Points: %.2f\n\n",gradePtsCombined );
		
	}	
		GPA=gradePtsCombined/10;
		System.out.printf("\nYour GPA for the semester is a %.2f",GPA);
	}
}
