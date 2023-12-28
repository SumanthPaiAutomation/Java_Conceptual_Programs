package Random;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal = "mumbai";
		String t ="";
		for(int i = pal.length()-1;i>=0;i--) {
			t = t+pal.charAt(i);
		}
		System.out.println(t);
	}

}
