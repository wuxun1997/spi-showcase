package com.wlf.app;

import com.wlf.api.ITest;

import java.util.Iterator;
import java.util.ServiceLoader;

public class TestServiceLoader {
    public static void main(String[] args) {
        ServiceLoader<ITest> serviceLoader = ServiceLoader.load(ITest.class);
        Iterator<ITest> iTests = serviceLoader.iterator();
        while (iTests.hasNext()) {
            ITest iTest = iTests.next();
            System.out.printf("loading %s\n", iTest.getClass().getName());
            iTest.saySomething();
        }
    }
}
