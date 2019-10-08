package org.cfj.myspring.service;

import org.cfj.myspring.integral.IntegralProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class IntegralServiceImpl implements IntegralService {

    public IntegralProcessor getGolden() {
        return golden;
    }

    @Autowired
    public void setGolden(@Qualifier("golden") IntegralProcessor golden) {
        this.golden = golden;
    }
    /*
        @Autowired
        @Qualifier("golden")
        private  IntegralProcessor integralProcessor;
    */
    private  IntegralProcessor golden;

    @Override
    public double getIntegral() {
        return this. golden.getIntegral();
    }
}
