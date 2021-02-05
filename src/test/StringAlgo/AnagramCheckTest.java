package StringAlgo;

import org.junit.Assert;
import org.junit.Test;

public class AnagramCheckTest {

    @Test
    public void testCheckAnagram_SortAndEquals()
    {
        Assert.assertTrue(AnagramCheck.checkAnagram("pot", "top"));
        Assert.assertFalse(AnagramCheck.checkAnagram("gunjan", "help"));
    }

    @Test
    public void testCheckAnagram_ForLoop()
    {
        Assert.assertTrue(AnagramCheck.IsAnagramUsingFor("pot", "top"));
        Assert.assertFalse(AnagramCheck.IsAnagramUsingFor("gunjan", "help"));
    }

    @Test
    public void testCheckAnagram_IndexOf()
    {
        Assert.assertTrue(AnagramCheck.angramCheckUsingIndexOf("pot", "top"));
        Assert.assertFalse(AnagramCheck.angramCheckUsingIndexOf("gunjan", "help"));
    }
}
