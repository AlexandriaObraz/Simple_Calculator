package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONObject;

import alexandriaobraz.github.com.calculator.Parser.IFriend;
import alexandriaobraz.github.com.calculator.Parser.IFriendParser;
import alexandriaobraz.github.com.calculator.Parser.IFriendsList;


public class FriendParserJson implements IFriendParser {

    private final String pSource;

    public FriendParserJson(final String mSource) {
        pSource = mSource;
    }

    @Override
    public IFriend parse() throws Exception {
        final JSONObject jsonObject=new JSONObject(pSource);
        return new FriendJson(jsonObject);
    }
}
