package Random;

public class MaxOccureneceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bb = "aaaaabbcc";
		char[] btoa = bb.toCharArray();
		int visited =-1;
		int count =1;
		int fr[] = new int[bb.length()];
		
		for(int i=0;i<btoa.length-1;i++) {
			fr[i]=1;
			if(btoa[i]==btoa[i+1]) {
				//count++;
				//not to visit it again
				fr[i]++;
				btoa[i]='0';
				
			}
			
		
		
	}
		for(int i=0;i<fr.length;i++) {
			if(btoa[i]!='0' && btoa[i]!='0') {
				System.out.println(btoa[i]+" "+fr[i]);
			}
		}
	}
	
}

