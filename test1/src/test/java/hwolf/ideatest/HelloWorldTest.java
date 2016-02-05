package hwolf.ideatest;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class HelloWorldTest {

    @Test
    public void test1() throws IOException {
        System.err.println("HelloWorldTest.test1 - I expect that this test fails");
        InputStream in = HelloWorldTest.class.getResourceAsStream("/test.txt");
        IOUtils.copy(in, System.out);
    }

    @Test
    public void test2() throws IOException {
        System.err.println("HelloWorldTest.test2- I expect that this test succeeds");
        try {
            InputStream in = HelloWorldTest.class.getResourceAsStream("/test-integration.txt");
            IOUtils.copy(in, System.out);
            Assert.fail("This test should not work");
        } catch (NullPointerException ex) {

        }
    }
}