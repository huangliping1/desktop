package com;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


/**
 * web容器中进行部署
 * 
 * @author ruoyi
 */
public class SkyEyeServletInitializer extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SkyEyeApplication.class);
    }
    
	//定义servlet，注册
    /*
	@Bean
	public ServletRegistrationBean fileUploadServlet(){
		//指定访问的url
		return new ServletRegistrationBean(new FileUploadServlet(),"/FileUploadServlet");
	}

	@Bean
	public ServletRegistrationBean uploadActionServlet(){
		return new ServletRegistrationBean(new UploadActionServlet(),"/UploadActionServlet");
	}
	*/
}
