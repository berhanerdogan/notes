// Arrays

// Array is a data structure that represents a collection of the same types of data.

// eg declaration -  datatype[] arrayRefVar;
double[] myList;

// creation
myList = new double[10];

// declare and create on on line
double[] myList2 = new double[10];

// declare, create and initialize on one step
double[] myList3 = {1.9, 2.9, 3.4, 3.5};

// datatype arrayRefVar[]; this style is also allowed but not preferred

// Length
// Once an array is created, its size is fixed. It cannot be
// changed. You can find its size using:
int length = myList.length; // returns 10
int length2 = myList2.length; // returns 10

// When an array is first declared, values are:
// 0 for the numeric primitive data types
// '\u0000' for chars
// false for booleans
// eg.
int x = myList[1]; // returns 0
int y = myList[2] // returns 0

// populate array with input
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.print("Enter" + myList.length + "values: ");
for (int i = 0; i < myList.length; i++){
    myList[i] = input.nextDouble();
};

// print the array
for (int i = 0; i < myList.length; i++) {
    System.out.print(myList[i] + " ");
}

// sum all elements
double total = 0;
for (int i = 0; i < myList.length; i++) {
    total += myList[i];
}

// random shuffling
for (int i = 0; i < myList.length -1; i++) {
    // generate random index
    int j = (int) (Math.random() * myList.length);

    // swap
    double temp = myList[i];
    myList[i] = myList[j];
    myList[j] = temp;
}


// shift elements
double temp = myList[0]; // retain the first element
for (int i = 1; i < myList.length; i++) {
    myList[i - 1] = myList[i];
}
mylist[myList.length - 1] = temp; // move the first element to the last index


// Enhanced for loop --> foreach loop
for (double value : myList){
    System.out.println(value);
}

// Copying arrays

// copy by reference, using =
int[] a = {1, 2, 3};
int[] b = a; // only reference is copied
b[0] = 99;

System.out.println(a[0]); // out 99

// Deep copy with loop
int[] a = {1, 2, 3};
int[] b = new int[a.length];

for (int i = 0; i < a.length; i++){
    b[i] = a[i]
}

// Copy with clone() method
// Be careful: If you are using a multidimensional array (e.g. int[][]),
// clone() only copies the first dimension,
// the nested arrays still share the same reference
// (so it is not a full “deep copy”).
int[] a = {1, 2, 3};
int[] b = a.clone();

// Arrays.copyOf() method
int[] c = Arrays.copyOf(a, 5);

// System.arraycopy() method
int[] a = {1, 2, 3, 4, 5};
int[] b = new int[a.length];
// System.arraycopy(source, sourceIndex, target, targetIndex, numberOfCopyItems);
System.arraycopy(a, 0, b, 0, a.length);


// Anonymous array
printArray(new int[]{3, 1, 2, 6, 4, 2});

// Pass by value - Pass by reference for arrays
// For a parameter of an array type,
// the value of the parameter contains a reference to an array; this reference is passed to the method.


// Search in arrays

// Linear search
// The linear search approach compares the key element, key, sequentially with each element in the array list.
// The method continues to do so until the key matches an element in the list or the list is exhausted without a match being found.
// If a match is made, the linear search returns the index of the element in the array that matches the key.
// If no match is found, the search returns -1.
public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++)
        if (key == list[i])
            return i;
    return -1;
}


// Binary search
// To do this array has to be sorted already
// First compare the middle element with the key that you searching for
// If it is equal, its a match
// If it is smaller than the middle index value search first half, if bigger search the second holf
// repeat
public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    while (high >= low) {
        int mid = (low + high) / 2;
        if (key < list[mid])
            high = mid - 1;
        else if (key == list[mid])
            return mid;
        else
            low = mid + 1;
    }
    return -1 - low;
}

// Arrays.binarySearch() method
// Arrays.binarySearch(array, searchKey);
// if key is found, index is returned
// if key is not found, returns -(insertion point -1) --> insertion point is the index that the key supposed to be after the array is sorted

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(numbers, 30);
        int index2 = Arrays.binarySearch(numbers, 35);
        System.out.println(index);  // 2
        System.out.println(index2);  // out -(3+1) --> -4
    }
}


// Sorting in arrays

// Selection sort
// find the smallest item
// put smallest item to the first index
// repeat for what's left

public class Main {
    public static void main(String[] args) {
        int[] list = {29, 10, 14, 37, 13};

        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i; // current smallest item index

            // find smallest item
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }

            // (swap)
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }

        System.out.println(Arrays.toString(list));
    }
}

// Bubble sort
// iterates through list over and over
// compares two back to back item
// takes smaller to left
// repeat
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sıralanmış dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


// Arrays.sort()
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

// Arrays.toString(list)



