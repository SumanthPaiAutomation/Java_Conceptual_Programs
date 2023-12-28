package Random;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,3,4,1,6,7,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {// > is asc ,  < is dsc
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        for (int j : a) {
            System.out.println(j);
        }
	}

}
