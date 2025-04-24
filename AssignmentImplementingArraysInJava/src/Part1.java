/*
## Part 1: Understanding Arrays

What is an Array?

An array is a collection of variables of the same type, stored in a contiguous memory location. It can hold multiple values in a single variable, which makes it easier to manage large amounts of data.

### Key Points:

Fixed Size:
- The size of an array is defined when it is created and cannot be changed.

Indexed Access:
- Array elements are accessed using their index, which starts from 0.

Example:
```
// Declare an array of integers

int[] numbers;

// Initialize the array with 5 elements

numbers = new int[5];

// Access and assign values to array elements

numbers[0] = 10;

numbers[1] = 20;

numbers[2] = 30;

numbers[3] = 40;

numbers[4] = 50;

// Print the first element of the array

System.out.println(numbers[0]); // Output: 10
 */

import java.util.Arrays;

public class Part1 {
    public static void main(String[] args) {

        // Declare an array of integers
        int[] numbers;

        // Initialize the array with 5 elements
        numbers = new int[5];

        // Access and assign values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the first element of the array
        System.out.println(numbers[0]);
    }
}
