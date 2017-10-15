package alexandriaobraz.github.com.calculator.Json;

import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Parser.IPet;
import alexandriaobraz.github.com.calculator.Parser.IPetsList;

public class PetListJson implements IPetsList{

    private List<PetJson> mPetJson;

    public PetListJson(final List<PetJson> pPetJson) {
        mPetJson=pPetJson;
    }

    @Override
    public List<IPet> getPetsList() {
        final List<PetJson> petJson = new ArrayList<>();
        for (final PetJson pet: mPetJson){
            mPetJson.add(pet);
        }
        return petJson;
    }
}
