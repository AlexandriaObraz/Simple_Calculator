package alexandriaobraz.github.com.calculator.HTTP;

import java.io.InputStream;

public interface IHttp {
    InputStream request(String url);
}
