package unsw.comp9900.demo.order.mapper;

import com.alibaba.nacos.common.JustForTest;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import unsw.comp9900.demo.order.entity.User;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> selectallUsertest();
}
