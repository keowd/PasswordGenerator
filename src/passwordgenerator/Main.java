package passwordgenerator;

public class Main {
    public static void main(String[] args) {
        PasswordConfig config = parseArgs(args);
        PasswordGenerator pg = new PasswordGenerator();
        String password = pg.generate(config);
        System.out.printf("Сгенерированный пароль: %s", password);
    }

    /**
     * Парсит флаги из потока ввода и преобразует их в конфигурацию пароля.
     */
    public static PasswordConfig parseArgs(String[] args) {
        int length = 8;
        boolean useDigits = true, useUpperSymbols = true, useLowerSymbols = true, useSpecialSymbols = true;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--length" -> length = Integer.parseInt(args[i + 1]);
                case "--digits" -> useDigits = true;
                case "--upper" -> useUpperSymbols = true;
                case "--lower" -> useLowerSymbols = true;
                case "--special" -> useSpecialSymbols = true;
            }
        }
        return new PasswordConfig(length, useDigits, useUpperSymbols, useLowerSymbols, useSpecialSymbols);
    }
}
