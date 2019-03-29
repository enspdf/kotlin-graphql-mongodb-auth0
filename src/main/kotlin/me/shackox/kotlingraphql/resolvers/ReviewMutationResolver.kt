package me.shackox.kotlingraphql.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import me.shackox.kotlingraphql.entity.Review
import me.shackox.kotlingraphql.repository.ReviewRepository
import org.springframework.stereotype.Component

@Component
class ReviewMutationResolver(private val reviewRepository: ReviewRepository) : GraphQLMutationResolver {
    fun newReview(snackId: String, rating: Int, text: String): Review {
        val review = Review(snackId, rating, text)
        reviewRepository.save(review)
        return review
    }
}