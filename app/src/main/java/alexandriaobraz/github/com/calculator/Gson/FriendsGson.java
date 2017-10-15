package alexandriaobraz.github.com.calculator.Gson;

import com.google.gson.annotations.SerializedName;

import alexandriaobraz.github.com.calculator.Parser.IFriend;

public class FriendsGson implements IFriend {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @Override
    public long getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
