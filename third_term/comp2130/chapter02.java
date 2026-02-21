// compute area of circle

// Numerical data types
// signed means both negative and positive values
// Byte --> -2^7 to 2^7 --> 8 bit signed
// short --> -2^15 to 2^15 --> 16 bit signed
// int --> -2^31 to 2^31 --> 32 bit signed
// long --> -2^63 to 2^63 --> 64 bit signed
// float --> Negative range: -3.4028235E+38 to -1.4E-45 --> 32-bit IEEE 754
//          Positive range: 1.4E-45 to 3.4028235E+38
// Double --> Negative range: -1.7976931348623157E+308 to -4.9E-324 -->  64-bit IEEE 754
//             Positive range: 4.9E-324 to 1.7976931348623157E+308

public class ComputeArea{
    public static void main(String[] args){
        double radius; // declaring variables
        double area;

        //Assing radiues
        radius = 20; // assigning value

        // compute area
        area = radius * radius; * 3.14159

        // results
        System.out.println("Radius is  " + radius);
        System.out.println("Area is " + area);
    }

    // reading input from console
    // for reading numbers --> nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble()
    public static double ReadDouble(){
        Scanner input = new Scanner(System.in);
        System.out.print("double value : ");
        double d = input.nextDouble();
    }

    // numeric operators --> + - / * %
    public static void dataType(){
        Scanner input = new Scanner(System.in);

        //integer division
        int num1 = 5;
        int num2 = 2;

        double num3 = 5;
        double num4 = 2;

        System.out.print(num1 / num2); // out 2
        System.out.print(num3 / num2); // out 2.5 --> because double / integer yields double

        System.out.print(num1 % num2); // out remainder 1

        System.out.println(1.0 - 0.9); //displays 0.09999999999999998, not 0.1. Integers are
                                        // stored precisely. Therefore, calculations with integers
                                        // yield a precise integer result.

        // exponent operation
        System.out.println(Math.pow(num1, num2)); // displays two over five = 25
        System.out.println(Math.pow(2.5, -2)); // displays 0.16

        // Number litearals A literal is a constant value that appears directly in the program.
        // For example, 34, 1,000,000, and 5.0 are literals in the following statements:
        int i = 34;
        long x = 1,000,000;
        double d = 5.0;

        // Integer literal
        //An integer literal is a number that is directly written in the program.
        //Examples: 10, 250, -500, 1000 are all integer literals.

        //When assigning a literal to a variable, the value must fit within the variable’s data type range.
        byte b = 100;   // OK
        byte b = 1000;  // Error, out of range

        //By default, every integer literal is of the int type.

        int x = 50000;     // OK
        long y = 50000;    // OK, fits into long
        long y = 5000000000; // Error, out of int range

        // To represent an integer literal as a long, append it with the letter L or l.
        long y = 5000000000L;  // OK

        // Float and Double literals
        // Floating-point literals are written with a decimal point.
        // By default, a floating-point literal is treated as a double type value.
        // can make a number a float by appending the letter f or F,
        // and make a number a double by appending the letter d or D.

        // double is more accurate than float
        System.out.println("1.0 / 3.0 is " + 1.0 / 3.0); // displays 1.0 / 3.0 is 0.3333333333333333 --> double
        System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F); // displays 1.0F / 3.0F is 0.33333334 --> float


        // Augmented Assignment Operators
        // these --> +=, -+
        // increment and decrement operatpors
        // var++, var-- or --var, ++var

        // Numeric conversions

        // 1. If one of the operands is double, the other is converted into double
        System.out.println("2.0 / 3 is " + 2.0 / 3.0);
        // 2. Otherwise, if one of the operands is float, the other is converted into float.
        System.out.println("3 / 2.5f is" + 3f / 2.5f);
        // 3. Otherwise, if one of the operands is long, the other is converted into long.
        // 4. Otherwise, both operands are converted into int.

        // Implicit casting (auto)
        double d = 3; // is actually int literal but casting is auto here to double
        // Explicit casting (manual)
        int i = (int)3.0;   // double → int --> out int 3
        int i = (int)3.9;   // out --> int 3 fraction is gone


        // !!!!!!
        int sum = 0;
        sum += 4.5; // this will output sum = 4
                    // sum += 4.5 is equivalent to sum = (int)(sum + 4.5).



    }
}

