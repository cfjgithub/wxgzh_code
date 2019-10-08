package org.cfj.myspring;

import org.cfj.myspring.config.MyAppConfig;
import org.cfj.myspring.integral.GoldenIntegralProcessorImpl;
import org.cfj.myspring.integral.IntegralProcessor;
import org.cfj.myspring.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppAnnotations {


    public static void main(String[] args) {
        System.out.println("\n*******使用注解的方式************************");
        System.out.println("\n*********** 用ApplicationContext*********");
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(MyAppConfig.class);
        System.out.println("-------------------------------------------------");
       IntegralProcessor integralProcessor=(GoldenIntegralProcessorImpl)
               applicationContext.getBean("golden");
        System.out.println("" +
                "从ApplicationContext(Spring Container)获取IntegralProcessor对象" +
                "");
        System.out.println(integralProcessor.getIntegral());

    }



}
