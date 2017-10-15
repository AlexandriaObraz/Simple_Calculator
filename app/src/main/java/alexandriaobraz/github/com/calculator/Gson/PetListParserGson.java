package alexandriaobraz.github.com.calculator.Gson;


import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import alexandriaobraz.github.com.calculator.Parser.IPetsList;
import alexandriaobraz.github.com.calculator.Parser.IPetsListParser;

public class PetListParserGson implements IPetsListParser {

    private final InputStream mInputStream;

    public PetListParserGson(InputStream pInputStream) {
        this.mInputStream = pInputStream;
    }

    @Override
    public IPetsList parse() throws Exception {
        Reader reader = new InputStreamReader(mInputStream);
        PetGson[] result =new Gson().fromJson(reader,PetGson[].class);
        return new PetListGson(Arrays.asList(result));
    }
}
