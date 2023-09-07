package com.bootcoding.project.utils;

import java.util.Random;

public class OTPGenerator {

    public int getOTP(){
        Random random = new Random();
        int minValue = 111111;
        int maxValue = 999999;

        return minValue + random.nextInt(maxValue - minValue);
    }
    public int getOTP4(){
        Random random = new Random();
        int minValue = 1111;
        int maxValue = 9999;

        return minValue + random.nextInt(maxValue - minValue);
    }


    public static void main(String[] args) {
        OTPGenerator otpGenerator = new OTPGenerator();
        for(int i = 0; i< 100; i++){
            int otp = otpGenerator.getOTP4();
            System.out.println("OTP = " + otp);
        }







    }
}
