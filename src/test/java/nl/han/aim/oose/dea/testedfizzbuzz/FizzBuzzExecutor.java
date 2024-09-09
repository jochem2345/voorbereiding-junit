package nl.han.aim.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;

public class FizzBuzzExecutor {

    public String execute(int i){
        return null;
    }

    void executeWithValidIntTest(){
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }
}
