package HospitalApp;

import java.util.Scanner;
// Creates the patients details class
public class PatientDetails {

	String name;
	int age;
	char gender;
	double weight;
	double bPressure;


//Defines the scanner input for the patient details input and the methods to get the patient details
		Scanner input = new Scanner(System.in);

		//Getter method for patients name
			public  String getName(String name){
				this.name =name;
				System.out.println("Patient's Name: ");
				name = input.next();
				return name;
			}

		//Getter method for patients age
			public int getAge(int age){
				this.age = age;
				System.out.println("Patient's age: ");
				age= input.nextInt();
				return age;
			}

		//Getter method for Patients gender
			public char getGender(char gender){
				this.gender = gender;
				System.out.println("Patient's gender (M/F): ");
				gender = input.next().charAt(1);
				return gender;
			}

		//Getter method for patients weight
			public double getWeight(double weight){
				this.weight = weight;
				System.out.println("Weight of the patient: ");
				weight = input.nextDouble();
				return weight;
			}

		//Getter method for patients blood pressure.
			public double getBloodPressure(double bp){
				this.bPressure = bp;
				System.out.println("Blood pressure of the patiet: ");
				bp = input.nextDouble();
				return bp;
			}
	}
