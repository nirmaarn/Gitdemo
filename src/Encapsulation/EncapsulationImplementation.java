package Encapsulation;

public class EncapsulationImplementation {

	public static void main(String[] args) 
	{
      EncapsulationExample obj = new EncapsulationExample();
      obj.setempage(25);
      obj.setempName("Arnold");
      obj.setssn(703079);
      System.out.println("Emp Age is "+ obj.getempage());
      System.out.println("Emp Name is "+ obj.getempName());
      System.out.println("Emp SSN is "+ obj.getEmpSSN());
    }

}
