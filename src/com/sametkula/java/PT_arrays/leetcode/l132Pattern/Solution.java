package com.sametkula.java.PT_arrays.leetcode.l132Pattern;

import org.junit.Test;

import java.util.Scanner;

public class Solution {
    public boolean find132pattern(int[] nums) {
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            min[i] = Math.min(min[i-1], nums[i]);
        }

        for(int k = nums.length - 1; k > -1; k--){
            int j = k -1;
            while (j > 0 && nums[j] <= nums[k]){
                j--;
            }
            if (j == -1){
                return false;
            }
            if(nums[k] < nums[j] && nums[k] > min[j-1]){
                return true;
            }
        }
        return false;
    }
    @Test
    public void test(){
        System.out.println(find132pattern(new int[] {1,2,5,4}));
    }

    double calculateEuler(int n) {
        double euler = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= n; ++i) {
            factorial *= i;
            euler += 1.0 / factorial;
        }

        return euler;
    }
    @Test
    public void isArmstrong() {
        int num = 153;
        double originalNum = num;
        double sum = 0;
        int numDigits = (int) (Math.log10(num) + 1);
        System.out.println(numDigits);

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        System.out.printf("sum = %f oruginal num = %f   isArmstrong = %b %n",sum,originalNum,sum == originalNum);
    }




    public static void main(String[] args)
    {
        int max , min , num , count = 0;

        java.util.Scanner samet = new java.util.Scanner(System.in);

        System.out.print("ilk sayinizi giriniz : ");
        max = samet.nextInt();
        min = max;

        while (count < 9) {

            System.out.print(count + 2 + " sayinizi giriniz : ");
            num = samet.nextInt();

            if (num > max){
                max = num;
            }

            if (num < min) {
                min = num;
            }

            count = count + 1;
        }

        System.out.println(" max : " + max + "min : " + min);



    }
















}
