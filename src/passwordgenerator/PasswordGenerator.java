package passwordgenerator;
import java.security.SecureRandom;

public class PasswordGenerator {

    private final SecureRandom rangomizer = new SecureRandom();

    public String generate(PasswordConfig config) {
        CharacterPool pool = new CharacterPool(config);
        String poolCharacters = pool.getPool();
        StringBuilder password = new StringBuilder(config.length);

        // Собирает тело пароля, проходясь по пулу возможных символов.
        for (int i = 0; i < config.length; i++) {
            int index = rangomizer.nextInt(poolCharacters.length());
            password.append(poolCharacters.charAt(index));
        }
        return password.toString();
    }
}
