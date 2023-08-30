package LamdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingBasedOnAttribute {
	
	
	

	public static void main(String args[]) {
		
		
		class Student {
			  private String name, SClass;
			  private int age;
			  public Student(String name, int age, String SClass) {
			    this.name = name;
			    this.age = age;
			    this.SClass = SClass;
			  }
			  public String getName() {
			    return name;
			  }
			  public int getAge() {
			    return age;
			  }
			  public String getSClass() {
			    return SClass;
			  }
			}
		List<Student> student_list = new ArrayList<>();
		student_list.add(new Student("yogesh", 18, "12"));
		student_list.add(new Student("cogeshy", 17, "11"));
		student_list.add(new Student("Yogeshyy", 16, "10"));
		student_list.add(new Student("Byogesh0", 27, "12"));
		student_list.add(new Student("Cyogesh0", 27, "12"));
		
		
		 System.out.println("Student details:");
		    for (Student Student: student_list) {
		      System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
		    }
	  
//		    
//		    student_list.sort(Comparator.comparing(Student::getName));
		    student_list.sort((s1,s2)-> s1.getName().compareToIgnoreCase(s2.getName()));
		    
			 System.out.println("Student details after sorting:");
			    for (Student Student: student_list) {
			      System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
			    }
		  
		    
		    
		    
		    
		    
		
		
	}
	



}
