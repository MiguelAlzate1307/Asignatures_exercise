package co.edu.umanizales.asignatures_exercise.models;

import java.util.List;
import java.util.ArrayList;

public abstract class Asignature {
    protected String code;
    protected String name;
    protected List<Student> students;
    
    public Asignature(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public abstract boolean isVirtual();
}
