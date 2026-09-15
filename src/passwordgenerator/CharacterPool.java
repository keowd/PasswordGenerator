package passwordgenerator;

public class CharacterPool {

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
