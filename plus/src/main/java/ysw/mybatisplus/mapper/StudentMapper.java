package ysw.mybatisplus.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import ysw.mybatisplus.entity.Student;
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    Page<Student> studentpage(Page page);
}
