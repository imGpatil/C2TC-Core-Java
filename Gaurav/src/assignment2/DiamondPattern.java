package assignment2;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for (int l=1; l<i; l++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
	}
		for (int i=1; i<=4; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			for (int l=3; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
	}
	}

}
