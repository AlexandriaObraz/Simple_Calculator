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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk=26)
public class RoboelectricTest {

    private ICalculator mMockCalculator;

    private ActivityController<CalculatorActivity> activityControl;
    private CalculatorActivity calculatorActivity;

    @Before
    public void onInit(){
        activityControl = Robolectric.buildActivity(CalculatorActivity.class);
        activityControl.create();
        activityControl.start();
        activityControl.resume();
        calculatorActivity = activityControl.get();

        mMockCalculator = mock(Calculator.class);
    }

    @Test
    public void mockTest(){

        when(mMockCalculator.division(anyInt(),eq(0))).thenThrow(new ArithmeticException());
        assertEquals(mMockCalculator.sum(3, 10), 10);
        verify(mMockCalculator).sum(3, 10);
    }

    @Test
    public void spyTest(){
        final Button divide = (Button) calculatorActivity.findViewById(R.id.button_div_calculator);
        divide.performClick();

        final TextView resultText = (TextView)calculatorActivity.findViewById(R.id.result_calculator);
        assertNotNull("",resultText);

        final EditText mFirstDigit = (EditText) calculatorActivity.findViewById(R.id.input_first_digit);
        assertNotNull("", mFirstDigit);

        final EditText mSecondDigit= (EditText) calculatorActivity.findViewById(R.id.input_second_digit);
        assertNotNull("", mSecondDigit);

        final Button equals = (Button) calculatorActivity.findViewById(R.id.button_equals_calculator);
        divide.performClick();

        boolean isDifferenceButtonEnabled = calculatorActivity.findViewById(R.id.button_difference_calculator).isEnabled();
        assertEquals(isDifferenceButtonEnabled, true);
        assertTrue(isDifferenceButtonEnabled);

        boolean isSumButtonEnabled = calculatorActivity.findViewById(R.id.button_sum_calculator).isEnabled();
        assertEquals(isSumButtonEnabled, true);
        assertTrue(isSumButtonEnabled);

        boolean isMultiplyButtonEnabled = calculatorActivity.findViewById(R.id.button_multiply_calculator).isEnabled();
        assertEquals(isMultiplyButtonEnabled, true);
        assertTrue(isMultiplyButtonEnabled);


    }

    @After
    public void onDestroy(){
        activityControl.pause();
        activityControl.stop();
        activityControl.destroy();
    }

}
