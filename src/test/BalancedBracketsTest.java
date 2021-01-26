package test;
import main.BalancedBrackets;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

//    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void extraBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode]]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void backwardBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }













}
