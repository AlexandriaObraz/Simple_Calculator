package alexandriaobraz.github.com.calculator.Parser;


import org.json.JSONException;

import java.text.ParseException;
import java.util.Date;

public interface IUser {
    String getId();

    int getIndex();

    String getGuid();

    boolean isActive();

    String getBalance();

    String getPicture();

    int getAge();

    String getEyeColor();

    String getName();

    String getGender();

    String getCompany();

    String getEmail();

    String getPhone();

    String getAddress();

    String getAbout();

    Long getRegistered();

    Date getFriendlyRegisteredTime() throws ParseException;

    double getLatitude();

    double getLongitude();

    String[] getTags() throws JSONException;

    IFriendsList getFriends() throws Exception;

    String getGreeting();

    String getFavoriteFruit();

}
