package com.patterns;

import java.util.Scanner;

public class Greekpattern_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		System.out.println("1.Square hallow pattern");
		System.out.println();
		
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=n;j++) 
			    {
				    if(i==1 || i==n || j==1 || j==n ) 
				    {
				        System.out.print("*" + " ");
			        }
				    else
				    {
				    	System.out.print("  ");
				    }
			    }
			System.out.println();
		}
	
		
		
		System.out.println();
		System.out.println("2.Number Triangualr");
		
		for(int i=1; i<=n;i++)
		{
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			    {
				        System.out.print(i + " ");
			    }
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("3.Number Increasing Pyramid");
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=i;j++) 
			    {
				        System.out.print(j + " ");
			    }
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("4.Number Increasing Reverse Pyramid");
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=(n-i)+1;j++) 
			    {
				        System.out.print(j + " ");
			    }
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("5.Number changing Pyramid");
		
		int count = 1;
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=i;j++) 
			    {
				if(count<10) {
					System.out.print("0");
				}
				        System.out.print(count + " ");
				        count++;
			    }
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("6.Zero - one Triangle");
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=i;j++) 
			{
				if((i+j)%2 == 0) 
				{
				        System.out.print("1" + " ");
			    }
				else
				{
					System.out.print("0" + " ");
				}
			}	
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("7.Palindrome Triangle Pattern");
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{				
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("8.Rhombus Pattern");
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}	
			for(int k =1; k<=n;k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
		scan.close();
		

	}

}
