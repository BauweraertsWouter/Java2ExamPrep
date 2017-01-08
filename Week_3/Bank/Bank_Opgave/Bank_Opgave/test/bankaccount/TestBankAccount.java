package bankaccount;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testklasse voor JUnit, test de klasse BankAccount.
 */
public class TestBankAccount {

    /**
     * Test de constructor en de toString methode.
     */
    @Test
    public void bankAccountConstructorTest(){
        assertEquals(BankAccount.class, new BankAccount("BE39230033988719").getClass());
    }

    @Test
    public void bankAccountToStringTest(){
        String shouldBeReturnValue = "BE39 2300 3398 8719";

        assertEquals(shouldBeReturnValue, new BankAccount("BE39230033988719").toString());
    }

}

