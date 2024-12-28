Opis:
1. Projekt demonstruje generowanie i obsługę wyjątku NullPointerException w języku Java.
2. Składa się z dwóch klas:
- ExceptionGenerator – zawiera metodę generateException(), która celowo wywołuje NullPointerException.
- Main – główna klasa programu, w której przykład obsługi wyjątku NullPointerException został zrealizowany w bloku try-catch.

Struktura:
1. ExceptionGenerator:
  - Metoda generateException() próbuje odczytać długość łańcucha null, co skutkuje wyjątkiem NullPointerException.
2. Main:
  - Sprawdza porównanie zmiennej null z wartością "gfg", obsługując potencjalny wyjątek NullPointerException w bloku catch.
