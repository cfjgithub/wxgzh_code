package org.cfj.myspring.integral;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service("golden")
public class GoldenIntegralProcessorImpl implements IntegralProcessor {

    @Override
    public double getIntegral() {
        return 100;
    }
}
