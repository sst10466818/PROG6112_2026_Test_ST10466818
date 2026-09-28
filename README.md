# PROG6112_2026_Test_ST10466818
prog test
# PROG6112 Exam Prep — total console devices sold for the number 1 electronics store

## How to run each project

Both are plain Maven projects. From inside `Question1/` or `Question2/`:

```
mvn compile exec:java   # runs the app
mvn test                 # runs the JUnit tests
```

If you don't have Maven set up, you can also compile by hand from the project root:

```
javac -d out src/main/java/estateagent/*.java
java -cp out estateagent.Main
