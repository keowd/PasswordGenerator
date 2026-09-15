package passwordgenerator;

public class CharacterPool {
    /**
     * Класс реализует генерацию пула символов, из
     * которых будет состоять пароль.
     */

    private static final String LETTERS_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETTERS_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "1234567890";
    private static final String SPECIAL_SYMBOLS = "!@#$%^&*()-_=+[]{}";

    private final String pool;

    //Собирает весь пул символов пароля в единую строку.
    public CharacterPool(PasswordConfig config) {
        StringBuilder charPoolSB = new StringBuilder();

        if (config.getUsingDigits()) { charPoolSB.append(NUMBERS); }
        if (config.getUsingUpperSymbols()) { charPoolSB.append(LETTERS_UPPER); }
        if (config.getUsingLowerSymbols()) { charPoolSB.append(LETTERS_LOWER); }
        if (config.getUsingSpecialSymbols()) { charPoolSB.append(SPECIAL_SYMBOLS); }

        this.pool = charPoolSB.toString();
    }

    public String getPool() {
        return this.pool;
    }

}
