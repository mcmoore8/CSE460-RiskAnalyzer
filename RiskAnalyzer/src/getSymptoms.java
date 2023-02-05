import java.util.Scanner;

public class getSymptoms {
	public static symptoms getNewSymptoms() {
		Scanner s = new Scanner(System.in);
		int ans;
		symptoms mySymp = new symptoms();
		
		//gather data from user
		System.out.println("Please enter your headache score                  (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateHeadache(s.nextInt());
		
		System.out.println("Please enter your pressure in head score          (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updatePressure(s.nextInt());
		
		System.out.println("Please enter your neck pain score                 (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateNeckPain(s.nextInt());
		
		System.out.println("Please enter your nausea or vomiting score        (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateNausea(s.nextInt());
		
		System.out.println("Please enter your dizziness score                 (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateDizziness(s.nextInt());
		
		System.out.println("Please enter your blurred vision score            (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateBlurred(s.nextInt());
		
		System.out.println("Please enter your balance problems score          (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateBalance(s.nextInt());
		
		System.out.println("Please enter your sensitivity to light score      (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateLightSensitivity(s.nextInt());
		
		System.out.println("Please enter your sensitivity to noise score      (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateNoiseSensitivity(s.nextInt());
		
		System.out.println("Please enter your feeling slowed down score       (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateFeelingSlowedDown(s.nextInt());
		
		System.out.println("Please enter your feeling like \"in a fog\" score   (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateInAFog(s.nextInt());
		
		System.out.println("Please enter your \"don't feel right\" score        (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateDontFeelRight(s.nextInt());
		
		System.out.println("Please enter your difficulty concentrating score  (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateDifficultyConcentrating(s.nextInt());
		
		System.out.println("Please enter your difficulty remembering score    (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateDifficultyRemembering(s.nextInt());
		
		System.out.println("Please enter your fatigue or low energy score     (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateFatigue(s.nextInt());
		
		System.out.println("Please enter your confusion score                 (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateConfusion(s.nextInt());
		
		System.out.println("Please enter your drowsiness score                (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateDrowsiness(s.nextInt());
		
		System.out.println("Please enter your trouble falling asleep score    (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateTroubleFallingAsleep(s.nextInt());
		
		System.out.println("Please enter your more emotional score            (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateEmotional(s.nextInt());
		
		System.out.println("Please enter your irritability score              (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateIrritability(s.nextInt());
		
		System.out.println("Please enter your sadness score                   (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateSadness(s.nextInt());
		
		System.out.println("Please enter your nervous or anxious score        (none (0), mild (1-2), moderate (3-4), & severe(5-6):");
		mySymp.updateNervous(s.nextInt());
		
		return mySymp;
	}
}
