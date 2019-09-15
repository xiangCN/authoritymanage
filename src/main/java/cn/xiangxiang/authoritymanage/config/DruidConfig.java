package cn.xiangxiang.authoritymanage.config;

import cn.xiangxiang.authoritymanage.config.properties.DruidDataSourceProperties;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;

/**
 * @PackageName cn.xiangxiang.authoritymanage.config
 * @Author xiangxiang
 * @Time 2019-09-15 11:12
 */

@Configuration
@EnableConfigurationProperties({DruidDataSourceProperties.class}) // 这个和ConfigurationProperties注解一起使用
public class DruidConfig {

    @Autowired
    private DruidDataSourceProperties properties;

    //@Bean
    @ConditionalOnMissingBean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        return dataSource;
    }

    @Bean
    @ConditionalOnMissingBean
    public ServletRegistrationBean<Servlet> druidServlet() {
        ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        servletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletRegistrationBean.addInitParameter("loginPassword", "admin");
        servletRegistrationBean.addInitParameter("resetEnable", "true");
        return servletRegistrationBean;
    }

    //@Bean
    @ConditionalOnMissingBean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        return null;
    }
}
