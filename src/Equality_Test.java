import java.util.Arrays;

public class Equality_Test {
    public static void main (String[]args){
        int[] arr1  =new int [] {14,2,06};
        int [] arr2  = new int [] {27,10,17};
        int[] arr3   = new int[]{14,2,06};



            System.out.println("is arr1 equals to arr2:" + Arrays.equals(arr1,arr2));
        System.out.println("is arr1 equals to arr3;" + Arrays.equals(arr1,arr3));

    }

}
