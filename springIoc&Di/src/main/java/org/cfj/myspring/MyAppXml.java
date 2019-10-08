package org.cfj.myspring;

import org.cfj.myspring.integral.GoldenIntegralProcessorImpl;
import org.cfj.myspring.integral.IntegralProcessor;
import org.cfj.myspring.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyAppXml {
    private IntegralService integralService;
    public static void main(String[] args) {

        MyClassPathXmlApplicationContext();
        System.out.println("\n****************华丽的分割线*********************");
        MyXmlBeanFactory();
    }
    private static void MyClassPathXmlApplicationContext() {
        System.out.println("\n*******使用xml配置文件的方式************************");
        System.out.println("\n*********** 用ApplicationContext*********");
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("-------------------------------------------------");
        IntegralProcessor integralProcessor=(GoldenIntegralProcessorImpl)
                applicationContext.getBean("golden");
        System.out.println("" +
                "从ApplicationContext(Spring Container)获取IntegralProcessor对象" +
                "");
        System.out.println(integralProcessor.getIntegral());
    }
    private static void MyXmlBeanFactory() {
        System.out.println("\n*******使用xml配置文件的方式************************");
        System.out.println("\n*********** 用XmlBeanFactory*********");
        XmlBeanFactory applicationContext=
                new XmlBeanFactory( new ClassPathResource("ApplicationContext.xml"));
        System.out.println("-------------------------------------------------");
        IntegralProcessor integralProcessor=(GoldenIntegralProcessorImpl)
                applicationContext.getBean("golden");
        System.out.println("" +
                "从ApplicationContext(Spring Container)获取IntegralProcessor对象" +
                "");
        System.out.println(integralProcessor.getIntegral());
    }

    public double getIntegral() {
        return integralService.getIntegral();
    }

}
