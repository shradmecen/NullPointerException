// Metoda, która generuje wyjątek NullPointerException

public class ExceptionGenerator {
    public void generateException() {
        String nullString = null;
        nullString.length();
    }
}
