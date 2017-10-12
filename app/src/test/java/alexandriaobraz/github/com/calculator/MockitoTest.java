package alexandriaobraz.github.com.calculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
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
    public void mockTest(){
        when(mMockCalculator.sum(1, 2)).thenReturn(3.0);
        when(mMockCalculator.difference(2,1)).thenReturn(1.0);
        when(mMockCalculator.division(-1,1)).thenReturn(-1.0);
        when(mMockCalculator.multiply(anyInt(),eq(0))).thenReturn(0.0);
    }

    @Test
    public void spyTest(){
        assertSame(22,mSpyCalculator.sum(20,2));
        assertSame(180,mSpyCalculator.difference(226,46));
        assertSame(mSpyCalculator.multiply(98,0),0);
        mSpyCalculator.division(66,2);

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
