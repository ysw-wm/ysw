package ysw.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ysw.mybatisplus.entity.Student;
import ysw.mybatisplus.mapper.StudentMapper;
import ysw.mybatisplus.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;
    private Student student;

    @RequestMapping(value = "pageinfo", method = RequestMethod.GET)
    public IPage<Student> studentpage(@RequestParam Integer current, @RequestParam Integer size) {
        return studentService.studentpage(current, size);
    }

    @GetMapping("studentsinfo")
    public List<Student> studentsinfo() {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Student::getSno, 1);
        queryWrapper.isNull("Sname");
        queryWrapper.getSqlSelect();
        queryWrapper.getSqlSet();
        return studentMapper.selectList(queryWrapper);
    }

}
