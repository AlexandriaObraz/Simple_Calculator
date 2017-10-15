package alexandriaobraz.github.com.calculator.Parser.Factory;

import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Gson.FriendsParserGson;
import alexandriaobraz.github.com.calculator.Json.FriendParserJson;
import alexandriaobraz.github.com.calculator.Parser.IFriendParser;

public class FriendsParserFactory {
    public IFriendParser parserJson(final String pSource){
        return new FriendParserJson(pSource);
    }
    public IFriendParser parserGson(final InputStream pInputStream){
        return new FriendsParserGson(pInputStream);
    }
}
