package unsw.comp9900.demo.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import unsw.comp9900.demo.order.entity.User;
import unsw.comp9900.demo.order.mapper.UserMapper;
import unsw.comp9900.demo.order.service.UserService;

import java.util.List;

@SpringBootTest
public class test {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void testSelectList() {
        long count = userService.count();
        System.out.println(count);
    }


}
