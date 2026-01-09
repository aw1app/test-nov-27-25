import java.util.ArrayList;
import java.util.List;

import com.sl.staff.Doctor;

public class App {

	public static void main(String[] args) {
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		
		Doctor d1 = new Doctor("Ramesh", 25, 1000000, "MBBS(London)", true);
		Doctor d2 = new Doctor("Suresh", 35, 1700000, "MBBS(Paris)", false);
		Doctor d3 = new Doctor("Rasika", 20, 1060000, "MBBS(Moscow)", true);
		Doctor d4 = new Doctor("Tulsi", 33, 1100000, "MBBS(Delshi)", false);
		
		doctors.add(d1);
		doctors.add(d2);
		doctors.add(d3);
		doctors.add(d4);
		
//		for(int i=0; i< doctors.size(); i++) {
//			System.out.println("Found doctor at position i "+ i);
//		}
		
		for(Doctor d: doctors) {
			System.out.println("Found doctor  "+ d.name);
		};
		
//		System.out.println("Removing doctor d3(Rasika)");
//		doctors.remove(d3);
//		for(Doctor d: doctors) {
//			System.out.println("Found doctor  "+ d.name);
//		};
		
		doctors.sort( (doc1,doc2) -> (int) (doc1.getSalary()- doc2.getSalary()) );
		System.out.println("\n Doctors list after sorting them according to saary");
		for(Doctor d: doctors) {
			System.out.println("Found doctor  "+ d.name + " salary = "+ d.getSalary());
		};
		

	}

}
