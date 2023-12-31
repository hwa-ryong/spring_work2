package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.OrderData;
import aaa.model.StudentData;

@Controller
@RequestMapping("request/student")
public class StudentController {
   
   @GetMapping
   String studentForm() {
      return "req/studentForm";
   }
   
   @PostMapping
   String studentReg(StudentData sd) {
      System.out.println(sd);
      return "req/studentReg";
   }
}