import java.util.*;

public class Course {
	private ArrayList<Student> course;
	
	public void addStudent(Student student){
		course.add(student);

	}
	
	
	public Course(String Course){
		course= new ArrayList<>(); 

	}

	

	
	public int average(){
		int average=0;
		for(Student s:course){
			average+=s.average();
		}
		average=average/course.size();
		
		return average;

 }


        public void roll(){
        	for(Student s:course){
        		System.out.print(s);
        	}
        }
     public static void main (String args[]){
     
    	 Course Math=new Course("");
    	 Address jHome = new Address ("21 Jump Street", "Lynchburg","VA", 24551);
    	 
    	 Address school = new Address ("800 Lancaster Ave.", "Villanova",
                 "PA", 19085);
    	 Student John= new Student("John", "Smith", jHome, school, 50,37,69);
     
    	 
    	 Address mHome = new Address ("123 Main Street", "Euclid", "OH",44132);
    	
    	 Student marsha = new Student ("Marsha", "Jones", mHome, school,78,67,72);
     
    	 Math.addStudent(John);
    	 Math.addStudent(marsha);
         Math.roll();
     System.out.print("Total Average: " + Math.average() );
     
     
     }


}