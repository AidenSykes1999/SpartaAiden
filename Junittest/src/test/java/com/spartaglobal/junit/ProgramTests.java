package com.spartaglobal.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTests {

    private Program sut;
    @BeforeEach // Before Each test method, instantiate a new sut (program) object.
    void setUp(){
        sut = new Program(); //Creates a new instance before each test
    }

@ParameterizedTest
//@ValueSource(ints = {5,8,12})
@CsvSource({"12,Good Morning", "13, Good Afternoon"})

    @DisplayName("Given a time of 12 and 13, I expect appropriate greetings")
    public void give12or13_appropriateValueReturned(int time, String expectedGreeting){
    //Arrange
    assertEquals(expectedGreeting,sut.greeting((time)));
    //Act
    //Assert
    }

    @ParameterizedTest
@ValueSource(ints = {5,8,12})
    @DisplayName("Given a time between 5 and 12, I expect good morning")
    public void give5to12_appropriateValueReturned(int time) {
        //Arrange
        assertEquals("Good Morning", sut.greeting((time)));
        //Act
        //Assert

    }

}
