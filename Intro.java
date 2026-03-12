//Defination of Arrays:-
//List of elements of same type placed in contiguous memory locations is called an array.

public class Intro {
    public static void main(String[] args) {
        //Syntax of Array
        //data_type[] array_name = new data_type[size];
        int[] arr = new int[5]; //declaration and initialization of array
        arr[0] = 10; //assigning values to array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //Accessing elements of array
        System.out.println(arr[0]); //10
        System.out.println(arr[1]); //20
        System.out.println(arr[2]); //30
        System.out.println(arr[3]); //40
        System.out.println(arr[4]); //50

        //Length of array
        System.out.println("Length of array: " + arr.length); //5

        //Iterating through array using for loop
        System.out.println("Elements of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}