package com.mathew.butler.base.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 安全配置类
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)// 启用方法级别的安全设值
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    public static final String REMEMBER_ME = "mathew.com";
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        // 使用BCrap安全加密
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder);
        return  provider;
    }
    /**
     * 自定义配置
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll() //都可以访问
            .antMatchers("/admins/**").hasRole("ADMIN") // 需要相应角色
            .and()
            .formLogin()// 基于Form 表单登陆验证
            .loginPage("/login") // 自定义登陆界面
            .failureUrl("/login-error")
            .and().rememberMe().key(REMEMBER_ME)
            .and().exceptionHandling().accessDeniedPage("/403"); // 处理异常，拒绝访问就重定向到403
        http.csrf();// CSRF防护
    }
    
    /**
     * 认证信息管理
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
        auth.authenticationProvider(authenticationProvider());
    }
}
