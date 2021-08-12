package Loops;

public class Switch 
{

	public static void main(String[] args) 
	{
	   //  TODO Auto-generated method stub
        int week =10;
        String day;
        
        switch (week)
        {
        case 1:
        	day = "Sunday";
        	break;
        case 2:
        	day = "Monday";
        	break;
        case 3:
        	day = "Tuesday";
            break;
        case 4:
        	day = "Wednesday";
        	break;
        case 5:
        	day = "Thursday";
        	break;
        case 6:
        	day = "Friday";
        	break;
         default:
        	 day = "Gaand mara";
        	break;	
        }
        System.out.println(day);

	
//	int signal = 3;
//	String color;
//	
//	switch(signal){
//		
//	case 1:
//		color = "Red";
//		System.out.println("Stop");
//		break;
//		default:
//			System.out.println("Walk");
//	break;
//	}
//	
	
	
	
	
	
	}
}
