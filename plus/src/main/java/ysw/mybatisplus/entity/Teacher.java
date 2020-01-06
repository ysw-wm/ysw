package ysw.mybatisplus.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("teacher")
public class Teacher {
    private int tno;
    private String tname;
}
