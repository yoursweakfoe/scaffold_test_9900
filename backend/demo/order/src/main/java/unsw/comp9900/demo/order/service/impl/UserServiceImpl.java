package unsw.comp9900.demo.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsw.comp9900.demo.order.entity.User;
import unsw.comp9900.demo.order.mapper.UserMapper;
import unsw.comp9900.demo.order.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser() {
        userMapper.insertUser();
        return 1;
    }
}
