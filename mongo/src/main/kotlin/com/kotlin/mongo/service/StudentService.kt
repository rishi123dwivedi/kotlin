package com.kotlin.mongo.service

import com.kotlin.mongo.model.Student
import com.kotlin.mongo.repo.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class StudentService (@Autowired val studentRepo:StudentRepo){

    fun getAllStudent() : List<Student> {
      return  studentRepo.findAll()
    }

    fun findStudentById(id:Int) : Student {
        val student:Student = studentRepo.findById(id).get()
        return student
    }

    fun updateStudent(student:Student){
        var findById :Student = studentRepo.findById(student.id).get()
         findById.name=student.name
        findById.rollno=student.rollno
        findById.percentage=student.percentage
        studentRepo.save(findById)
    }
}