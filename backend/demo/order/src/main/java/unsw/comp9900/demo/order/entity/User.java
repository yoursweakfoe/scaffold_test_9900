package unsw.comp9900.demo.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

@Data
@TableName("users")
public class User {
    private Integer id;
    private String name;
}