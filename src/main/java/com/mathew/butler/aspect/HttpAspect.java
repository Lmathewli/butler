package com.mathew.butler.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {
    
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    
    @Pointcut("execution(public * com.mathew.butler.user.controller.UserController.*(..))")
    public void point() {
    }
    @Before("point()")
    public void doBefore(JoinPoint joinPoint) {
        // 获取请求
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        logger.info("url={}", request.getRequestURL());
        logger.info("method={}", request.getMethod());
        // ip
        logger.info("ip={}", request.getRemoteAddr());
        // method
        logger.info("class method = {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // 参数
        logger.info("args={}", joinPoint.getArgs());
    }
    
    @After("point()")
    public void doAfter() {
        logger.info("222");
    }
    @AfterReturning(returning = "object", pointcut = "point()")
    public void doAfterReturning(Object object) {
        logger.info("response={}", object);
    }
}
