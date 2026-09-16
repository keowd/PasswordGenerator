package passwordgenerator;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * Парсит флаги из потока ввода и преобразует их в конфигурацию пароля.
     */
    public static PasswordConfig parseArgs(String[] args) {
        int length = 8;
        boolean useDigits = false, useUpperSymbols = false, useLowerSymbols = false, useSpecialSymbols = false;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--length" -> length = Integer.parseInt(args[i]);
                case "--digits" -> useDigits = true;
                case "--upper" -> useUpperSymbols = true;
                case "--lower" -> useLowerSymbols = true;
                case "--special" -> useSpecialSymbols = true;
            }
        }

        return new PasswordConfig(length, useDigits, useUpperSymbols, useLowerSymbols, useSpecialSymbols);
    }
}
