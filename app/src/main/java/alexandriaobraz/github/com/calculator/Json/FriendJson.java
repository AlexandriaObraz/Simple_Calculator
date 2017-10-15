package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONObject;

import alexandriaobraz.github.com.calculator.Parser.IFriend;

public class FriendJson implements IFriend {

    private static final String ID="id";
    private static final String NAME="name";

    private final JSONObject mJSONObject;

    FriendJson(final JSONObject pJSONObject){
        mJSONObject=pJSONObject;
    }

    @Override
    public long getID() {
        return mJSONObject.optLong(ID);
    }

    @Override
    public String getName() {
        return mJSONObject.optString(NAME);
    }
}
