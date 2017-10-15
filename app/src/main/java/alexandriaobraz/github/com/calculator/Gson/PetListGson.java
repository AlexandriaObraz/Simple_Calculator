package alexandriaobraz.github.com.calculator.Gson;

import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Json.PetJson;
import alexandriaobraz.github.com.calculator.Parser.IPet;
import alexandriaobraz.github.com.calculator.Parser.IPetsList;

public class PetListGson implements IPetsList {

    private List<PetGson> mPetsList;

    public PetListGson(final List<PetGson> pPetsList ){
        mPetsList=pPetsList;
    }

    @Override
    public List<IPet> getPetsList() {

        final List<IPet> petList = new ArrayList<>();
        for (final PetGson pet :
                mPetsList) {
            petList.add(pet);
        }
        return petList;
    }
}