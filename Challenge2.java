/**
 * Challenge2:
Write a method named area with one double parameter named radius. 
The method needs to return a double value that represents the area of a circle.If the parameter radius is negative then return -1.0 to represent an invalid value.Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 */

package com.challenge2;

public class Challenge2 {
	
	final float PI = 3.14f;
	
	public double areaOfCircle(double radius) {
		//logic to calculate area of circle
		return (radius > 0)? PI*(radius*radius): -1.0;
	}
	
	public double areaOfRectanagle(double length, double width) {
		//logic to calculate area of rectangle
		return (length> 0 && width > 0)? length * width: -1.0;
	}

	public static void main(String[] args) {
		Challenge2 c2 = new Challenge2();
		System.out.println(c2.areaOfCircle(4));
		System.out.println(c2.areaOfRectanagle(4, 10));
	}

}
