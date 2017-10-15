package alexandriaobraz.github.com.calculator.Parser.Factory;


import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Gson.PetListParserGson;
import alexandriaobraz.github.com.calculator.Json.PetListParserJson;
import alexandriaobraz.github.com.calculator.Parser.IPetsListParser;

public class PetsListParserFactory {
    public IPetsListParser parserListJson(final InputStream pInputStream){
        return new PetListParserJson(pInputStream);
    }
    public IPetsListParser parserListGson(final InputStream pInputStream){
        return new PetListParserGson(pInputStream);
    }
}
