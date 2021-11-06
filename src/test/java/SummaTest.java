import org.testng.Assert;
import org.testng.annotations.Test
import static java.lang.Long.sum;

public class SumaTest{
    public class CalcTest {

        @Test
        public void testSum() throws Exception {
            Assert.assertEquals(5, sum(2,3));
        }
    }
}



