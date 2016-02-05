package hwolf.ideatest;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class HelloWorldIntegrationTest {

    @Test
    public void test1() throws IOException {
        System.err.println("HelloWorldIntegrationTest.test1");
        try {
            InputStream in = HelloWorldIntegrationTest.class.getResourceAsStream("/test.txt");
            IOUtils.copy(in, System.out);
            Assert.fail("This test should not work");
        } catch (NullPointerException ex) {

        }
    }

    @Test
    public void test2() throws IOException {
        System.err.println("HelloWorldIntegrationTest.test2");
        InputStream in = HelloWorldIntegrationTest.class.getResourceAsStream("/test-integration.txt");
        IOUtils.copy(in, System.out);
    }
}
