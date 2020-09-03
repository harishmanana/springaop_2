/**
 * 
 */
package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.spring.aspect", "com.spring.service"})
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class AppConfig {
}
