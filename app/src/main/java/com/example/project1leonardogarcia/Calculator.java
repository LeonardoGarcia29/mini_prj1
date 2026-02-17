package com.example.project1leonardogarcia;

public class Calculator {
    public static double calculate(double P, double rate,int year, boolean withTax){
        double J = rate / 12.0/ 100; //rate
        int N = year * 12;
        double T = withTax ? 0.1 / 100 * P : 0.0;
        if (J == 0.0){
            return P/ N + T;
        }
        else{
            return P * J / (1- Math.pow(1+J,-N)) + T;
        }
    }
}