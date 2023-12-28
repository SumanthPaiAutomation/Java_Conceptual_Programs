package Random;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String some = "aaabbcccdef";
		char charArr[] = some.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			int count =1;
			for(int j=i+1;j<charArr.length-1;j++) {
				if(charArr[j]==charArr[j+1]) {
					count++;
					charArr[j]='\0';
				}
			}
			if(charArr[i]!='\0'&&count>1) {
				System.out.println(charArr[i]);
			}
		}
	}

}
