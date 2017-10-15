package alexandriaobraz.github.com.calculator.Gson;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import alexandriaobraz.github.com.calculator.Parser.IPet;
import alexandriaobraz.github.com.calculator.Parser.IPetParser;

public class PetGsonParser implements IPetParser{

    private final InputStream mInputStream;

    public PetGsonParser(InputStream pInputStream) {
        this.mInputStream = pInputStream;
    }

    @Override
    public IPet parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader,PetGson.class);
    }
}
