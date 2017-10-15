package alexandriaobraz.github.com.calculator.Date;

import android.util.Log;

import java.text.ParseException;
import java.util.Date;

public class DateUser implements IDateUser {

    private Date mDateUser;

    public DateUser(final long time){
        mDateUser=new Date(time);
        Log.d("Date", mDateUser.toString());
    }

    @Override
    public Date getDate() throws ParseException {
        return mDateUser;
    }
}
