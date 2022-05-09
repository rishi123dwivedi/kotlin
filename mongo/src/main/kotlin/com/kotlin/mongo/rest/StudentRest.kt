package com.kotlin.mongo.rest

import com.kotlin.mongo.model.Student
import com.kotlin.mongo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentRest (@Autowired val studentService: StudentService){

    @GetMapping("/")
    fun hello():String="HELLO"

    @GetMapping("/getAllStudents")
    fun getAllStudents() :List<Student> = studentService.getAllStudent()

    @GetMapping("/findById")
    fun findById(@RequestParam id:Int) :Student=studentService.findStudentById(id)

    @PostMapping("updateStudent")
    fun udateStudent(@RequestBody student:Student)=studentService.updateStudent(student)
}