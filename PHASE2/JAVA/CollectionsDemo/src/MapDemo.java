import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.sl.customers.Patient;

public class MapDemo {

	public static void main(String[] args) {
		// Create a collection of patient objects
		// and then create a patient directory by associating patient objects
		// with thier patient ID.
		
		Patient patient1 = new Patient("Shashi", 20, "High Fever", 1001);
		Patient patient2 = new Patient("Shisir", 50, "Headache", 1004);
		Patient patient3 = new Patient("Fazal", 55, "Migraine", 1033);
		Patient patient4 = new Patient("Suma", 21, "Body Pain", 1021);
		
		Map<Integer, Patient> patientMap = new HashMap<Integer, Patient>();
		
		patientMap.put(patient1.patientID, patient1);
		patientMap.put(patient2.patientID, patient2);
		patientMap.put(patient3.patientID, patient3);
		patientMap.put(patient4.patientID, patient4);
		
		// loop through the map
		for (Entry<Integer, Patient> entry : patientMap.entrySet()) {
			Integer key = entry.getKey();
			Patient pat =  entry.getValue();
			System.out.println(key + ": " + pat.name);
		}
		
		

	}

}
