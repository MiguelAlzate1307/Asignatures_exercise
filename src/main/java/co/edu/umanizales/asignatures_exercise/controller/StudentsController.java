package co.edu.umanizales.asignatures_exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.umanizales.asignatures_exercise.models.Student;
import co.edu.umanizales.asignatures_exercise.service.StudentsService;
import co.edu.umanizales.asignatures_exercise.util.Response;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentsService.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentsService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Response<Student> getStudent(@PathVariable byte id) {
        return studentsService.getStudent(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable byte id) {
        return studentsService.deleteStudent(id);
    }
}
