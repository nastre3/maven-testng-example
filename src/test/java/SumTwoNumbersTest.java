import org.testng.annotations.Test;

public class SumTwoNumbersTest {

    @Test
    public void SumTest() {
        /*
        java: constructor SumTwoNumbers in class SumTwoNumbers cannot be applied to given types;
  required: java.lang.String[]
  found:    int,int
  reason: actual and formal argument lists differ in length
         */
        SumTwoNumbers sum = new SumTwoNumbers(10, 30);
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
