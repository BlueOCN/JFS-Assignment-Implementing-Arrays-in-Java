/*
## Part 4: Common Array Operations

### Finding the Length of an Array:

Use the `.length` property to get the number of elements in an array.

`int length = arrayName.length;`

### Exercise:

Write a program to:

1. Create an array of 10 integers.
2. Fill the array with multiples of 3.
3. Print the length of the array and all its elements.

 */


public class Part4 {
    public static void main(String[] args) {

        // Create an array of 10 integers.
        int[] arr = new int[10];

        // Fill the array with multiples of 3.
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i * 3;
        }

        // Print the length of the array
        System.out.println("Array length: " + arr.length);

        // Print all the elements on the array
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
