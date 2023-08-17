package micronaut.mongo.sync.example

import io.micronaut.core.annotation.NonNull

import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

interface FruitRepository {
    @NotNull
    List<Fruit> list()

    void save(@NonNull @NotNull @Valid Fruit fruit)
}
