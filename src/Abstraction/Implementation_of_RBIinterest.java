package Abstraction;

public class Implementation_of_RBIinterest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RBIRateofInterest km = new KOTAK_RateofInterest();
		System.out.println("Rate of Interest of Kotak is " + km.ROI());
		
		RBIRateofInterest sb = new SBI_RateofInterest();
		System.out.println(sb.ROI());
			
	}

}
