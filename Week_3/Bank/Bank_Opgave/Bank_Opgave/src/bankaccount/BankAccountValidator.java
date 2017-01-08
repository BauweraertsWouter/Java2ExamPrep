package bankaccount;

/**
 * Validatie van een IBAN bankrekeningnr volgens de regels op: https://nl.wikipedia.org/wiki/International_Bank_Account_Number
 * Structuur:  BEkk BBBC CCCC CCKK
 * BE: landcode
 * kk: controleGetal van hele IBAN
 * BBB: BankCode
 * CCCCCCC: rekeningNr
 * KK: controleGetal van rekeningNr
 */
public final class BankAccountValidator {
    private final static String LANDCODE = "BE";

    /**
     * Deze methode valideert een IBAN rekeningnr en doet een throw van een IllegalArgumentException indien er iets
     * niet klopt.
     * @param iban in de vorm van een String
     * @throws IllegalArgumentException
     */
    public static void validateAccount(String iban) throws IllegalArgumentException {
        iban = iban.toUpperCase();
        //Controleer lengte
        if (iban.length() != 16) {
            throw new IllegalArgumentException("IBAN BankAccount must have 16 characters");
        }
        //Controleer landcode
        if (!iban.substring(0, 2).equals(LANDCODE)) {
            throw new IllegalArgumentException("First 2 characters must be \"" + LANDCODE + "\"");
        }
        //Controleer het eigenlijke rekeningnr (vanaf 5e positie)
        String account = iban.substring(4);
        try {
            Long.parseLong(account);
            long eigenlijkNummer = Long.parseLong(account.substring(0, 10));
            int controleGetal = Integer.parseInt(account.substring(10, 12));
            //Controlegetal vergelijken met modulo 97
            if (!(eigenlijkNummer % 97 == 0 && controleGetal == 97)) {
                if (eigenlijkNummer % 97 != controleGetal) {
                    throw new IllegalArgumentException("Wrong account number");
                }
            }
            //De eerste 4 karakters wegknippen:
            String newIban = iban.substring(4);
            //"BE" vervangen door "1114" en achteraan bijplakken:
            String landCode = iban.substring(0, 2);
            newIban += replaceLandCode(landCode);
            //controlegetal iban achteraan bijplakken:
            newIban += iban.substring(2, 4);
            //Rest bij deling door 97 moet 1 zijn:
            long ibanNr = Long.parseLong(newIban);
            if(ibanNr % 97 != 1) {
                throw new IllegalArgumentException("Wrong IBAN number");
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Account number must be numeric");
        }
    }

    /**
     * Deze methode vervangt elke letter van de landcode door 2 cijfers, waarbij A = 10, B = 11, ..., Z = 35
     * Bijvoorbeeld "BE" wordt dan: "1114"
     * @param landCode van 2 letters (zoals "BE")
     * @return nieuwe String met 4 cijfers (bijvoorbeeld "1114")
     */
    private static String replaceLandCode(String landCode) {
        String str = "";
        landCode = landCode.toUpperCase();
        for (int i = 0; i < landCode.length(); i++) {
            int getal = landCode.charAt(i) - 'A' + 10;
            str += getal;
        }
        return str;
    }

}

