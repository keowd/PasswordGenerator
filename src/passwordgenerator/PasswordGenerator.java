package passwordgenerator;
import java.security.SecureRandom;

public class PasswordGenerator {

    private final SecureRandom randomizer = new SecureRandom();

    public String generate(PasswordConfig config) {
        CharacterPool pool = new CharacterPool(config);
        String poolCharacters = pool.getPool();
        StringBuilder password = new StringBuilder(config.length);

        // Собирает тело пароля, проходясь по пулу возможных символов.
        for (int i = 0; i < config.length; i++) {
            int index = randomizer.nextInt(poolCharacters.length());
            password.append(poolCharacters.charAt(index));
        }
        return password.toString();
    }
}
