package Encapsulation;

public class EncapsulationExample 
{
    private int ssn;
    private String empName;
    private int empage;
    
    public int getEmpSSN() 
    {
    	return ssn;
    }
    public String getempName()
    {
    	return empName;
    }
    public int getempage()
    {
    	return empage;
    }
	public void setempage(int newValue)
	{
		if(newValue< 18 || newValue>70)
		{
			throw new IllegalArgumentException();
		}
		empage = newValue;
	}
       public void setempName(String newValue)
       {
         empName = newValue;
       }
       public void setssn(int newValue)
       {
    	   ssn = newValue;
	}

}
