package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Parser.IUserList;
import alexandriaobraz.github.com.calculator.Parser.IUsersListParser;
import alexandriaobraz.github.com.calculator.Stream.IOUtils;


public class UserListParserJson implements IUsersListParser {

    private final InputStream mInputStream;

    public UserListParserJson(final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IUserList parse() throws Exception {

        final JSONArray jsonArray = new JSONArray(IOUtils.toString(mInputStream));
        final List<UserJson> usersJsonList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            usersJsonList.add(new UserJson(jsonObject));
        }
        return new UserListJson(usersJsonList);
    }
}
