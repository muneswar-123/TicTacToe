package com.patterns;

import java.util.Scanner;

public class Greeekspatterns_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		System.out.println();
		System.out.println("9.Diamond star pattern");
		
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*" );
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1;i--)
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("10.Butterfly star pattern");
		
		// Right side stars
		for(int i=1;i<=n;i++) {
			
			//Right upside stars 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//upside space
		    for(int j=1;j<=2*(n-i);j++) 
		    {
			     System.out.print(" ");
		    }
		    
		    //right upside stars
		    for(int j=1; j<=i;j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		//Down side stars 
		
		for(int i=n-1;i>=1;i--) 
		{
			//right down stars
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			
			//downside space
			for(int j=1; j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			
			//left downside stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println(" 11.Square fill pattern");
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("12.Right half pyramid pattern");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("13. Reverse Right half pyramid pattern");
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("14.Left half pyramid pattern");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		System.out.println();
		System.out.println("15.Triangle star pattern");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		
		
		System.out.println();
		System.out.println("16.Reverse Number Triangle pattern");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)+1;j++)
			{
				System.out.print((i+j)-1 +" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("17.Mirror image Triangle pattern");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)+1;j++)
			{
				System.out.print((i+j)-1 +" ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)+1;j++)
			{
				System.out.print((i+j)-1 +" ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		System.out.println("18.Hallow Triangle pattern");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if( i==n || j==1 || j==i) 
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
		System.out.println("20.Hallow Reverse Triangle pattern");
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if( i==n || j==1 || j==(2*i-1)) 
				{
				System.out.print("*" );
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
