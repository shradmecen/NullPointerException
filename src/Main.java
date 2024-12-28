public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            generator.generateException();
        } catch (NullPointerException e) {
            System.out.println("Wystąpił wyjątek NullPointerException: " + e.toString());
            e.printStackTrace();
        }
    }
}
