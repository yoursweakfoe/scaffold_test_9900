package unsw.comp9900.demo.order.mapper;

import org.springframework.stereotype.Repository;
import unsw.comp9900.demo.order.entity.User;

@Repository
public interface UserMapper {
    int insertUser();
}
