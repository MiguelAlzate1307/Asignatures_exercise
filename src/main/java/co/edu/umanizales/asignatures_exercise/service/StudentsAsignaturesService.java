package co.edu.umanizales.asignatures_exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.umanizales.asignatures_exercise.models.Asignature;
import co.edu.umanizales.asignatures_exercise.models.Student;
import co.edu.umanizales.asignatures_exercise.util.Response;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsAsignaturesService {
    @Autowired
    private StudentsService studentsService;

    @Autowired
    private AsignaturesService asignaturesService;

    public Response<Asignature> enrollStudent(String code, byte id) {
        Response<Student> student = studentsService.getStudent(id);

        if (student.getMessage() != null) {
            return new Response<>(null, "Student not found");
        }

        Response<Asignature> response = asignaturesService.addStudent(code, student.getData());


        if (response.getMessage() != null) {
            return new Response<>(null, response.getMessage());
        }

        return new Response<Asignature>(response.getData(), null);
    }

    public List<Student> getStudentsByLetter(String letter) {
        return studentsService.getAllStudents()
                              .stream()
                              .filter(s -> s.getName().startsWith(letter) || s.getName().endsWith(letter))
                              .collect(Collectors.toList());
    }
}
