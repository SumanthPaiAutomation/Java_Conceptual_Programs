package Random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringNotVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arrStr = {"plxplx","orbit","lhgtf","mansion","roller"};
		String []nonVow=new String [2];
		String [] vow= new String [3];
		ArrayList<String> vowel = new ArrayList<String>();
		Set<String> marv = new HashSet<String>();
		for(String str : arrStr) {
			int totLength = str.length();
			for(int i=0;i<totLength;i++) {
				//System.out.println(str.charAt(i));
				
				if(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")) {
					marv.add(str);
				}
				/*
				 * else { nonVow[i]=str; }
				 */
			}
			}
		
			/*
			 * for(int i=0;i<nonVow.length;i++) { System.out.println(" "+nonVow[i]); }
			 */
			for (String stro : marv) {
				System.out.println(stro);
			}
	}

}
//learn to convert arraylist to set , set to array list , arraylist to array ,array to arraylist, set to array ,array to set
