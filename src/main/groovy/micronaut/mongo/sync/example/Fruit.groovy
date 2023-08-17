package micronaut.mongo.sync.example

import io.micronaut.core.annotation.Creator
import io.micronaut.core.annotation.NonNull
import io.micronaut.core.annotation.Nullable
import io.micronaut.serde.annotation.Serdeable
import org.bson.codecs.pojo.annotations.BsonCreator
import org.bson.codecs.pojo.annotations.BsonProperty

import jakarta.validation.constraints.NotBlank

@Serdeable
class Fruit {

    @NonNull
    @NotBlank
    @BsonProperty("name")
    String name

    @Nullable
    @BsonProperty("description")
    String description

    Fruit(@NonNull String name) {
        this(name, null)
    }

    @Creator
    @BsonCreator
    Fruit(@NonNull @BsonProperty("name") String name, @Nullable @BsonProperty("description") String description) {
        this.name = name
        this.description = description
    }

}
