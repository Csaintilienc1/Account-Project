
//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int average;
   final int N=3;
   int tests[]=new int[N];

   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      
   }

 public Student(String first, String last, Address home,
     		         Address school, int testscore1,int testscore2,int testscore3)
  {  
   firstName = first;
   lastName = last;
   homeAddress = home;
   schoolAddress = school;
   setTestScore( 0, testscore1);
   setTestScore( 1, testscore2);
   setTestScore( 2, testscore3);
  }
  
 //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress+ "\n";
      result +="testscore1: " + tests[0] + "\n";
      result +="testScore2: " + tests[1] + "\n";
      result +="testscore3: " + tests[2] + "\n";
      result += "Average of 3 tests:" + average()+"\n";
      return result;
   }
   
    public void setTestScore(int testnumber,int testscore ){
    	tests[testnumber]=testscore;
    	
    }

    
    public int getTestscore(int testnumber){
    	return tests[testnumber];
    }
  
   


    public int average(){
	average=(tests[0]+tests[1]+tests[2]) /3;
	
	return average;
}




}