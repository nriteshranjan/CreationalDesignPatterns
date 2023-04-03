package singleton.StaticVsSingleton;

import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {

    @Test
    public void whenStaticUtilClassInheritance_thenOverridingFails() {
        SuperUtility superUtility = new SubUtility();
        Assert.assertNotEquals("ECHO", superUtility.echoIt("ECHO"));
        Assert.assertEquals("SUPER", superUtility.echoIt("ECHO"));
    }
}
