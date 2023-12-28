package main.java.exception;

public class UncheckedException {
    public void  throwUncheckedException() {

        try {
            // This will be throwing exception when one tries to access an element that is not within the
            // array size
            int[] nums = {0, 1, 2, 3};
            int value = nums[-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception type: " + e);
        }

        try {
            // this is basic arithmetic
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception type: " + e);
        }

        try {
            // this is numberformat(have to check again)
            int num = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println("Unchecked exception type: " + e);
        }

        try {
            // When one tries to access Null
            String str = null;
            str.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("Unchecked exception type: " + e);
        }

    }
}
