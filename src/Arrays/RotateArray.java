package Arrays;

public class RotateArray {

    private static int[] leftRotateArray(int[] a, int k) {
        int[] output = new int[a.length];
        int size = a.length;

        if (a.length == 0) {
            System.out.println("Empty array");
            return output; // returning an empty array as a placeholder
        }

        for (int i = 0; i < a.length; i++) {
            output[(i - k + size) % size] = a[i];
        }

        return output;
    }
    public static int[] rightRotateArray(int [] arr,int k){
        int[]outputArray = new int[arr.length];
        int size = arr.length;

        for(int i=0;i<arr.length;i++){
            outputArray[(i+k)%size]=arr[i];
        }

        return outputArray;
    }
    public static void main(String[] args) {
        int []orginalArrayRight=new int[]{11, 22, 33, 44, 55};
        int []orginalArrayLeft=new int[]{61, 62, 63, 64, 65};
        int[] rightresult = RotateArray.rightRotateArray(orginalArrayRight,2);
        int[] leftresult=RotateArray.leftRotateArray(orginalArrayLeft,2);
        System.out.println("\nOriginal array for Right Rotation :");
        for(int c : orginalArrayRight){
            System.out.print(c+",");
        }
        //// transition from last index towards first index
        System.out.println("\nRight Rotated :");
        for(int c : rightresult){
            System.out.print(c+",");
        }

        System.out.println("\nOriginal array for Left Rotation :");
        for(int c : orginalArrayLeft){
            System.out.print(c+",");
        }
        //// transition from first index towards last index
        System.out.println("\nLeft Rotated :");
        for(int c : leftresult){
            System.out.print(c+",");
        }
    }
}
