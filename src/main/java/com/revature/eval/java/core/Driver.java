package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

public class Driver {
	public int getSumOfMultiples(int i, int [] set)
	{
		int sum = 0;
		for(int multi_indx = 0; multi_indx < set.length; multi_indx++)
		{
			for(int indx = 1; indx <= i; indx++)
			{
				int multi_num = indx*set[multi_indx];
				if(multi_num < i)
				{
					sum += multi_num;
				}
				else
					break;
			}
		}
		System.out.println(sum);
	
