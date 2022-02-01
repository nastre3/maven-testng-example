import org.testng.annotations.Test;

import javax.naming.SizeLimitExceededException;

public class SumTwoNumbersTest {

    @Test
    public void SumTest2() {
        String[] s = {"10", "30"};
        // SumTwoNumbers sum = new SumTwoNumbers(new String[]{"10", "30"});
        SumTwoNumbers sum = new SumTwoNumbers(s);
        System.out.println(s.length);
        int result = 0;
        try {
            sum.verifyNumberOfArguments();
            sum.parseArgumentsToInt();
            result = sum.addTwoNumbers();
            System.out.println(result);
        } catch (
                IllegalArgumentException | SizeLimitExceededException e) {
        } finally {
        }
    }

    @Test
    public void SumTest3()  {
        String[] s = {"10", "30", "40"};
        SumTwoNumbers sum = new SumTwoNumbers(s);
        System.out.println(s.length);
        //SumTwoNumbers sum = new SumTwoNumbers(new String[]{"10", "30", "40"});
        int result = 0;
        try {
            sum.verifyNumberOfArguments();
            sum.parseArgumentsToInt();
            result = sum.addTwoNumbers();
            System.out.println(result);
        } catch (
                IllegalArgumentException | SizeLimitExceededException e) {
        } finally {

        }
    }

    @Test
    public void SumTest1() {
        SumTwoNumbers sum = new SumTwoNumbers(new String[]{"10"});
        int result = 0;
        try {
            sum.verifyNumberOfArguments();
            sum.parseArgumentsToInt();
            result = sum.addTwoNumbers();
            System.out.println(result);
        } catch (
                Exception e) {
        } finally {
        }
    }

}
