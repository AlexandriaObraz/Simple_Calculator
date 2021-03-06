package alexandriaobraz.github.com.calculator.Gson;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import alexandriaobraz.github.com.calculator.Date.DateUser;
import alexandriaobraz.github.com.calculator.Date.IDateUser;
import alexandriaobraz.github.com.calculator.Parser.IFriendsList;
import alexandriaobraz.github.com.calculator.Parser.IUser;

public class UserGson implements IUser{

    @SerializedName("_id")
    private String _id;
    @SerializedName("index")
    private int index;
    @SerializedName("guid")
    private String guid;
    @SerializedName("active")
    private boolean active;
    @SerializedName("balance")
    private String balance;
    @SerializedName("picture")
    private String picture;
    @SerializedName("age")
    private int age;
    @SerializedName("eyeColor")
    private String eyeColor;
    @SerializedName("name")
    private String name;
    @SerializedName("gender")
    private String gender;
    @SerializedName("company")
    private String company;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("about")
    private String about;
    @SerializedName("registered")
    private long registered;
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("tags")
    private String[] tags;
    @SerializedName("friends")
    private FriendsGson[] friends;
    @SerializedName("greeting")
    private String greeting;
    @SerializedName("favouriteFruit")
    private String favouriteFruit;


    @Override
    public String getId() {
        return _id;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getGuid() {
        return guid;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public String getBalance() {
        return balance;
    }

    @Override
    public String getPicture() {
        return picture;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAbout() {
        return about;
    }

    @Override
    public Long getRegistered() {
        return registered;
    }

    @Override
    public Date getFriendlyRegisteredTime() throws ParseException {
        IDateUser friendlyTime = new DateUser(registered);
        return friendlyTime.getDate();
    }

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public double getLongitude() {
        return longitude;
    }

    @Override
    public String[] getTags() throws JSONException {
        return tags;
    }

    @Override
    public IFriendsList getFriends() throws Exception {
        return new FriendsListGson(Arrays.asList(friends));
    }

    @Override
    public String getGreeting() {
        return greeting;
    }

    @Override
    public String getFavoriteFruit() {
        return favouriteFruit;
    }

}
