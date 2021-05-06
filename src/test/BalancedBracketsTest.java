package test;


import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {



    //TODO: Check if hasBalancedBrackets returns true after passing "[]"
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    //TODO: Check if hasBalancedBrackets returns true after passing ""
    @Test
    public void emptyValueReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //TODO: Check if hasBalancedBrackets returns true after passing "[LaunchCode]"
    @Test
    public void correctValueReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //TODO: Check if hasBalancedBrackets returns true after passing "]["
    @Test
    public void reverseBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //TODO: Check if hasBalancedBrackets returns true after passing "]["
    @Test
    public void reverseBracketsValueReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    //TODO: Check if hasBalancedBrackets returns false after passing "]"
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //TODO: Check if hasBalancedBrackets returns true after passing non null value
    @Test
    public void nonNullValueReturnsTrue() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //TODO: Check if hasBalancedBrackets returns true after passing "[]"
    @Test
    public void comparingBracketsReturnsTrue() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //TODO: Check if hasBalancedBrackets returns true after passing "]LaunchCode["
    @Test
    public void comparingValueBracketsReturnsTrue() {
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    //TODO: Check if hasBalancedBrackets returns false after passing "]]]"
    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]"));
    }

    //TODO: Check if hasBalancedBrackets returns false after passing "[[[]]]]"
    @Test
    public void notSortBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]]]"));
    }

}
