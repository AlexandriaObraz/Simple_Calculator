package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONObject;

import alexandriaobraz.github.com.calculator.Parser.IUser;
import alexandriaobraz.github.com.calculator.Parser.IUserParser;

public class UserParserJson implements IUserParser {

    private final String pSource;

    public UserParserJson(final String mSource) {
        pSource = mSource;
    }

    @Override
    public IUser parse() throws Exception {
        final JSONObject jsonObject=new JSONObject(pSource);
        return new UserJson(jsonObject);
    }
}
