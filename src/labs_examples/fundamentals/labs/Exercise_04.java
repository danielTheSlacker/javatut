package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        char c = 'c';
        byte b = 126;
        short s = 32767;
        long l = 2000000000L;
        float f = 3.14f;
        double d = 3.14;
        boolean bool = true;

        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("bool = " + bool);
    }

}
