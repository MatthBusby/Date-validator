import java.util.Scanner;
public class validdate {
   public static void main(String[] args){
       
       
      int year = 0;
      int month = 0;
      int day = 0;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Data Validation Machine");
      System.out.println("Input the month: ");
      month = sc.nextInt();
      System.out.println("Input the day: ");
      day = sc.nextInt();
      System.out.println("Input the year:");
      year = sc.nextInt();
	  System.out.println("================================");
	  //checks if the month is valid
	switch (month) {
	  
	  
	  case 1://january 
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{ 
		   System.out.println("Janurary only has 31 days not " + day);
		}
		break;
	  
	  
	  case 2://February 
	    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){//checking if it is a leap year
		  if ( 1 <= day && day  <= 29 ){//leap year day validation
		   System.out.println("This is a vaild date");
	      }else{ //non leap year vailidation
		   System.out.println("February only has 29 days, not " + day);
		  }
        }else
		  if ( 1 <= day && day <= 28 ){ //non leap year vailidation
		   System.out.println("This is a vaild date");
	      }else{ 
		   System.out.println("February only has 28 days, not " + day);
		  }
		break;
		
		
	  case 3://March 
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{
		   System.out.println("March only has 31 days not " + day);
		}
		break;
	  
	  
	  case 4://April 
		if ( 1 <= day && day <= 30 ){
		   System.out.println("This is a vaild date");
	    }else{ 
		   System.out.println("April only has 31 days not " + day);
		  }
		break;
	  
	  
	  case 5://May 
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{ 
		   System.out.println("May only has 31 days not " + day);
		}
		break;
	  
	  
	  case 6://June
		if ( 1 <= day && day <= 30 ){
		   System.out.println("This is a vaild date");
	    }else{
		   System.out.println("June only has 31 days not " + day);
		}
		break;
	  
	  
	  case 7://July 
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{ 
		   System.out.println("July only has 31 days not " + day);
		}
		break;
	  
	  
	  case 8://August 
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{
		   System.out.println("August only has 31 days not " + day);
		}
		break;
	  
	  
	  case 9://September
		if ( 1 <= day && day <= 30 ){
		   System.out.println("This is a vaild date");
	    }else{ 
		   System.out.println("September only has 31 days not " + day);
		}
		break;		
	  
	  
	  case 10://October
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{
		   System.out.println("October only has 31 days not " + day);
		}
		break;
	  
	  
	  case 11://November
		if ( 1 <= day && day <= 30 ){
		   System.out.println("This is a vaild date");
	    }else{
		   System.out.println("November only has 31 days not " + day);
		}
		break;
	  
	  
	  case 12://December 
		if ( 1 <= day && day <= 31 ){
		   System.out.println("This is a vaild date");
	    }else{ 
		   System.out.println("December only has 31 days not " + day);
		}
		break;
	  
	  
	  default: //r u dump?!?!?!?
		System.out.println("This is not a valid month");


	  
	}
   }
}