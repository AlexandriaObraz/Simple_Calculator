package alexandriaobraz.github.com.calculator.Gson;


import com.google.gson.annotations.SerializedName;

import alexandriaobraz.github.com.calculator.Parser.IPet;

public class PetGson implements IPet{

    @SerializedName("id")
    private int id;

    @SerializedName("namePets")
    private String namePets;

    @SerializedName("breed")
    private String breed;

    @SerializedName("age")
    private int age;

    @SerializedName("nameOwners")
    private String nameOwners;

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getNamePets() {
        return namePets;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getNameOwners() { return nameOwners; }

    @Override
    public int getAge() {
        return age;
    }

}
