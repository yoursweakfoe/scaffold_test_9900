package unsw.comp9900.demo.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import unsw.comp9900.demo.order.entity.User;
import unsw.comp9900.demo.order.mapper.UserMapper;
import unsw.comp9900.demo.order.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
