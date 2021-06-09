package com.epam;

public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a;
    }

    @Override
    public int multiply(int a, int b) {
        return a;
    }

    @Override
    public int subtract(int a, int b) {
        return a;
    }

    @Override
    public int divide(int a, int b) {
        throw new RuntimeException();
    }

    public void bla() {
        int c = 1;
        while (true) {
            c++;
        }
    }
}
