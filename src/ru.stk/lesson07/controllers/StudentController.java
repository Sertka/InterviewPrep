package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import persist.Student;
import persist.StudentRepository;

@Controller
@RequestMapping("/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public String indexStudentPage(Model model) {
        logger.info("Student page update");
        model.addAttribute("students", studentRepository.findAll());
        return "student";
    }

    @GetMapping("/{id}")
    public String editStudent(@PathVariable(value = "id") Long id, Model model) {
        logger.info("Edit student with id {}", id);
        model.addAttribute("student", studentRepository.findById(id));
        return "student_form";
    }

    @GetMapping("/new")
    public String newStudent(Model model) {
        Student student = studentRepository.insert(new Student(null, null, null, null));
        model.addAttribute("student", student);
        return "student_form";
    }

    @PostMapping("/update")
    public String updateStudent(Student student) {
        studentRepository.update(student);
        return "redirect:/student";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id, Model model) {
        studentRepository.delete(id);
        return "redirect:/student";
    }
}

