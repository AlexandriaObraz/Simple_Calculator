package alexandriaobraz.github.com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText inputDigit1;
    public EditText inputDigit2;
    public TextView result;
    public Button buttonSum;
    public Button buttonDifference;
    public Button buttonMultiply;
    public Button buttonDivide;
    public Button buttonEquals;
    private ICalculator mCalculator = new Calculator();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setupUIViews();
    }

    public void setupUIViews() {
        inputDigit1 = (EditText) findViewById(R.id.input_first_digit);
        inputDigit2 = (EditText) findViewById(R.id.input_second_digit);
        result = (TextView) findViewById(R.id.result_calculator);
        buttonSum = (Button) findViewById(R.id.button_sum_calculator);
        buttonEquals = (Button) findViewById(R.id.button_difference_calculator);
        buttonDifference = (Button) findViewById(R.id.button_sum_calculator);
        buttonDivide = (Button) findViewById(R.id.button_div_calculator);
        buttonMultiply = (Button) findViewById(R.id.button_multiply_calculator);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonSum.setOnClickListener(this);
        buttonDifference.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Double answer = null;
        final double value1 = Double.parseDouble(inputDigit1.getText().toString());
        final double value2 = Double.parseDouble(inputDigit1.getText().toString());
        switch (v.getId()) {
            case R.id.button_difference_calculator:
                answer = mCalculator.difference(value1, value2);
                break;
            case R.id.button_div_calculator:
                answer = mCalculator.division(value1, value2);
                break;
            case R.id.button_multiply_calculator:
                answer = mCalculator.multiply(value1, value2);
                break;
            case R.id.button_sum_calculator:
                answer = mCalculator.sum(value1, value2);
                break;
        }
        String resultAnswer = String.valueOf(answer);
        result.setText(resultAnswer);
    }
}
