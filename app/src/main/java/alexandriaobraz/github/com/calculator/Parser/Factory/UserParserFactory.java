package alexandriaobraz.github.com.calculator.Parser.Factory;


import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Gson.UserParserGson;
import alexandriaobraz.github.com.calculator.Json.UserParserJson;
import alexandriaobraz.github.com.calculator.Parser.IUserParser;

public class UserParserFactory {
    public IUserParser parserJson(final String pSource){
        return new UserParserJson(pSource);
    }
    public IUserParser parserGson(final InputStream pInputStream){
        return new UserParserGson(pInputStream);
    }


}
