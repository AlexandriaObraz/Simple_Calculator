package alexandriaobraz.github.com.calculator.Parser.Factory;

import org.json.JSONArray;

import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Gson.FriendsListParserGson;
import alexandriaobraz.github.com.calculator.Json.FriendsListParserJson;
import alexandriaobraz.github.com.calculator.Parser.IFriendsListParser;

public class FriendsListParserFactory {
    public IFriendsListParser createListParserForJSON(final InputStream pInputStream) {
        return new FriendsListParserJson(pInputStream);
    }

    public IFriendsListParser createListParserForJSON(final JSONArray pJsonArray) {
        return new FriendsListParserJson(pJsonArray);
    }
    public IFriendsListParser createListParserForGSON(final InputStream pInputStream) {
        return new FriendsListParserGson(pInputStream);
    }

}
