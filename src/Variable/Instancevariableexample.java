package Variable;

public class Instancevariableexample
{
    public String name;
    private int age;
    public void setName (String setName)
    {
    	name = setName;
    }
    
    public void setAge(int RecSal)
    {
    	age = RecSal;
    }
     void printRec()
    {
    	System.out.println("name : "+ name);
    	System.out.println("age :" + age);
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
        Instancevariableexample r = new Instancevariableexample();
        r.setAge(26);
        r.setName("Arnold");
        r.printRec();
	}

}
