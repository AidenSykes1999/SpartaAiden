package com.spartaglobal.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTests {

@ParameterizedTest
@CsvSource({"12,Good Morning", "13, Good Afternoon"})

    @DisplayName("Given a time of 12 and 13, I expect appropriate greetings")
    public void give12or13_appropriateValueReturned(int time, String expectedGreeting){
    //Arrange

    assertEquals(expectedGreeting,Program.greeting((time)));

    //Act

    //Assert



    }







}
