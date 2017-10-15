package alexandriaobraz.github.com.calculator.Gson;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import alexandriaobraz.github.com.calculator.Parser.IFriendsList;
import alexandriaobraz.github.com.calculator.Parser.IFriendsListParser;


public class FriendsListParserGson implements IFriendsListParser {

    private final InputStream mInputStream;

    public FriendsListParserGson(InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IFriendsList parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        final FriendsGson[] result =new Gson().fromJson(reader,FriendsGson[].class);
        return new FriendsListGson(Arrays.asList(result));
    }
}
