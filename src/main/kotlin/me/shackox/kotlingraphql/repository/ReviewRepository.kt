package me.shackox.kotlingraphql.repository

import me.shackox.kotlingraphql.entity.Review
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : MongoRepository<Review, String>