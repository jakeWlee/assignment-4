package com.example.gradesubmission;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Potter", "Potions", "72", "C-"),
        new Grade("Hermione", "Granger", "Arithmancy", "98", "A+"),
        new Grade("Neville", "Longbottom", "Charms", "91", "A-"),
        new Grade("Ron", "Weasley", "Defense Against the Dark Arts", "82", "B"),
        new Grade("Luna", "Lovegood", "Astronomy", "94", "A")
    );

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
