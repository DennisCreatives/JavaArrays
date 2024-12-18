public class JavaArrays {
    // Arrays in Java

    public static void main(String[] args) {
        // Arrays
        // Arrays in Java are objects that store multiple values of the same type.

        // Declaring and Initializing Arrays

        // To declare an array in Java, you need to specify the data type of the elements and the number of elements (size) the array can hold:

        // Syntax
        // dataType[] arrayName;
        // dataType arrayName[];

        // After declaring the array, you need to create an instance of the array using the new operator and specify the size:
        // arrayName = new dataType[size];

        // You can also declare and initialize an array in a single statement:
        // dataType[] arrayName = new dataType[size];

        // Examples:
        // declaring and initializing an array of integers:
        int[] numbers; // array declaration
        numbers = new int[5]; // initialization with size 5

        // declaration and initialization on one line
        int[] scores = new int[10];

        // You can also initialize an array with explicit values using the following syntax:
        // dataType[] arrayName = {value1, value2, value3, ..., valueN};

        // For example
        int[] myNumbers = {10, 20, 30, 40, 50};
        char[] vowels = {'a','e', 'i', 'o', 'u'};

        // Multi-dimensional Arrays
        // Java also supports multi-dimensional arrays, which are arrays of arrays. A two-dimensional array is like a matrix, with rows and columns.

        // To declare a two-dimensional array, you need to specify the number of dimensions:
        // dataType[][] arrayName;

        // You can initialize a two-dimensional array in several ways:
        // initialize with size
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns

        // initialize with values
        int[][] numberS = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Array Manipulation
        // Arrays in Java provide several useful methods and operations for manipulating their elements and performing common tasks. Here are some examples:

        // 1. Accessing Elements:
        // You can access individual elements of an array using their index:
        // arrayName[index_of_the_element_to_access];

        // Access the first element in myNumbers array
        int firstElement = myNumbers[0];
        System.out.println("The first element is: " + firstElement);

        // Access the third element in myNumbers array
        int thirdElement = myNumbers[2];
        System.out.println("The third element is: " + thirdElement);

        // 2. Modifying Elements
        // You can modify the value of an array element by assigning a new value to the corresponding index
        System.out.println("The first element before modification: " + firstElement);

        myNumbers[0] = 100;

        System.out.println("The first element after modification: " + myNumbers[0]);

        // 3. Getting the Length:
        // You can find the number of elements in an array using the length property:

    }
}
