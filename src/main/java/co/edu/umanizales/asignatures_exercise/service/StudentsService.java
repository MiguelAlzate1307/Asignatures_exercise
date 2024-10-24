package co.edu.umanizales.asignatures_exercise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import co.edu.umanizales.asignatures_exercise.models.Student;
import co.edu.umanizales.asignatures_exercise.util.Response;

@Service
public class StudentsService {
    private byte currentId = 1;
    private List<Student> students;

    public StudentsService() {
        this.students = new ArrayList<>();
    }

    public Student createStudent(Student student) {
        student.setId(currentId++);
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Response<Student> getStudent(byte id) {
        Student student = students.stream()
                                       .filter(s -> s.getId() == id)
                                       .findFirst()
                                       .orElse(null);

        if (student == null) {
            return new Response<>(null, "Student not found");
        }

        return new Response<Student>(student, null);
    }

    public String deleteStudent(byte id) {
        Response<Student> student = getStudent(id);

        if (student.getMessage() != null) {
            return student.getMessage();
        }

        students.remove(student.getData());

        return "Student deleted successfully";
    }
}
