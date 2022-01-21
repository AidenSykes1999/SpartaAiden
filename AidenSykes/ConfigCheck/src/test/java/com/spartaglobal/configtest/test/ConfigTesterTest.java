package com.spartaglobal.configtest.test;

import com.spartaglobal.configtest.ConfigTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConfigTesterTest {

    @Test

    public void testGetMessage2(){
        ConfigTester ct = new ConfigTester();
        String actual = ct.getMessage("Aiden");
        String expected = "Welcome to Sparta, Aiden!";
        Assertions.assertEquals(expected, actual);



    }

    @Test

    public void testGetMessage(){
        ConfigTester ct = new ConfigTester();
        String actual = ct.getMessage("Mark");
        String expected = "Welcome to Sparta, Aiden!";
        Assertions.assertEquals(expected, actual);



    }


}
