package alexandriaobraz.github.com.calculator.Gson;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import alexandriaobraz.github.com.calculator.Parser.IFriend;
import alexandriaobraz.github.com.calculator.Parser.IFriendParser;

public class FriendsParserGson implements IFriendParser{

    private final InputStream mInputStream;

    public FriendsParserGson( InputStream pInputStream) {
        this.mInputStream = pInputStream;
    }

    @Override
    public IFriend parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader,FriendsGson.class);
    }
}
