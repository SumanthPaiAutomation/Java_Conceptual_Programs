package Random;

public class TwoCombArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6};
		int b[] = {7,8,9,10,11,12};
		int alen= a.length;
		int blen = b.length;
		int tlen = alen+blen;
		int pos =0;
		int comb[] = new int[tlen];
		for(int i=0;i<alen;i++) {
			comb[i]=a[i];
			pos++;
			
		}
		for(int j=0;j<blen;j++) {
			comb[pos]=b[j];
			pos++;
		}
		for(int k=0;k<tlen;k++) {
			System.out.println(comb[k]);
		}
	}

}
