package alexandriaobraz.github.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartCalculatorActivity();
    }
    public void StartCalculatorActivity(){
        startActivity(new Intent(this, CalculatorActivity.class));
    }
}
