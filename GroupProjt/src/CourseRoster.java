
public class CourseRoster {
   private String sCRN;
   private String sStudentId;
   private String sGrade;
   
   
   //default construstor
    public CourseRoster() {
    }

    public CourseRoster(String sCRN, String sStudentId, String sGrade) {
        this.sCRN = sCRN;
        this.sStudentId = sStudentId;
        this.sGrade = sGrade;
    }

    public String getsGrade() {
        return sGrade;
    }

    public void setsGrade(String sGrade) {
        this.sGrade = sGrade;
    }

    public String getsCRN() {
        return sCRN;
    }

    public void setsCRN(String sCRN) {
        this.sCRN = sCRN;
    }

    public String getsStudentId() {
        return sStudentId;
    }

    public void setsStudentId(String sStudentId) {
        this.sStudentId = sStudentId;
    }
     public void printCourseRoster(){
        String sCourseRosterFormatted = String.format("%-24s%-24s%-24s", sCRN, sStudentId, sGrade);
        System.out.println(sCourseRosterFormatted);
        
    } 
    
}
