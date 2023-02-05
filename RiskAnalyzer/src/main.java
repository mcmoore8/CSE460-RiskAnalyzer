import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class main {

	public static void main(String[] args) {

		int entry = 0;
		Vector sympList = new Vector<symptoms>();
		Scanner s = new Scanner(System.in);
		
		// Initial menu for cmd UI
		while(entry != 4) {
			System.out.println("Please select one of the following options\n"
					+ "		1. Enter Symptoms\n"
					+ "		2. Display Symptom Summary\n"
					+ "		3. Am I at Risk\n"
					+ "		4. Exit\n"
					+ "Enter your choice(1-4)");
			entry = s.nextInt();
			
			//Option chosen to record a new symptom score
			if(entry == 1) {
				//Discard scores from beyond 4 games ago so after entry, there will be 5 max
				int numRecorded = sympList.size();
				while(numRecorded > 4) {
					sympList.remove(0);
					numRecorded = sympList.size();
				}
				
				//Get the new symptoms from the user
				symptoms tmpSymp = getSymptoms.getNewSymptoms();
				calculateTotals.runTotals(tmpSymp);
				sympList.add(tmpSymp);
			}
			
			//Option chosen to display the symptoms from the last game
			else if(entry ==2) {
				if(sympList.isEmpty()) {
					System.out.println("There is no history to display\n");
				}
				else {
					symptoms mySymp = (symptoms) sympList.get(sympList.size()-1);
					displaySymptoms.showSymp(mySymp);
				}
			}
			else if(entry ==3) {
				if(sympList.size() < 2) {
					System.out.println("Not enough symptom history to analyze\n");
				}
				else {
					symptoms tmpSymp1 = (symptoms) sympList.get(sympList.size()-1);
					symptoms tmpSymp2 = (symptoms) sympList.get(sympList.size()-2);
					displayRisk.showIndicator(tmpSymp1, tmpSymp2);
				}
			}
		}

	}

}
