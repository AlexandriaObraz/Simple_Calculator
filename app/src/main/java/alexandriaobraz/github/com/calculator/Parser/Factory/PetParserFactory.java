package alexandriaobraz.github.com.calculator.Parser.Factory;

import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Gson.PetGsonParser;
import alexandriaobraz.github.com.calculator.Json.PetJsonParser;
import alexandriaobraz.github.com.calculator.Parser.IPetParser;

public class PetParserFactory {
    public IPetParser parserListJson(final String pSource){
        return new PetJsonParser(pSource);
    }
    public IPetParser parserListGson(final InputStream pInputStream){
        return new PetGsonParser(pInputStream);
    }
}
