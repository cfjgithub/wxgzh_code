package org.cfj.myspring.config;

import org.cfj.myspring.integral.GoldenIntegralProcessorImpl;
import org.cfj.myspring.integral.IntegralProcessor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("org.cfj.myspring")
public class MyAppConfig {

//    @Bean("golden")
//    public IntegralProcessor integralProcessor()
//    {
//         return new GoldenIntegralProcessorImpl();
//    }

}
