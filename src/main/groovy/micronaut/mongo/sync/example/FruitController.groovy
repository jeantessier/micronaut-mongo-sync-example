package micronaut.mongo.sync.example

import io.micronaut.core.annotation.NonNull
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Status
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn

import javax.validation.Valid
import javax.validation.constraints.NotNull

@Controller("/fruits")
@ExecuteOn(TaskExecutors.IO)
class FruitController {

    FruitRepository fruitRepository

    FruitController(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository
    }

    @Get
    List<Fruit> list() {
        fruitRepository.list()
    }

    @Post
    @Status(HttpStatus.CREATED)
    void save(@NonNull @NotNull @Valid Fruit fruit) {
        fruitRepository.save(fruit)
    }

}
