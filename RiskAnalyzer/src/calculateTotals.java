
public class calculateTotals {
	//calculate scores and store symptoms
		public static void runTotals(symptoms mySymp) {
			for(int i = 0; i < 22; i++) {
				
				int val = mySymp.sympArr[i];
				//Update the number of symptoms if the value is greater than 0
				if(val > 0) {
					mySymp.sympArr[22]++;
				}
				//Add the severity of each symptom to the total
				mySymp.sympArr[23] += val;
			}
		}
}
