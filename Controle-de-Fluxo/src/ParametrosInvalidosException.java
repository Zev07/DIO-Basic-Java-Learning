public class ParametrosInvalidosException extends Exception { // Adiciona 'extends Exception'
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}