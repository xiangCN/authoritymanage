package cn.xiangxiang.authoritymanage.service.impl;

import cn.xiangxiang.authoritymanage.mapper.SysUserMapper;
import cn.xiangxiang.authoritymanage.model.SysUser;
import cn.xiangxiang.authoritymanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName cn.xiangxiang.authoritymanage.service.impl
 * @Author xiangxiang
 * @Time 2019-09-15 10:29
 */

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return null;
    }
}
