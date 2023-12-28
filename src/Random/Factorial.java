package Random;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4! = 4*3*2*1
		//6! = 6*5*4*3*2*1 
		int mul=1;
		for(int i=6;i>0;i--) {
			mul*=i;
		}
		System.out.println(mul);
	}

}
