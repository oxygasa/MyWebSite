package app.entities;

public class InputValues {
    //Сущность "показания счетчиков".
    private String value;
    private String secretCode;
    public InputValues() {
    }
    public InputValues(String value, String secretCode) {
        this.value = value;
        this.secretCode = secretCode;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    //На всякий случай переопределяю методы, чтобы "имя" и "пароль" отображались только как текст.
    @Override
    public String toString() {
        return "InputValues{" +
                "value='" + value + '\'' +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }
    //На всякий случай переопределяем.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InputValues inputValues = (InputValues) o;

        if (value != null ? !value.equals(inputValues.value) : inputValues.value != null) return false;
        return secretCode != null ? secretCode.equals(inputValues.secretCode) : inputValues.secretCode == null;

    }
    //На всякий случай переопределяем.
    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (secretCode != null ? secretCode.hashCode() : 0);
        return result;
    }
}
