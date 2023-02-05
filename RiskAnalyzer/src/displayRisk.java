
public class displayRisk {
	public static void showIndicator(symptoms newSymp, symptoms prevSymp) {
		
		int diff = newSymp.sympArr[22] - prevSymp.sympArr[22];
		int sevScore = newSymp.sympArr[23] - prevSymp.sympArr[23];
		
		if(diff < 3 && sevScore <10) {
			System.out.println("No difference\n");
		}
		else if(diff < 3 && sevScore < 15) {
			System.out.println("Unsure\n");
		}
		else {
			System.out.println("Very different\n");
		}
	}
}
