package alexandriaobraz.github.com.calculator.Json;


import org.json.JSONObject;

import alexandriaobraz.github.com.calculator.Parser.IPet;

public class PetJson implements IPet {

    private static final String ID="id";
    private static final String NAMEPETS="namePets";
    private static final String BREEDNAME="breedName";
    private static final String NAMEOWNERS="nameOwners";
    private static final String AGE="age";

    private final JSONObject mJSONObject;

    PetJson(final JSONObject pJSONObject){
        mJSONObject=pJSONObject;
    }
    @Override
    public int getID() {
        return mJSONObject.optInt(ID);
    }

    @Override
    public String getNamePets() {
        return mJSONObject.optString(NAMEPETS);
    }

    @Override
    public String getBreed() {
        return mJSONObject.optString(BREEDNAME);
    }

    @Override
    public String getNameOwners() {
        return mJSONObject.optString(NAMEOWNERS);
    }

    @Override
    public int getAge() {
        return mJSONObject.optInt(AGE);
    }
}
