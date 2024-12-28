1. Opis
Projekt demonstruje generowanie i obsługę wyjątku NullPointerException w języku Java.
Składa się z dwóch klas:
a. ExceptionGenerator – zawiera metodę generateException(), która celowo wywołuje NullPointerException.
b. Main – główna klasa programu, w której przykład obsługi wyjątku NullPointerException został zrealizowany w bloku try-catch.

3. Struktura
a. ExceptionGenerator – Metoda generateException() próbuje odczytać długość łańcucha null, co skutkuje wyjątkiem NullPointerException.
b. Main – Sprawdza porównanie zmiennej null z wartością "gfg", obsługując potencjalny wyjątek NullPointerException w bloku catch.
