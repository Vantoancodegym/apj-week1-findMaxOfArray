import java.util.Scanner;

public class FindMaxOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();
        while (size>20){
            System.out.println("please enter size <=20");
            size=input.nextInt();
        }
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter asset: ");
            myArray[i]=input.nextInt();
        }
        System.out.println(findMax(myArray));

    }
    public static String findMax(int[] arr){
        int max=arr[0];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return "Max asset is : "+max+" position in array is "+index;
    }
}
