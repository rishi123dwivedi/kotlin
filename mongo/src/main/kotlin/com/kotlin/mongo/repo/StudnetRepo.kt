package com.kotlin.mongo.repo

import com.kotlin.mongo.model.Student
import org.springframework.data.mongodb.repository.MongoRepository

interface StudentRepo:MongoRepository<Student,Int> {
}