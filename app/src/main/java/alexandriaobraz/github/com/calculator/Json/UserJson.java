package alexandriaobraz.github.com.calculator.Json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import alexandriaobraz.github.com.calculator.Date.DateUser;
import alexandriaobraz.github.com.calculator.Date.IDateUser;
import alexandriaobraz.github.com.calculator.Parser.Factory.FriendsListParserFactory;
import alexandriaobraz.github.com.calculator.Parser.IFriendsList;
import alexandriaobraz.github.com.calculator.Parser.IUser;

public class UserJson implements IUser{

    private static final String id = "_id";
    private static final String index = "index";
    private static final String guid = "guid";
    private static final String isActive = "isActive";
    private static final String balance = "balance";
    private static final String picture = "picture";
    private static final String age = "age";
    private static final String eyeColor = "eyeColor";
    private static final String name = "name";
    private static final String gender = "gender";
    private static final String company = "company";
    private static final String email = "email";
    private static final String phone = "phone";
    private static final String address = "address";
    private static final String about = "about";
    private static final String registered = "registered";
    private static final String latitude = "latitude";
    private static final String longitude = "longitude";
    private static final String tags = "tags";
    private static final String friends = "friends";
    private static final String greeting = "greeting";
    private static final String favoriteFruit = "favoriteFruit";

    private final JSONObject mJSONObject;

    public UserJson(final JSONObject pJSONObject) {
        mJSONObject = pJSONObject;
    }

    @Override
    public String getId() {
        return mJSONObject.optString(id);
    }

    @Override
    public int getIndex() {
        return mJSONObject.optInt(index);
    }

    @Override
    public String getGuid() {
        return mJSONObject.optString(guid);
    }

    @Override
    public boolean isActive() {
        return mJSONObject.optBoolean(isActive);
    }

    @Override
    public String getBalance() {
        return mJSONObject.optString(balance);
    }

    @Override
    public String getPicture() {
        return mJSONObject.optString(picture);
    }

    @Override
    public int getAge() {
        return mJSONObject.optInt(age);
    }

    @Override
    public String getEyeColor() {
        return mJSONObject.optString(eyeColor);
    }

    @Override
    public String getName() {
        return mJSONObject.optString(name);
    }

    @Override
    public String getGender() {
        return mJSONObject.optString(gender);
    }

    @Override
    public String getCompany() {
        return mJSONObject.optString(company);
    }

    @Override
    public String getEmail() {
        return mJSONObject.optString(email);
    }

    @Override
    public String getPhone() {
        return mJSONObject.optString(phone);
    }

    @Override
    public String getAddress() {
        return mJSONObject.optString(address);
    }

    @Override
    public String getAbout() {
        return mJSONObject.optString(about);
    }

    @Override
    public Long getRegistered() {
        return mJSONObject.optLong(registered);
    }

    @Override
    public Date getFriendlyRegisteredTime() throws ParseException {
        final Long time = mJSONObject.optLong(registered);
        if (time != 0) {
            final IDateUser userDate = new DateUser(time);
            return userDate.getDate();
        } else {
            return null;
        }
    }

    @Override
    public double getLatitude() {
        return mJSONObject.optDouble(latitude);
    }

    @Override
    public double getLongitude() {
        return mJSONObject.optDouble(longitude);
    }

    @Override
    public String[] getTags() throws JSONException {
        final List<String> tagsList = new ArrayList<String>();
        final JSONArray tagsJSON = mJSONObject.optJSONArray(tags);
        for (int i = 0; i < tagsJSON.length(); i++) {
            tagsList.add(tagsJSON.getString(i));
        }
        return tagsList.toArray(new String[tagsList.size()]);
    }

    @Override
    public IFriendsList getFriends() throws Exception {
        final FriendsListParserFactory factory = new FriendsListParserFactory();
        return factory.createListParserForJSON(mJSONObject.optJSONArray(friends)).parse();

    }

    @Override
    public String getGreeting() {
        return mJSONObject.optString(greeting);
    }

    @Override
    public String getFavoriteFruit() {
        return mJSONObject.optString(favoriteFruit);
    }
}
