package ca.bautisse.cicdapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.bautisse.cicdapp.models.Student;
import ca.bautisse.cicdapp.repositories.StudentRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }

    @Override
    public Optional<Student> findByName(String studentName) {
        return studentRepo.findByName(studentName);
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student); 
    }
    
}
