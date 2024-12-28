Opis projektu
    Projekt demonstruje obsługę wyjątków w Javie poprzez celowe generowanie i przechwytywanie wyjątku NullPointerException. 

Klasy:
    1. ExceptionGenerator – klasa z metodą generateException(), która generuje wyjątek NullPointerException.
    2. Main – klasa główna, która wywołuje metodę generateException() i obsługuje wyjątek w bloku try-catch.

Struktura projektu
    1. ExceptionGenerator.java:
        Klasa zawiera metodę generateException(), która próbuje wywołać metodę .length() na zmiennej o wartości null, co powoduje NullPointerException.
    2. Main.java:
        Klasa główna programu, w której metoda main():
        a. Tworzy obiekt klasy ExceptionGenerator.
        b. Wywołuje metodę generateException() w bloku try.
        c. Przechwytuje i obsługuje wyjątek w bloku catch, wyświetlając komunikaty i ślad stosu.
