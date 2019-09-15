package cn.xiangxiang.authoritymanage;

import cn.xiangxiang.authoritymanage.mapper.SysUserMapper;
import cn.xiangxiang.authoritymanage.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthoritymanageApplicationTests {

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {

        System.out.println("dataSource: "+dataSource);
        System.out.println("userMapper: "+userMapper);

    }

}
