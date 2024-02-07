
// list of all the java packages
// creat list of the arrayLits 
// Read the .text files downloaded
// priint of the datas


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

// end java packages

public class MainProject {

    public static void main(String[] args) throws FileNotFoundException {
       
      // variables
      int nOption = 0;
      Scanner input = new Scanner(System.in);
      DataReader reader = new DataReader();
      DataUtil util = new DataUtil();
      
      ArrayList<Student1> studList = new ArrayList<Student1>();
      ArrayList<Faculty> factList = new ArrayList <Faculty>();
      ArrayList<CourseRoster> CourseRosterList = new ArrayList <CourseRoster>();
      ArrayList<Department> DepartmentList = new ArrayList <Department>();
      ArrayList<Major> MajorList = new ArrayList <Major>();
      ArrayList<Schedule> SchedList = new ArrayList <Schedule>();
      
      // store data
      reader.storeStudent(studList, "sStudents.txt");
      reader.store(SchedList, "Schedule.txt");
      reader.storeCourseRoster(CourseRosterList, "CourseRoster");
      reader.storeDepartment(DepartmentList,"Department.txt");
      reader.storeFaculty(factList, "Faculty.txt");
      reader.storeMajor(MajorList,"Major.txt");
      
   
      System.out.println("STUDENT, FACULTY AND COURSE INFORMATION MENU");
        System.out.println("1. View student information");
        System.out.println("2. View course schedule");
        System.out.println("3. Create a new student");
        System.out.println("4. Create a new course");
        System.out.println("5. Print course list for a student");
        System.out.println("6. Add a student to a course");
        System.out.println("7. View faculty information");
        System.out.println("8. Print a list courses for a faculty member");
        System.out.println("10. Exit");
        
        
        //prompt user to make a choice
        System.out.println("Please enter the number of your choice");
        nOption = input.nextInt();
        
        while(nOption != 10){
        if(nOption == 1){
            
        }
        
        if(nOption == 2){
            
        }
        
        if(nOption == 3){
            
        }
        
        if(nOption == 4){
            
        }
        
        if(nOption == 5){
            
        }
        
        if(nOption == 6){
            
        }
        
        if(nOption == 7){
            
        }
        
        if(nOption == 8){
            
        }
            
        System.out.println("Please enter another choice");
        nOption = input.nextInt();
            
        }//end while loop
       
       // print data
      System.out.println("--------Faculty--------");
      util.printFacultyList(factList);
      System.out.println("--------Student--------");
      util.printScheduleList(SchedList);
      System.out.println("--------Department--------");
      util.printDepartmentList(DepartmentList);
      System.out.println("--------Schedule--------");
      util.printScheduleList(SchedList);
      System.out.println("--------Major--------");
      util.printMajorList(MajorList);
      System.out.println("--------CourseRoster--------");
      util.printCourseRosterList(CourseRosterList);


    }// end main method
    
}//end class MainProject
        
    
    

