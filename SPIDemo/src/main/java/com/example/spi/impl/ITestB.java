package com.example.spi.impl;

import com.example.spi.ISpi;

public class ITestB implements ISpi {
    @Override
    public void invoke() {
        System.out.println("hello test b!");
    }
}
