package cn.xiangxiang.authoritymanage.service;

import cn.xiangxiang.authoritymanage.model.SysUser;

import java.util.List;

/**
 * @PackageName cn.xiangxiang.authoritymanage.service.impl
 * @Author xiangxiang
 * @Time 2019-09-15 10:29
 */

public interface UserService {

    List<SysUser> findAll();
}
