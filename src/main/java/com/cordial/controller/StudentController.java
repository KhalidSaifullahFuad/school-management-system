package com.cordial.controller;

import com.cordial.dao.StudentDAO;
import com.cordial.model.Student;
import com.cordial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/create")
    public ModelAndView create(Model model){

        List<String> classList = new ArrayList<>(List.of("Class 1", "Class 2", "Class 3", "Class 4", "Class 5"));

        model.addAttribute("title", "Create Student");
        model.addAttribute("classList", classList);
        model.addAttribute("student", new Student());

        return new ModelAndView("student/create", "model", model);
    }

    @PostMapping("/store")
    public String store(Model model, @ModelAttribute("student") Student student){
        model.addAttribute("student", student);

        student.setId(System.currentTimeMillis());
        studentDAO.insert(student);

        return "student/show";
    }

    @GetMapping("/maintain")
    public String maintain(Model model) {

        List<Student> studentList = studentDAO.getAll();
        model.addAttribute("studentLista", studentList);

        return "student/maintain";
    }

//    public String store(HttpServletRequest request) {
//        Map<String, String[]> requestMap = request.getParameterMap();
//        studentService.insert(requestMap);
//
//        return "maintain";
//    }
}
