package com.epam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        bla();
        return a;
    }

    public void bla() {
        List<BigInteger> bigIntegers = new LinkedList<>();

        while (true) {

            bigIntegers.add(BigInteger.TEN);
        }
    }
}
