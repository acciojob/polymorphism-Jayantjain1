package com.driver;

import java.util.*;
import java.lang.*;

public class Main{
     static class Product{
        public int product(int x,int y){
            int a = x*y;
            return a;
        }
        public int product(int a,int b,int c){
            int ans = a*b*c;
            return ans;
        }
        public double product(double a,double b){
            double ans = a*b;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product obj = new Product();
        obj.product(1,2);
        obj.product(2,3,4);
        obj.product(1.2,3.4);
    }
}