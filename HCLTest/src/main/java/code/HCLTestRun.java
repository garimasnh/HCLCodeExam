package code;

/*
@Author Garima
Date 16/10/2020
This class is used to call CalculateAreaofTriangle() and PrintNumbers();
 */


public class HCLTestRun {


	public static void main(String[] args) {
		CalculateAreaofTriangle calculatearea = new CalculateAreaofTriangle();
		PrintNumbers printnumber = new PrintNumbers();

		//below call method will display the Calculate Area of Triangle
		calculatearea.calculateArea();

		//below call method will display the printnumber of 1 to 10
		printnumber.printnumbers();

	}

}

