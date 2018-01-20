# Refaktoryzacja

* ### Testy
    Unit testy sprawdzaja dzialanie, natomiast glownego pliku TaxCalculator nie został zmodyfikowany znacząco.


## Co zostało zmienione

* ### Utworzone klucze dla poszczególnych składek, żeby można było je łatwo pobierać z różnych rodzajów umów.
* ### Dla składek została utworzona klasa Obciążenie, która przechowuje klucz Obciążenia i jego kwotę. Po niej dziedziczą wszystkie składki.
* ### Klas ZestawSkladek zawiera właśnie grupę wyżej wymienionych obciążeń
* ### Wprowadzony został interfejs Obliczenia, który zawiera wymagania, które musi spełnić umowa, dla której bedziemy liczyć kwoty netto
* ### Testy dla Umowy o pracę sprawdzające, czy kwoty opodatkowania zgadzają się z obecnie panującymi :-)
* ### StopyOpodatkowania2017 jest klasą zawierającą stopy obciążeń.
* ### W sposób analogiczny do klasy Obciążenie, powinna działać klasa Ulga.

## Ponadto powinno zostać zrobione

 * ### Utworzona klasa obsługująca operacje wejścia/wyjścia, które nie łapie ogólnych wyjątków i wywołuje tylko publiczne metody konkretnych umów,'
 * ### Koszt uzyskania przychodu powinien być definiowalny per rodzaj umowy,
 * ### Nowo dodane umowy powinny zawierać wbudowane listy ulg (niezaimplementowana klasa ZestawUlg).
       Metoda implementująca setter dla tychże ulg powinna być oddzielną klasa, którą będzie można z pomocą dekoratora rozbudować o kolejne implementacje, które będę dodawały nowe ulgi.
 * ### Wyświetlanie danych na ekranie powinno owszem formatować, ale do parsowania należy użyć wywołania Double.valueOf() zamiast Double.parseDouble(), który może rzucić nieobsłużonym wyjątkiem ParseException.
 * ### Zamiast double i floatów fajnie byłoby użyć klasy [MonetaryAmount](http://www.baeldung.com/java-money-and-currency)
