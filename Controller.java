package HospitalApp;

import java.util.*;
public class Controller extends PatientDetails {

	public int countPatients(){
		int count=0;



		Controller myPatients = new Controller();
		char newP;
			do{
				@SuppressWarnings({ "resource" })
				Scanner input = new Scanner(System.in);
				System.out.println("New Patient (Y/N)? ");
				newP =  input.next().charAt(1);
				    if(newP == 'y' || newP == 'Y'){
				    		String nm = myPatients.getName(name);
				    		char gn = myPatients.getGender(gender);
				    		@SuppressWarnings("unused")
							int ag = myPatients.getAge(age);
				    		double wght = myPatients.getWeight(weight);
				    		double bprs = myPatients.getBloodPressure(bPressure);


				    GregorianCalendar date = new GregorianCalendar();
				    	int day, month, year, hour, min, sec;

				    	day = date.get(Calendar.DAY_OF_MONTH);
				    	month = date.get(Calendar.MONTH);
				    	year = date.get(Calendar.YEAR);
				    	hour = date.get(Calendar.HOUR_OF_DAY);
				    	min = date.get(Calendar.MINUTE);
				    	sec = date.get(Calendar.SECOND);


				    	System.out.println();
				    	System.out.println("*********************************************");
				    	System.out.println("Patients "+count+" Details");
				    	System.out.println("*********************************************");

				    	System.out.println("Name: "+nm);
				    	System.out.println("Gender: "+gn);
				    	System.out.println("Weight: "+wght+"Kg");
				    	System.out.println("Blood Pressure: "+bprs);
				    	System.out.println("Date visited: "+day+"."+month+"."+year);
				    	System.out.println("Time recorded: "+hour+"."+min+"."+sec);

				    	System.out.println("*********************************************");
				    	System.out.println();
				    	count++;
				    }
				    else {
				    	break;
				    }
			}
			while(newP == 'Y' || newP =='y');
			System.out.println((count) +"Patient(s) visited today");
			return count;
	}
}

