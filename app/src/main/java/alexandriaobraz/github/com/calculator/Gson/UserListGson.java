package alexandriaobraz.github.com.calculator.Gson;


import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Json.UserJson;
import alexandriaobraz.github.com.calculator.Parser.IUser;
import alexandriaobraz.github.com.calculator.Parser.IUserList;

public class UserListGson implements IUserList {

    private List<UserGson> mUserListGson;

    public  UserListGson(final List<UserGson> pUserListGson){ mUserListGson=pUserListGson;}


    @Override
    public List<UserJson> getUserList() {
        final List<IUser> userList = new ArrayList<>();
        for (final UserGson user :
                mUserListGson) {
            userList.add(user);
        }
        return userList;
    }
}
