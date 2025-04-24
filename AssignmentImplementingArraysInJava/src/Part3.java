/*
## Part 3: Traversing and Updating Arrays

You can traverse an array using a `for` loop, `for-each` loop, or while loop.

### Using a `for` Loop:
```
for (int i = 0; i < arrayName.length; i++) {

    System.out.println(arrayName[i]);

}
```
### Updating Array Elements:

You can update elements of an array using their index.

`arrayName[2] = 100;`

### Exercise:

1. Create an array of 5 integers.
2. Initialize the array with values.
3. Update the third element to a new value.
4. Print all elements of the array.

 */

public class Part3 {
    public static void main(String[] args) {

        // Create an array of 5 integers
        int[] arr = new int[5];

        // Initialize the array with values
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }

        // Update the third element to a new value.
        arr[2] = 123;

        // Print all elements of the array
        for (int num : arr) {
            System.out.println(num);
        }

    }
}
