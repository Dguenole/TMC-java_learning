# Java Programming MOOC — University of Helsinki

Exercices du cours [Java Programming I & II](https://java-programming.mooc.fi/) de l'Université d'Helsinki, réalisés dans le cadre de mon apprentissage Java vers un profil **développeur backend Java/Spring confirmé**.

## Progression

| Partie | Thèmes couverts | Statut |
|--------|----------------|--------|
| Part 01 | Bases du langage, variables, types, entrées/sorties, conditions | ✅ Complété |
| Part 02 | Boucles (while, for), logique conditionnelle, compteurs, accumulateurs | ✅ Complété |
| Part 03 | ArrayList, manipulation de strings, algorithmes de recherche | ✅ Complété |
| Part 04 | Objets, classes, encapsulation, lecture de fichiers | ✅ Complété |
| Part 05 | Objets avancés, equals, composition, références | ✅ Complété |
| Part 06 | Collections avancées | 🔄 En cours |
| Part 07 | Traitement de fichiers, exceptions | ⏳ À venir |

## Concepts maîtrisés

**Part 01**
- Variables et types primitifs (`int`, `double`, `boolean`, `String`)
- Entrées utilisateur avec `Scanner`
- Conditions (`if`, `else if`, `else`)
- Opérateurs de comparaison et logiques
- Affichage formaté

**Part 02**
- Boucles `while` et `for`
- Boucle infinie avec `break`
- Compteurs et accumulateurs
- Logique pair/impair (`%`)
- Calcul de moyennes
- Boucles imbriquées

**Part 03**
- `ArrayList` — ajout, lecture, parcours avec `for-each`
- Manipulation de strings (`split`, `trim`, `indexOf`, `contains`)
- Lecture de données structurées (format `nom,valeur`)
- Algorithmes de recherche (plus grand, plus petit, index minimal)
- Accumulation de données (somme, moyenne, compteur)
- Suppression d'éléments pendant le parcours

**Part 04**
- Classes et objets — conception, instanciation, encapsulation
- Constructeurs et initialisation des attributs
- Getters, setters, méthodes métier
- `toString()` — représentation textuelle des objets
- Objets comme paramètres et valeurs de retour
- Listes d'objets (`ArrayList<ObjetPersonnalisé>`)
- Lecture de fichiers avec `Scanner` + `Paths.get()`
- Gestion d'exceptions (`try-catch`)
- Classes utilitaires (Statistics, PaymentCard, etc.)

**Part 05**
- Primitives vs références — différences fondamentales
- Passage d'objets en paramètre (copie de référence)
- `NullPointerException` — causes et prévention
- Surcharge de méthodes (`overloading`)
- `equals()` — comparaison correcte d'objets (`@Override`)
- Composition d'objets (ex. `Timer` avec deux `ClockHand`)
- `contains()` sur les listes — utilisation de `equals()`
- Objets immuables et mutables

## Structure du repo

```
TMC-java_learning/
├── part01/         # Variables, conditions, I/O
├── part02/         # Boucles, compteurs, accumulateurs
├── part03/         # ArrayList, strings, algorithmes
├── part04/         # Objets, classes, fichiers
├── part05/         # Références, equals, composition
├── part06/         # En cours
└── ...
```

## Contexte

Ce repo fait partie de mon parcours d'apprentissage Java sur 8 ans visant le niveau **développeur backend confirmé**. Il est complémentaire à mon repo [java-learning](https://github.com/Dguenole/java-learning) qui contient mes projets personnels (gestion immobilière POO, simulateur d'investissement, etc.).

**Stack cible :** Java 21 · Spring Boot · PostgreSQL · Docker · DevOps

---

*Cours : [java-programming.mooc.fi](https://java-programming.mooc.fi/) — University of Helsinki*