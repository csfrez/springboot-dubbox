package cn.zhangxd.platform.admin.web.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import cn.zhangxd.platform.common.web.config.AbstractWebSecurityConfig;

/**
 * spring-security配置
 *
 * @author zhangxd
 */
@Configuration
public class WebSecurityConfig extends AbstractWebSecurityConfig {

    @Override
    protected void configure(HttpSecurity security) throws Exception {
        security.authorizeRequests().antMatchers(HttpMethod.POST, "/auth/token").permitAll();
        /*
        security.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/auth/token").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.GET, "/sys/user/info").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/sys/user/info").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.GET, "/sys/menu/nav").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/sys/menu/nav").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.GET, "/dashboard").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/dashboard").permitAll();
        security.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/trip/user/list").permitAll();
        */
        security.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll();
        super.configure(security);
    }
}
