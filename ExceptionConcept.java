package day21;


import java.io.FileReader;

public class ExceptionConcept {
    public static void main(String[] args) {
        compareValue(null, 1);
    }


    public static int compareValue(Integer i, Integer j) {
// Exception Handling
        try {

        } catch (Exception e) {

        }

        System.out.println();
        try {
/**
 *
 */
/* int[] arr = {1, 2};
System.out.println(arr[8]);*/
            FileReader fileReader = new FileReader("abc.txt");
            fileReader.read();
/*String s = null;
s.toUpperCase();*/
// System.out.println(10/0);
        } catch (NullPointerException ex) {
            throw new MyRunTimeException("401", "Null exception input");
        } catch (ArrayIndexOutOfBoundsException ex2) {
            throw new MyRunTimeException("501", "Array exception input");
        } catch (ArithmeticException ex2) {
            throw new MyRunTimeException("601", "Mathematic exception");
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyRunTimeException("701", "exception");
        } finally {
            System.out.println("Finally block called");
        }


        try (FileReader fileReader = new FileReader("abc.txt")) {
        } catch (Exception ex) {

        }

        return 0;

    }
}

/**
 * Exception
 * a> Runtime : while the execution program
 * b> compile : while compilation of code
 * .java -> .class -> execution
 * throws keyword
 * throw keyword
 * try-catch block
 * <p>
 * try-catch-finally block
 * <p>
 * try with resource
 */


// User Defined Exception

/**
 *
 */

// compile time exception
class MyCompileTimeException extends Exception {
    public MyCompileTimeException(String message) {
        super(message);
    }
}

// run time exception
class MyRunTimeException extends RuntimeException {
    private String MessageCode;
    private String MessageDesc;

    public MyRunTimeException(String MessageCode, String MessageDesc) {
        super(MessageDesc);
        this.MessageCode = MessageCode;
        this.MessageDesc = MessageDesc;
    }
}
