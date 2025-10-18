# 🧩 Beispielaufgabe: „Bibliotheksverwaltung“

## Aufgabenstellung
Erstelle ein kleines Java-Programm zur Verwaltung einer Bibliothek.  
Das Programm soll Bücher, Autoren und die Bibliothek selbst als Objekte modellieren.  
Es **darf keine Vererbung** verwendet werden — stattdessen sollen **Objekte ineinander geschachtelt** (Komposition) sein.

---

## Anforderungen

### Klasse `Author`
- **Attribute:**
  - `String name`
  - `String email`
- **Methoden:**
  - Konstruktor zur Initialisierung aller Attribute
  - `String getInfo()` – gibt eine kurze Beschreibung des Autors zurück (z. B. „Max Mustermann (max@example.com)“)

### Klasse `Book`
- **Attribute:**
  - `String title`
  - `Author author`
  - `int year`
- **Methoden:**
  - Konstruktor zur Initialisierung
  - `String getDescription()` – gibt eine Buchbeschreibung zurück, z. B.  
    „Titel: Der Java-Profi (2024), Autor: Max Mustermann (max@example.com)“

### Klasse `Library`
- **Attribute:**
  - `String name`
  - `ArrayList<Book> books`
- **Methoden:**
  - Konstruktor zur Initialisierung
  - `void addBook(Book book)`
  - `void listBooks()` – gibt alle Bücher mit ihren Beschreibungen aus
  - `Book findBookByTitle(String title)` – gibt das Buchobjekt zurück, falls vorhanden

### Main-Klasse `LibraryApp`
- In der `main()`-Methode:
  - Erstelle ein paar `Author`-Objekte  
  - Erstelle mehrere `Book`-Objekte mit den jeweiligen Autoren  
  - Füge die Bücher zur `Library` hinzu  
  - Gib alle Bücher der Bibliothek aus  
  - Suche ein bestimmtes Buch per Titel und gib es aus

---

## Beispielausgabe

```
Bibliothek: Stadtbücherei Linz
---------------------------------
Titel: Der Java-Profi (2024), Autor: Max Mustermann (max@example.com)
Titel: Clean Code (2008), Autor: Robert C. Martin (unclebob@example.com)

Gesuchtes Buch: Clean Code (2008)
Autor: Robert C. Martin (unclebob@example.com)
```

---