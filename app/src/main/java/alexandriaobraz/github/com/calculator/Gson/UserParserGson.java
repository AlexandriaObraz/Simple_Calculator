package alexandriaobraz.github.com.calculator.Gson;


import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import alexandriaobraz.github.com.calculator.Parser.IUser;
import alexandriaobraz.github.com.calculator.Parser.IUserParser;

public class UserParserGson implements IUserParser {

    private InputStream mInputStream;

    public UserParserGson(InputStream pInputStream){this.mInputStream=pInputStream;}

    @Override
    public IUser parse() throws Exception {
        final Reader reader=new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader, UserGson.class);
    }
}
