package Random;

public class EasyBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {43,67,9,12,88};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
		
	}

}
