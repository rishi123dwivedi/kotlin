package com.kotlin.mongo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Student (

    var id:Int,
    var name:String,
    var rollno:String,
    var percentage:Int

)