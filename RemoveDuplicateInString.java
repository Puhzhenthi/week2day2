package week2.day2.assignment;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String str="I Am a Civil Engineer";
		String[] A = str.split("");
		int count=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i].equals(A[j])) {
				count =count+1;
				}
			if (count<=1) {
				A[j]=A[j].replace(A[i], "");
				
			}
		System.out.print(""+A[i]+"");
			}
		}
	}

}
