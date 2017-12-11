import org.testng.Assert;
import org.testng.annotations.Test;
import org.scalatest.testng.TestNGSuite;
import org.testng.annotations.Test;

public class UnitTest extends TestNGSuite {
    String message = "Manisha";


    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,"dfasfas");
    }
}