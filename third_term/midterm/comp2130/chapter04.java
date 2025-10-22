// Math clas
// constants PI and E
// Class methods:
// Trigonomeetric methods - Exponent Methods - Rounding Methods - min, max, abs and random Methodx

// Trigonometric
Math.sin(0) //returns 0.0
Math.sin(Math.PI / 6) //returns 0.5
Math.sin(Math.PI / 2) //returns 1.0
Math.cos(0) //returns 1.0
Math.cos(Math.PI / 6) //returns 0.866
Math.cos(Math.PI / 2) //returns 0

// Exponent
Math.exp(1) //returns 2.71
Math.log(2.71) //returns 1.0
Math.pow(2, 3) //returns 8.0
Math.pow(3, 2) //returns 9.0
Math.pow(3.5, 2.5) //returns 22.91765
Math.sqrt(4) //returns 2.0
Math.sqrt(10.5) //returns 3.24

// Rounding
double ceil(double x)
    //x rounded up to its nearest integer. This integer is returned as a double value.
double floor(double x)
     // x is rounded down to its nearest integer. This integer is returned as a double value
int round(float x)
         // Return (int)Math.floor(x+0.5)

// min max abs (absolute value)
Math.max(2, 3) //returns 3
Math.max(2.5, 3) //returns3.0
Math.min(2.5, 3.6) //returns 2.5
Math.abs(-2) //returns 2
Math.abs(-2.1) //returns 2.1

// Random method
// Generates a random double value greater than or equal to 0.0 and less than 1.0
// (0 <= Math.random() < 1.0).

// eg
int x = (int)(Math.random() * 10) // generates a number between 0 and 9
in y = 50 + (int)(Math.random() * 50) // generates a number between 50 and 99

// general rule for Math.random --> a + Math.random() * b
// Returns a random number between a and a + b, excluding a + b.

// Character Data Type

char letter = 'A'; //(ASCII)
char numChar = '4'; //(ASCII)
char letter = '\u0041'; //(Unicode)
char numChar = '\u0034'; //(Unicode)

// String Data type
// The char type only represents one character. To represent a string of characters, use the data type called String.
// String is actually a predefined class
String message = "Welcome to Java";
String str = "test";

// some string methods
// String.length(), String.charAt(index), String.concat(s1), String.toUpperCase(), String.toLowerCase(), String.trim()
// String is a non-instance method --> always needs to be called with an object instance, thats why its written as "String.Method" above

// Reading a String from the Console
Scanner input = new Scanner(System.in);
System.out.print("Enter three words separated by spaces: ")
String word1 = input.next();
String word2 = input.next();
String word3 = input.next();
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

// Comparing strings
message.equals(str) // Returns true if message is equal to string str.
message.equalsIgnoreCase(str) // same thing case insensitive
message.compareTo(str) // Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than str.
message.compareToIgnoreCase(str) // same thing case insensitive
message.startsWith(prefix) // Returns true if this string starts with the specified prefix.
message.endsWith(suffix) // Returns true if this string starts with the specified suffix.

message.substring(beginIndex) // Returns this string’s substring that begins with the character at the specified beginIndex and extends to the end of the string,
message.substring(beginIndex, endIndex);

message.indexOf(ch); // Index of first ch, -1 if not found
message.indexOf(ch, fromIndex); // Index of first ch after fromIndex, -1 if not found
message.indexOf(s); // Index of first s, -1 if not found
message.indexOf(s, fromIndex); // Index of first s after fromIndex, -1 if not found
message.lastIndexOf(ch); // Index of last ch, -1 if not found
message.lastIndexOf(ch, fromIndex); // Index of last ch before fromIndex, -1 if not found
message.lastIndexOf(s); // Index of last s, -1 if not found
message.lastIndexOf(s, fromIndex); // Index of last s before fromIndex, -1 if not found

// Conversion of a string
int intValue = Integer.parseInt(intString);


// Formatting output

// Use printf statement
System.out.printf(format, item);

// %b = boolean, %c = char, %d = decimal, %f = float, %e a number in scientific notation, %s = string

int count = 5;
double amount = 45.56;
System.out.printf("count is %d and amount is %f", count, amount);
// out "count is 5 and amount is 45.560000"