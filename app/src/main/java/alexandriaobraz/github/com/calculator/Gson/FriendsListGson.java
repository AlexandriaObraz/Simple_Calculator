package alexandriaobraz.github.com.calculator.Gson;

import java.util.ArrayList;
import java.util.List;

import alexandriaobraz.github.com.calculator.Json.FriendJson;
import alexandriaobraz.github.com.calculator.Parser.IFriend;
import alexandriaobraz.github.com.calculator.Parser.IFriendsList;

public class FriendsListGson implements IFriendsList{

    private List<FriendsGson> mFriendsList;

    public FriendsListGson(List<FriendsGson> mFriendsList){
        this.mFriendsList=mFriendsList;
    }

    @Override
    public List<IFriend> getFriendsList() {

        final List<IFriend> friendsList = new ArrayList<>();
        for (final FriendsGson friend :
                mFriendsList) {
            friendsList.add(friend);
        }
        return friendsList;
    }
}
