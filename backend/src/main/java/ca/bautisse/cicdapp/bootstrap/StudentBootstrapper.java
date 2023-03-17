package ca.bautisse.cicdapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.bautisse.cicdapp.models.Student;
import ca.bautisse.cicdapp.services.StudentService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class StudentBootstrapper implements CommandLineRunner {
    private final StudentService studService;

    @Override
    public void run(String... args) throws Exception {
        Student stud0 = new Student("Domino");
        Student stud1 = new Student("Scoobs");
        Student stud2 = new Student("Snek");
        studService.save(stud0); 
        studService.save(stud1); 
        studService.save(stud2); 
    }
    
}
