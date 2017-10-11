package alexandriaobraz.github.com.calculator;

import android.content.Intent;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;

import java.util.IllegalFormatCodePointException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class CalculatorEspressoTest
{

    @Rule
    public final ActivityTestRule<CalculatorActivity>  calculatorActivity= new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void TestButton()
    {


        onView(withId(R.id.input_first_digit))
                .perform(typeText("2"));

        onView(withId(R.id.input_second_digit))
                .perform(typeText("2"));

        onView(withId(R.id.result_calculator))
                .check(matches(withText("4.0")));

        onView(withId(R.id.button_multiply_calculator))
                .perform(click());
    }

    @Test
    public void RestRun()
    {
        calculatorActivity.launchActivity(new Intent());

        ViewInteraction calculateButton = onView(withId(R.id.button_equals_calculator));
        calculateButton.check(matches(isDisplayed()));
        calculateButton.check(new ViewAssertion()
        {
            @Override
            public void check(View view, NoMatchingViewException noViewFoundException)
            {
                if(view.isEnabled())
                {
                    throw new IllegalStateException("button enabled");
                }
            }
        });
    }

}
