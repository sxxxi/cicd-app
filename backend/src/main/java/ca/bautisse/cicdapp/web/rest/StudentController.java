package ca.bautisse.cicdapp.web.rest;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.bautisse.cicdapp.models.Student;
import ca.bautisse.cicdapp.services.StudentServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping(value={"", "/"})
    public List<Student> getAllStudent(Model m) {
        return studentService.findAll();
    }

    @PostMapping(value={"", "/"})
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);     
    }
     
}
