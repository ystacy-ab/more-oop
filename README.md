Key points:
setHp() sets health to 0 if it goes below 0.
CharacterFactory uses the Factory pattern with Reflection.
King and Knight share kick logic to avoid code duplication.
Kick strategies can be separated via KickStrategy interface for easier new character creation.
Includes unit tests with JUnit 5.
CI/CD is configured using GitHub Actions.
Usage:
Run fights via GameManager.fight(c1, c2)
Run tests with Maven: mvn test
