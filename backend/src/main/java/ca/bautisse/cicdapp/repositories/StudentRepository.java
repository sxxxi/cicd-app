package ca.bautisse.cicdapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.bautisse.cicdapp.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
   public Optional<Student> findByName(String name); 
}
