public class  chapter03 {
    public static void main(String[] args) {


        // Booleans
        boolean a = true;
        boolean b = false;
        boolean b = (1 > 2); // out false

        // Relational Operators
        // < , <=, >, >=, ==, !=

        // one way if --> means no else
        if (radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area"
                    + " for the circle of radius "
                    + radius + " is " + area);
        }

        // another syntax, shorter
        if (i > 0)
            System.out.println("i is positive");

        // two way if means there is else, if more than one else or else if its a multi-way statement
        if (true) {
            //statement(s)-for-the-true-case;
        }
        else {
            //statement(s)-for-the-false-case;
        }


        // Logical operators
        // !, &&, ||, ^
        // check truth tables for each

        // difference between logical operators (! , &&, ||, ^) and bitwise operators ( &, |)
        // logical checks one side (short circuit) bitwise do both

        int x = 1;
        boolean result = (x > 1) & (x++ < 10); // out false bu since its bitwise x is incremented
                                                // now x = 2

        boolean result = (x > 1) & (x++ < 10); // out false again but x did not incremented bc it logical
                                                // now x == 1

        // Switch
        // values have to have same data type

        int num = 0;
        switch (condition) {
            case 0: num = 1;
                break;
            case 1: num = 2;
                break;
            case 2: num = 3;
                break;
            case 3: num = 4;
                break;
            default: System.out.println("Errors: invalid status");
                System.exit(1);
        }


        // Conditional operator --> ?

        // eg. if statement
        if (num % 2 == 0)
            System.out.println(num + "is even");
        else
            System.out.println(num + "is odd");

        // same logic with conditional operators
        // condition ? (if condition true) : (if condition false)
        (num % 2 == 0 ) ? num + "is even" : num + "is odd";


    }
}