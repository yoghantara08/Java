package belajar.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testEnabledOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_17})
    void testEnabledOnJava17(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_17})
    void testDisabledOnJava17(){

    }
}
