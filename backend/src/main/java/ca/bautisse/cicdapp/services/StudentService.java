package ca.bautisse.cicdapp.services;

import java.util.List;
import java.util.Optional;

import ca.bautisse.cicdapp.models.Student;

public interface StudentService {
    public List<Student> findAll();
    public Optional<Student> findById(Long id); 
    public Optional<Student> findByName(String studentName);
    public Student save(Student student);
}
