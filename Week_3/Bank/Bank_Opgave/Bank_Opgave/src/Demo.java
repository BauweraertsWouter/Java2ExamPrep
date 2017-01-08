import bankaccount.BankAccount;
import bankaccount.BankAccountValidator;

/**
 * 1) Schrijf een testklasse TestBankAccount om de toString-methode van de
 *    klasse BankAccount te testen.
 *
 * 2) Schrijf een testklasse TestBankAccountValidator om de validatie
 *    van het rekeningnummer te testen.
 *
 *  Let op! Pas uitvoeren als alle testen in orde zijn!
 */
public final class Demo {
    public static void main(String[] args) {
        String[] ibanNumbers = {
                "BE65409407376196", "BE39230033988719", "BE28734025250221",
                "BE29734025250220", "BA28734025250220", "BE2873402525o220"};

        for (String ibanNumber : ibanNumbers) {
            try {
                // validateAccount may throw an IllegalArgumentException (is unchecked exception)
                BankAccountValidator.validateAccount(ibanNumber);
                BankAccount ba = new BankAccount(ibanNumber);
                System.out.println(ibanNumber + " accepted: " + ba);
            } catch (IllegalArgumentException e) {
                System.out.println(ibanNumber + " NOT accepted: " + e);
            }
        }
    }
}

/* Verwachte uitvoer:
BE65409407376196 accepted: BE65 4094 0737 6196
BE39230033988719 accepted: BE39 2300 3398 8719
BE28734025250221 NOT accepted: java.lang.IllegalArgumentException: Wrong account number
BE29734025250220 NOT accepted: java.lang.IllegalArgumentException: Wrong IBAN number
BA28734025250220 NOT accepted: java.lang.IllegalArgumentException: First 2 characters must be "BE"
BE2873402525o220 NOT accepted: java.lang.IllegalArgumentException: Account number must be numeric
*/
