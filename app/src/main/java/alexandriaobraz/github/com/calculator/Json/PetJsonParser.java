package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONObject;

import java.io.InputStream;

import alexandriaobraz.github.com.calculator.Parser.IPet;
import alexandriaobraz.github.com.calculator.Parser.IPetParser;

public class PetJsonParser implements IPetParser {

    private final String pSource;

    public PetJsonParser(final String mSource) {
        pSource = mSource;
    }

    @Override
    public IPet parse() throws Exception {
        final JSONObject jsonObject=new JSONObject(pSource);
        return new PetJson(jsonObject);
    }
}
