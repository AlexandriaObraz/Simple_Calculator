package alexandriaobraz.github.com.calculator;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class MockitoTest {

    private ICalculator mMockCalculator;
    private ICalculator mSpyCalculator;
    Calculator calculator= new Calculator();

    @Before
    public void SetupMockito(){
        mMockCalculator= mock(Calculator.class);
        mSpyCalculator= spy (new Calculator());
    }

    @Test
    public void sumOfNumbers() throws Exception {
        assertEquals(19, calculator.sum(34, -15));
    }

    @Test
    public void divisionOfNumbers() throws Exception {
        assertEquals(4, calculator.division(8, 2));
    }

    @Test
    public void testNegativeSpy() throws Exception {

        assertEquals(mSpyCalculator.multiply(-1, 1), -1.0);
        verify(mSpyCalculator).multiply(-1, 1);

    }

    @Test
    public void minusOfNumbers() throws Exception {
        assertEquals(9, calculator.difference(27, 18));
    }
}
