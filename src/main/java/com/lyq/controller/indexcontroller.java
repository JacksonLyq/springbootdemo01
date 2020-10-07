package com.lyq.controller;

import com.lyq.enity.Student;
import com.lyq.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@ResponseBody
public class indexcontroller {
    @Autowired
    private StudenService studenService;
    @RequestMapping("/all")
    public String toIndex(){
        System.out.println("页面跳转成功。。。。。。正在前往list页面");
        return "list.html";

    }

    @RequestMapping("/insert")
    public String insert(Student student){
        System.out.println("页面跳转成功。。。。。。正在前往list页面");
        studenService.insert(student);


        return "list.html";

    }

    @RequestMapping("/select")
    public String select(Model model){
        System.out.println("正在查询所有学生信息。。。");
        List<Student> list =studenService.selectAll();

        model.addAttribute("list", list);
        return "studentList.html";
    }


    @RequestMapping("/update/{stuId}")
    public String toUpdate(@PathVariable("stuId") String stuId,Model model){
        Student student=studenService.selectStuById(stuId);

        model.addAttribute("student",student);
        return "update.html";
    }

//    @RequestMapping("/update")
    @PostMapping("/update")
    public String update (Student student, Model model  ){
        studenService.update(student);
        List<Student> list =studenService.selectAll();
        model.addAttribute("list", list);
        return "studentList.html";

        //或者直接重定向 redirect:/select，省去了addAttribute这步
    }




}
