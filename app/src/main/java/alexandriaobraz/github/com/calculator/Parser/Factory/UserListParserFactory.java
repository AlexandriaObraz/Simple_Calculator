package alexandriaobraz.github.com.calculator.Parser.Factory;

import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Json.UserListParserJson;
import alexandriaobraz.github.com.calculator.Parser.IUsersListParser;

public class UserListParserFactory {
    public IUsersListParser parserJson(final InputStream pInputStream){
        return new UserListParserJson(pInputStream);
    }
    public IUsersListParser parserGson(final InputStream pInputStream){
        return new UserListParserJson(pInputStream);
    }
}
