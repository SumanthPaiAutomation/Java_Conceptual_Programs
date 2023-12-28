package Random;

public class NoStringSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello how are you";
		char strp[] = str.toCharArray();
		String reverse="";
		for(char strr: strp) {
			if(strr!=' ') {
				reverse+=strr;
			}
			
		}
		System.out.println(reverse);
	}

}
