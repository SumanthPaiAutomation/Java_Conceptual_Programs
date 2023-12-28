package Random;

public class NEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 equal parts aaaaabbbbbccccc
		int n=3;
		String str ="aaaaabbbbbccccc";
		int temp=0;
		String eqlParts[]=new String[str.length()]; 
		//use concept of substring;
		int length = str.length();
		int jump=length/n;
		for(int i=0;i<str.length();i=i+jump) {
			eqlParts[temp]=str.substring(i,i+jump);
			temp++;
		}
		for(int i=0;i<temp;i++) {
			System.out.println(eqlParts[i]+" ");
		}
	}

}
