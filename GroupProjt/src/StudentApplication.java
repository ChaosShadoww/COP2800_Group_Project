
public class StudentApplication {

    
    public static void main(String[] args) {
       Student1 s = new Student1();
       s.setsStudentId("Z23119411");
       s.setsFirstName("Michael");
       s.setsLastName("Schreuder");
       s.setsStreet("5312 NEWHALL RD");
       s.setsCity("Boca Raton");
       s.setsState("FL");
       s.setnZipCode(33431);
       s.setsPhone("5611357894");
       s.setsEmail("mschreuder@mdc.edu");
       s.setnMajorID(115);
       s.setsExpectedGraduationDate("12/2016");
       
       s.printStudent();
      
    } //end of main 
    
}// end of StudentApplication
