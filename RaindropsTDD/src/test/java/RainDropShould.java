import com.sparta.raindrops.Raindrops;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class RainDropShould {

    @Test
    @DisplayName("Given one, return a String")
            public void givenOne_ReturnString(){
        assertEquals("1", Raindrops.plingPlangPlong(1));
    }

    @Test
    @DisplayName("Given two, return a String")
    public void givenTwo_ReturnString(){
        assertEquals("2", Raindrops.plingPlangPlong(2));
    }
    @Test
    @DisplayName("Given three, return Pling")
    public void givenThree_Return_Pling(){
        assertEquals("Pling", Raindrops.plingPlangPlong(3));
    }

//    givenANumberDivisibleByThree_ButNotFiveOrSeven_Return_PlingPlang(int input)
//    givenFive_Return_Plang()
//    givenANumberDivisibleByFive_ButNotThreeOrSeven_Return_Plang(int input)
//    givenFifteen_Return_PlingPlang()
//    givenANumberDivisibleByFifteen_ButNotSeven_Return_PlingPlang(int input)
//    givenSeven_Return_Plong()
//    givenANumberDivisibleBySeven_ButNotThreeOrFive_Return_Plong(int input)
//    givenTwentyOne_Return_PlingPlong()
//    givenThirtyFive_Return_PlangPlong()
//    givenOneHundredAndFive_Return_PlingPlangPlong()


}
