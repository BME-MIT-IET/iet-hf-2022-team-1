# Nem-funkcionális tesztek eredményei

## Sudoku-solver
### Használhatóság

A probléma megoldásához felhasználtam a könyvtár által tartalmazott példakódot kisebb módosításokkal.
A használhatóság ellenőrzésére először egy 9x9-es sudoku táblával próbáltam ki az algoritmust, ami megfelelően le is futott.
Mivel az algoritmus integer típúsú 2D listát vár így nem is tudunk megadni negatív, illetve nem egész értékeket.
Miután egy kész sudokut adtam oda az algoritmusnak helyesen nem kezdett vele semmit.
Ha egy érvénytelen sudoku táblát adunk oda a programnak akkor helyesen jelzi, hogy az adott sudoku nem megoldható, viszont egy kész, hibás sudokura már nem jelzi, hogy az adott sudoku érvénytelen.
Ettől a problémától eltekintve az algoritmus jól használható.