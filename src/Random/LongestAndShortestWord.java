package Random;

public class LongestAndShortestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
		String [] wordArray=string.split(" ");
		int max=0;
		int min=wordArray[0].length();
		for(String ele: wordArray) {
			if(ele.length()>max) {
				max=ele.length();
			}
		}
		for(String ele: wordArray) {
			if(ele.length()<min) {
				min=ele.length();
			}
		}
		System.out.println(max);
		System.out.println(min);
		for(String ele : wordArray) {
			if(ele.length()==max) {
				System.out.println(ele);
			}
			if(ele.length()==min) {
				System.out.println(ele);
			}
		}
		//
	}

}
