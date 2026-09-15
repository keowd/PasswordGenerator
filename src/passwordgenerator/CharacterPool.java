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

    public CharacterPool(PasswordConfig config) {}

    public String getPool() {
        return this.pool;
    }


}
