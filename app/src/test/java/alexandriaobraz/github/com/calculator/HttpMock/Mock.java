package alexandriaobraz.github.com.calculator.HttpMock;


import org.junit.Assert;

import java.io.InputStream;

public class Mock {
    public static InputStream stream(final String pURL){
        final InputStream mockStream=Mock.class.getClassLoader().getResourceAsStream(pURL);
        Assert.assertNotNull("resource not found. Sorry, try again!",mockStream);
        return mockStream;

    }
}
