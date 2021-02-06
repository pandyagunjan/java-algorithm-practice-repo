package StringAlgo;

import org.junit.Assert;
import org.junit.Test;

public class FirstRepeatedCharacterTest {
    @Test
    public void testFirstNonRepeatedCharacter() {

        Assert.assertEquals('b', FirstRepeatedCharacter.firstNonRepeatedCharacter("abcdefghija"));
        Assert.assertEquals('h', FirstRepeatedCharacter.firstNonRepeatedCharacter("hello"));
        Assert.assertEquals('J', FirstRepeatedCharacter.firstNonRepeatedCharacter("Java"));
        Assert.assertEquals('i', FirstRepeatedCharacter.firstNonRepeatedCharacter("simplest"));
    }
//        @Test public void testFirstNonRepeatingChar() {
//        assertEquals('b', FirstRepeatedCharacter.firstNonRepeatingChar("abcdefghija"));
//        assertEquals('h', FirstRepeatedCharacter.firstNonRepeatingChar("hello"));
//        assertEquals('J', FirstRepeatedCharacter.firstNonRepeatingChar("Java"));
//        assertEquals('i', FirstRepeatedCharacter.firstNonRepeatingChar("simplest")); }
//
        @Test public void testGetFirstNonRepeatedChar() {
            Assert.assertEquals('b', FirstRepeatedCharacter.getFirstNonRepeatedChar("abcdefghija"));
            Assert.assertEquals('h', FirstRepeatedCharacter.getFirstNonRepeatedChar("hello"));
            Assert.assertEquals('J', FirstRepeatedCharacter.getFirstNonRepeatedChar("Java"));
            Assert.assertEquals('i', FirstRepeatedCharacter.getFirstNonRepeatedChar("simplest")); }




}
