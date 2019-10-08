package org.cfj.myspring.service;

public interface IntegralService {
       default  double getIntegral() {
        return 0.0;
    }
}
