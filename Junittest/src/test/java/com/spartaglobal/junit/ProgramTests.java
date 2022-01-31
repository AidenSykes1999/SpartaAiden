package com.spartaglobal.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTests {

@Test

    @DisplayName("Given a time of 21, greeting returns Good Evening")
    public void givenATimeOfT21(){
    //Arrange
    var time = 21;
    var expectedGreeting = "Good Evening";
    //Act
    var result = Program.greeting(time);
    //Assert
    assertEquals(expectedGreeting, result);


    }


}
