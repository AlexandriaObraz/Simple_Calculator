package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Parser.IPetsList;
import alexandriaobraz.github.com.calculator.Parser.IPetsListParser;
import alexandriaobraz.github.com.calculator.Stream.IOUtils;

public class PetListParserJson implements IPetsListParser{

    private final InputStream mInputStream;

    public PetListParserJson(final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IPetsList parse() throws Exception {

        final JSONArray jsonArray = new JSONArray(IOUtils.toString(mInputStream));
        final List<PetJson> petsJsonList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            petsJsonList.add(new PetJson(jsonObject));
        }
        return new PetListJson(petsJsonList);
    }
}
