// While loop

int count = 0;
while (count < 100) {
        System.out.println("Welcome to Java");
count++;
        }

// Do while --> works once before checking condition

do {
// Loop body;
Statement(s);
} while (loop-continuation-condition);

// For loop

int i;
for (i = 0; i < 100; i++) {
        System.out.println(
"Welcome to Java!");
}

// Break
// break will break out of while loop
public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}

// Continue
// Continue will go to the next iteration
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}