package micronaut.mongo.sync.example

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.core.annotation.NonNull
import io.micronaut.core.naming.Named

@ConfigurationProperties("db")
interface MongoDbConfiguration extends Named {

    @NonNull
    String getCollection()

}
