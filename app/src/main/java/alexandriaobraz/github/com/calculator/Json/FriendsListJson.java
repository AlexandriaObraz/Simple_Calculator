package alexandriaobraz.github.com.calculator.Json;


import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Parser.IFriend;
import alexandriaobraz.github.com.calculator.Parser.IFriendsList;

public class FriendsListJson implements IFriendsList{

    private List<FriendJson> mFriendJson;

    public FriendsListJson(final List<FriendJson> pFriendJson){
        mFriendJson=pFriendJson;
    }
    @Override
    public List<IFriend> getFriendsList() {
        final List<FriendJson> friendJson = new ArrayList<>();
        for (final FriendJson pet: mFriendJson){
            mFriendJson.add(pet);
        }
        return friendJson;
    }
}
