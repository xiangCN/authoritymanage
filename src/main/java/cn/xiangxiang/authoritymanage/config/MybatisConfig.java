package cn.xiangxiang.authoritymanage.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 *
 * 配置mybatis的SqlSessionFactory
 *
 * @PackageName cn.xiangxiang.authoritymanage.config
 * @Author xiangxiang
 * @Time 2019-09-14 22:57
 */

@Configuration
@MapperScan("cn.xiangxiang.authoritymanage.mapper")
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("cn.xiangxiang.authoritymanage.**.model");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:cn/xiangxiang/authoritymanage/mapper/**/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }
}
