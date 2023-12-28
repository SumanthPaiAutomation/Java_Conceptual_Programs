package Random;

public class MaxDiffAdj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxdiff =0;
		int a[]= {1,2,4,603,10,6,8,20};
		/*
		 * for(int i=0 ;i<a.length-1;i++) { for(int j=i+1;j<a.length;j++) { int diff =
		 * Math.abs(a[i]-a[j]); if(diff>maxdiff) { maxdiff = diff; } } }
		 */
		int maxnumOne=0;
		int maxnumTwo=0;

//		for(int i=0;i<a.length-1;i++) {
//			maxnumOne=a[i+1];
//			maxnumTwo=a[i];
//			int diff= Math.abs(maxnumOne-maxnumTwo);
//			if(diff>maxdiff) {
//				maxdiff=diff;
//
//			}
//		}
		for(int i=0;i<a.length-1;i=i+2){
			for(int j=i+1;j<a.length;j=j+2){
				maxnumOne=a[i];
				maxnumTwo=a[j];
				int diff= Math.abs(maxnumTwo-maxnumOne);
					if(diff>=maxdiff) {
					maxdiff=diff;

					}
			}
		}
		System.out.println(maxdiff+" for numbers : "+maxnumOne+" "+maxnumTwo);
//		int b[]= {1,2,4,3,10,6,8,8,9,0,12,45};
//		int maxlength = a.length>b.length?a.length:b.length;
//		System.out.println(maxlength);
	}
	
}
