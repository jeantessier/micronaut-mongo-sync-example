package micronaut.mongo.sync.example

import io.micronaut.core.annotation.NonNull

import javax.validation.Valid
import javax.validation.constraints.NotNull

interface FruitRepository {
    @NotNull
    List<Fruit> list()

    void save(@NonNull @NotNull @Valid Fruit fruit)
}
