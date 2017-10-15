package alexandriaobraz.github.com.calculator.Json;

import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Parser.IUserList;

public class UserListJson implements IUserList {

    private List<UserJson> mUserJson;

    public UserListJson(final List<UserJson> pUserJson){
        mUserJson=pUserJson;
    }
    @Override
    public List<UserJson> getUserList() {
        final List<UserJson> userJsonList=new ArrayList<>();
        for (final UserJson user: mUserJson)
        {
            userJsonList.add(user);
        }
        return userJsonList;
    }
}
