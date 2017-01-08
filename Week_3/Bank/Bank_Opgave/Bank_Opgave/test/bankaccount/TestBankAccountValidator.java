package bankaccount;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBankAccountValidator {
    // Testdata:
    private String[] accounts = {
            "BE65409407376196", "BE39230033988719", //juiste nummers
            "BE2873402525022", "BE29734025250220", "BA28734025250220", "BE2873402525o220"}; //foutieve nummers

    /**
     * Test de validatie van twee goede rekeningnummers.
     * Er mag geen exception optreden.
     */
    @Test
    public void validAccountNumberTest(){
        try {
            BankAccountValidator.validateAccount(accounts[0]);
            BankAccountValidator.validateAccount(accounts[1]);
        }catch (Exception e){
            Assert.fail("This shoul not throw an exception");
        }
    }


    /**
     * Test de validatie van een rekeningnummer met te weinig cijfers.
     * Er moet een IllegalArgumentException optreden.
     */
    @Test(expected = IllegalArgumentException.class)
    public void ibanWithMissingNumbersTest(){
        BankAccountValidator.validateAccount(accounts[2]);
    }


    /**
     * Test de validatie van een rekeningnummer met een verkeerde landcode.
     * Er moet een IllegalArgumentException optreden.
     */
    @Test(expected = IllegalArgumentException.class)
    public void ibanWithWrongCountryCodeTest(){
        BankAccountValidator.validateAccount(accounts[4]);
    }


    /**
     * Test de validatie van een rekeningnummer dat niet numerieke tekens bevat.
     * Er moet een IllegalArgumentException optreden.
     */
    @Test(expected = IllegalArgumentException.class)
    public void ibanWithNonNumericCharactersTest(){
        BankAccountValidator.validateAccount(accounts[5]);
    }


    /**
     * Test de validatie van een niet geldig rekeningnummer.
     * Er moet een IllegalArgumentException optreden.
     */
    @Test(expected = IllegalArgumentException.class)
    public void invalidAccountNumberTest(){
        BankAccountValidator.validateAccount(accounts[3]);
    }

}