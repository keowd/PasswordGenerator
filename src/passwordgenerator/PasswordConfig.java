package passwordgenerator;

public class PasswordConfig {
    /**
     * Настройки конфигурации пароля.
     */

    int length;
    private boolean useDigits;
    private boolean useUpperSymbols;
    private boolean useLowerSymbols;
    private boolean useSpecialSymbols;

    /**
     * Создаётся один раз, поэтому значения полей
     * конфигурируются только через конструктор.
     */
    public PasswordConfig(boolean useDigits, boolean useUpperSymbols,
                          boolean useLowerSymbols, boolean useSpecialSymbols) {
        this.useDigits = useDigits;
        this.useLowerSymbols = useLowerSymbols;
        this.useUpperSymbols = useUpperSymbols;
        this.useSpecialSymbols = useSpecialSymbols;
    }

    public boolean getUsingDigits() {
        return this.useDigits;
    }

    public boolean getUsingUpperSymbols() {
        return this.useUpperSymbols;
    }

    public boolean getUsingLowerSymbols() {
        return this.useLowerSymbols;
    }

    public boolean getUsingSpecialSymbols() {
        return this.useSpecialSymbols;
    }

}
