package Random;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,33,33,1,2,3,4,4,4,4,5,7,10};
		int fr[]=new int[a.length];
		int visited =-1;
		for(int i=0;i<a.length;i++) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		for(int k=0;k<a.length;k++) {
			if(fr[k]!=visited) {
				System.out.println("For Number : "+a[k]+" "+"Frequency is  : "+fr[k]);
			}
			
		}
	}

}
