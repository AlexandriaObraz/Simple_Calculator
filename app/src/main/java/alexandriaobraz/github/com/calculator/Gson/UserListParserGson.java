package alexandriaobraz.github.com.calculator.Gson;


import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import alexandriaobraz.github.com.calculator.Parser.IUserList;
import alexandriaobraz.github.com.calculator.Parser.IUsersListParser;

public class UserListParserGson implements IUsersListParser {

    private InputStream mInputStream;

    public UserListParserGson(InputStream pInputStream){this.mInputStream=pInputStream;}

    @Override
    public IUserList parse() throws Exception {
        final Reader reader=new InputStreamReader(mInputStream);
        UserGson[] result= new Gson().fromJson(reader,UserGson[].class);
        return new UserListGson(Arrays.asList(result));
    }
}
