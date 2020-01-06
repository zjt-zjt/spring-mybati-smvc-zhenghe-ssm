import com.lanou.zhenghe.bean.User;
import com.lanou.zhenghe.bean.UserExample;
import com.lanou.zhenghe.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import java.util.List;


public class TestUser  extends base{

    @Autowired
    private UserMapper userMapper;

       @Test
    public void testQuery() {
           UserExample condition = new UserExample();
        List<User> user = userMapper.selectByExample(condition);
        System.out.println("共查询到:" + user.size()+"条数据.");
        for(User users: user) {
            System.out.println(users);
        }
    }


}
