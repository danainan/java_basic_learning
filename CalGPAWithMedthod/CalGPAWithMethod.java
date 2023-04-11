
public class CalGPAWithMethod {
	public static char calGrade(int score) {
		if (score >= 80) {
			return 'A';
		} else if (score >= 70) {
			return 'B';
		} else if (score >= 60) {
			return 'C';
		} else if (score >= 50) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {

		int scores[] = { 98, 72, 65, 51, 49 };
		double units[] = { 1, 0.5, 1, 0.5, 1 };

		System.out.print("Subject ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("\t" + (i + 1));
		}
		System.out.print("\n=================================================== ");
		System.out.print("\nUnit      ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("\t" + units[i]);
		}
		System.out.print("\nScore     ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("\t" + scores[i]);
		}
		System.out.print("\nGrade     ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("\t" + calGrade(scores[i]));

		}
		System.out.print("\n=================================================== ");
		double sumUnit = 0;
		double sumScore = 0;
		for (int i = 0; i < scores.length; i++) {
			sumUnit += units[i];
			if (calGrade(scores[i]) == 'A') {
				sumScore += 4 * units[i];
			} else if (calGrade(scores[i]) == 'B') {
				sumScore += 3 * units[i];
			} else if (calGrade(scores[i]) == 'C') {
				sumScore += 2 * units[i];
			} else if (calGrade(scores[i]) == 'D') {
				sumScore += 1 * units[i];
			} else {
				sumScore += 0 * units[i];
			}

		}
		System.out.print("\nGPA = " + (sumScore / sumUnit));

	}
}