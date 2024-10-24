package co.edu.umanizales.asignatures_exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.umanizales.asignatures_exercise.util.Response;
import co.edu.umanizales.asignatures_exercise.models.Asignature;
import co.edu.umanizales.asignatures_exercise.models.Student;
import co.edu.umanizales.asignatures_exercise.service.StudentsAsignaturesService;

import java.util.List;

@RestController
@RequestMapping("/asignatures/students")
public class StudentsAsignaturesController {
    @Autowired
    private StudentsAsignaturesService studentsAsignaturesService;

    @PostMapping("/{code}/{id}")
    public Response<Asignature> enrollStudent(@PathVariable String code, @PathVariable byte id) {
        return studentsAsignaturesService.enrollStudent(code, id);
    }

    @GetMapping("/{letter}")
    public List<Student> getStudentsByLetter(@PathVariable String letter) {
        return studentsAsignaturesService.getStudentsByLetter(letter);
    }
}