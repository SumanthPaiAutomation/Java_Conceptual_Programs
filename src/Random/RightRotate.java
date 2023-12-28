package Random;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		//right roate by 3;
		int n=3;
		System.out.println("Original array :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int j,last ;
			last = a[a.length-1];
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j--];
			}
			a[0]=last; // for first element put last
		}
		System.out.println("After roatation : ");
		for(int it=0;it<a.length;it++) {
			System.out.println(a[it]+" ");
		}
	}

}
