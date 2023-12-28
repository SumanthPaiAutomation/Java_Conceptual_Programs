package Random;

public class TotalCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringer = "The best of both worlds";
		String trimed = stringer.trim();
		System.out.println(trimed);
		char starr[] = trimed.toCharArray();
		int count=0;
		System.out.println("Total Char in string of String is "+starr.length);
		// below is correct
		for(char stcount:starr) {
			if(stcount!=' ') {
				count++;	
			}
			
		}
		System.out.println("count is "+count);
	}

}
