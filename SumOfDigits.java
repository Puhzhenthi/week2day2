package week2.day2.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tes12Le79af65";
		int sum = 0;
		String R = str.replaceAll("\\D", "");
		char[] Array = R.toCharArray();
		for (int i = 0; i < Array.length; i++) {
			int num = Character.getNumericValue(Array[i]);
			sum = sum + num;
			System.out.println(sum);
		}
	}

}
