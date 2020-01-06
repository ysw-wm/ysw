package ysw.mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ysw.mybatisplus.entity.Student;
import ysw.mybatisplus.mapper.StudentMapper;


@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public IPage<Student> studentpage( Integer current, Integer size) {
        Integer count = studentMapper.selectCount(null);
        Page<Student> page = new Page<>(current, size, count);
        return studentMapper.studentpage(page);
    }
}

