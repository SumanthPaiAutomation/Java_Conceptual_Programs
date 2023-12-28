package Random;

import java.util.ArrayList;

public class MatchinginTwoArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this only works for same length array
		int a[]= {1,2,3,5,6,7,8,9,10};
		int b[]= {90,90,90,90,8,9,10,90,90};
		int c[]= {19,21,34,24,23,8,870,12,67,89,9};
		ArrayList<Integer> matchList = new ArrayList<Integer>();
		int maxlength = a.length>b.length?a.length:b.length;
		for (int i=0 ;i<maxlength;i++) {
			if(a[i]==b[i]) {
				matchList.add(b[i]);
			}
		}
		int it = matchList.size();
		Object matches[] = matchList.toArray();
		for(int i=0;i<it;i++) {
			System.out.println(matches[i]);
		}
	}

}
