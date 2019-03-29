package me.shackox.kotlingraphql.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import me.shackox.kotlingraphql.entity.Review
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Component

@Component
class ReviewQueryResolver(val mongoOperations: MongoOperations) : GraphQLQueryResolver {
    fun reviews(snackId: String): List<Review> {
        val query = Query()
        query.addCriteria(Criteria.where("snackI").`is`(snackId))
        return mongoOperations.find(query, Review::class.java)
    }
}