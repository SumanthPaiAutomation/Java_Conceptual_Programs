package Random;

public class SumK {
    public static void main(String[] args) {
        int arr[]={32,13,1,5,3,8,9,12,45,17,10};
        //target 5,3,9 : 17 and 17 and 8,9 and 5,12
        int target=17;
        int start=0;
        int end=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                if(sum!=target){
                    start+=1;
                }
                if(sum==target){
                    end=i;
                    printSubArray(arr,start,end);
                }

        }


    }
    public static void printSubArray(int arrer[],int starter , int ender){
        System.out.print("[");
        for(int i=starter;i<=ender;i++){
            System.out.print(arrer[i]);
        }
        System.out.print("]");
    }

}
