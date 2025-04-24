/*
## Part 2: Declaring and Initializing Arrays

### Declaration:

To declare an array in Java, you specify the data type of its elements followed by square brackets `[]` and the array name.

`int[] arrayName;`

### Initialization:

You can initialize an array at the time of declaration or later in your code.
```
// At the time of declaration

int[] arrayName = new int[5];

// Later in the code

arrayName = new int[5];

Combining Declaration and Initialization:

int[] arrayName = {1, 2, 3, 4, 5};
```
### Exercise:

Declare and initialize an array of 5 double values. Assign values to each element and print them.

 */

public class Part2 {
    public static void main(String[] args) {

        // Declare amd Initialize an array of 5 double values
        double[] arr = {5,4,3,2,1}; // Values assigned

        // Print all values stored in the array
        for (double num : arr) {
            System.out.println(num);
        }
    }
}