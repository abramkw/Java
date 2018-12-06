package com.java.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		 有一个数列：8，4，2，1，23，344，12
		1）循环输出数列的值
		2）求数列中所有数值的和
		3）从键盘中任意输入一个数据，判断数列中是否包含此数 
		4）求数列中的最大值
		 */
		int[] numbers = {8,4,2,1,23,344,12};
		
		//习题1
		for(int i = 0; i <numbers.length;i++) {
			System.out.print(numbers[i]+"  ");
		}
		
		//习题2
		int sum = 0;
		for(int i = 0; i <numbers.length;i++) {
			sum+=numbers[i];
		}
		System.out.println("\n数组的和："+sum);
		
		//习题3
		System.out.println("请输入一个数字");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean isExist = false;//标识输入数字存不存在
		for(int i = 0; i < numbers.length;i++) {
			if(numbers[i] == number) {
				isExist = true;
				break;
			}
		}
		if(isExist) {
			System.out.println("数组包含输入的数字");
		}
		else {
			System.out.println("数组不包含输入的数字");
		}
		
		//习题4
		int max = numbers[0];
		for (int i = 1 ; i < numbers.length;i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("数组最大值："+max);
		
		//将数组排序
		Arrays.sort(numbers);//排序方法
		for(int i = 0; i < numbers.length;i++) {
			System.out.print(numbers[i]+"\t");
		}
		
	}

}
