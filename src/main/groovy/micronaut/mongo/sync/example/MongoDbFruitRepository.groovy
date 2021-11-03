package micronaut.mongo.sync.example

import com.mongodb.client.MongoClient
import io.micronaut.core.annotation.NonNull
import jakarta.inject.Singleton

import javax.validation.Valid
import javax.validation.constraints.NotNull

@Singleton
class MongoDbFruitRepository implements FruitRepository {

    MongoDbConfiguration mongoConf
    MongoClient mongoClient

    MongoDbFruitRepository(MongoDbConfiguration mongoConf, MongoClient mongoClient) {
        this.mongoConf = mongoConf
        this.mongoClient = mongoClient
    }

    void save(@NonNull @NotNull @Valid Fruit fruit) {
        collection.insertOne(fruit)
    }

    List<Fruit> list() {
        return collection.find().into(new ArrayList<>())
    }

    @NonNull
    def getCollection() {
       mongoClient.getDatabase(mongoConf.name).getCollection(mongoConf.collection, Fruit.class)
    }

}
