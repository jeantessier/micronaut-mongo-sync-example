# Micronaut `mongo-sync` Example

A sample Micronaut app that uses MongoDB and the `mongo-sync` plugin.

Based on [this guide](https://guides.micronaut.io/latest/micronaut-mongodb-synchronous-gradle-java.html).

## To Run

```bash
./gradlew run
```

## Sample Calls

To create an entity:

```bash
http :8080/fruits name=Pear
```

Or sometimes:

```bash
http :8080/fruits fruit:='{"name": "Kiwi"}'
```

To list all entities:

```bash
http :8080/fruits
```
