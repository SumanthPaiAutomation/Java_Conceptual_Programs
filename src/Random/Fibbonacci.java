package Random;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upto 8 
		int a =0;
		int b = 1;
		int i=1;
		int sum =0;
		while(i<9) {
			sum = a+b;
			a = b;
			b = sum ;
			
			System.out.println(sum);
			i++;
		}

	}

}
