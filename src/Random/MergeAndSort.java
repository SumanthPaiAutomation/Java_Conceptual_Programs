package Random;
import java.util.Arrays;

public class MergeAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {16,17,18};
		int b[]= {1,2,3,19,26,28};
		int totlen =a.length+b.length;
		int totarr[] = new int[totlen];
		int pos =0;
		for(int i=0;i<a.length;i++) {
			totarr[pos]=a[i];
			pos++;
		}
		for(int i=0;i<b.length;i++) {
			totarr[pos]=b[i];
			pos++;
		}
		for(int i=0;i<totarr.length;i++) {
			System.out.println(totarr[i]);
		}
		//bubble sort
		/*
		 * for(int i=0;i<totarr.length-1;i++) { if(totarr[i]>totarr[i+1]) { int temp =
		 * totarr[i]; totarr[i]=totarr[i+1]; totarr[i+1]=temp; } }
		 * System.out.println("after merge sort"); for(int i=0;i<totarr.length;i++) {
		 * System.out.println(totarr[i]); }
		 */
		 Arrays.sort(totarr); 
		  
	        System.out.printf("Modified arr[]", 
	                          Arrays.toString(totarr)); 
	}

}
