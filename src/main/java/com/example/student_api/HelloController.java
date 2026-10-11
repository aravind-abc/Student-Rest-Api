package com.example.student_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/welcome")
public String welcome(){
return "Helloo! mawaaa";
}

@GetMapping("/students/{id}")
public String getstudent(@PathVariable int id){
    return "Student id is" + id;
}

@GetMapping("/students")
public String findstudent(@RequestParam String name){
return "Student name: " +name;
}

@PostMapping("/students")
public String createstudent(@RequestBody Student student){
    return "Student created:" +student.getName()+",Age:" +student.getAge();
}
}

