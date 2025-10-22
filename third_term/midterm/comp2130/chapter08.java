// Multidimensional Arrays

// You can use a two-dimensional array to represent a matrix or a table

// Shorthand notation
int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
};

// Declare array ref var
// dataType[][] refVar;

// Create array and assign its reference to variable
// refVar = new dataType[10][10];

// Combine declaration and creation in one statement
// dataType[][] refVar = new dataType[10][10];

// Ragged/Jagged Arrays

// Each row in a two-dimensional array is itself an array.
// So, the rows can have different lengths.
// Such an array is known as a ragged array.
int[][] matrix = {
        {1, 2, 3, 4, 5},
        {2, 3, 4, 5},
        {3, 4, 5},
        {4, 5},
        {5}
};