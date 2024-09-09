package nl.han.aim.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzExecutorTest {

    private FizzBuzzExecutorTest sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutorTest();
    }

    public String execute(int i){
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

    //@Test
    /*void executeWithValidIntTest(){
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }*/

    @Test
    void executeWhichReturnsFizzTest(){
        // Act
        var testValue = sut.execute(6);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWhichReturnsBuzzTest(){
        // Act
        var testValue = sut.execute(10);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWhichReturnsFizzBuzzTest(){
        // Act
        var testValue = sut.execute(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}
