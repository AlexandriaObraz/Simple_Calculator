package alexandriaobraz.github.com.calculator;


import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RoboelectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk=26)
public class RoboelectricTest {

    private ICalculator mMockCalculator;
    private ICalculator mSpyCalculator;

    private ActivityController<CalculatorActivity> activityControl;
    private EditText inputDigit1;
    private EditText inputDigit2;

    private CalculatorActivity calculatorActivity;

    @Before
    public void onInit(){
        activityControl = Robolectric.buildActivity(CalculatorActivity.class);
        activityControl.create();
        activityControl.start();
        activityControl.resume();
        calculatorActivity = activityControl.get();

        mMockCalculator = mock(Calculator.class);
        mSpyCalculator = spy(new Calculator());

        inputDigit1 = (EditText) calculatorActivity.findViewById(R.id.input_first_digit);
        inputDigit2 = (EditText) calculatorActivity.findViewById(R.id.input_second_digit);


    }

    @Test
    public void mockTest(){
        inputDigit1.setText(anyString());
        inputDigit2.setText(anyD());
        double value1 = Double.parseDouble(inputDigit1.getText().toString());
        double value2 = Double.parseDouble(inputDigit2.getText().toString());

        when(mMockCalculator.sum(value1, value2)).thenReturn(10);
        assertEquals(mMockCalculator.sum(3, 10), 10);
        verify(mMockCalculator).sum(3, 10);
    }

    @Test
    public void spyTest(){
                final Button divide = (Button) calculatorActivity.findViewById(R.id.button_div_calculator);
        divide.performClick();

        final TextView resultText = (TextView)calculatorActivity.findViewById(R.id.result_calculator);
        final String result = resultText.getText().toString();

        assertEquals(mSpyCalculator.division(8, 2), result);
        verify(mSpyCalculator).division(8, 2);

    }

    @After
    public void onDestroy(){
        activityControl.pause();
        activityControl.stop();
        activityControl.destroy();
    }

}
