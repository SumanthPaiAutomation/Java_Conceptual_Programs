package Random;

public class TwoArrayComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7};
		int [] b = {8,9,10,11,10,12,15,18,5};
		for(int i =0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					System.out.println(b[j]);
				}
			}
		}
	}

}
