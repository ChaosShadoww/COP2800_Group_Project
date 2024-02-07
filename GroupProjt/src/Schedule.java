

public class Schedule {
    private String sRoom;
	private String sTerm;//variable to store the Term
	private int nCRN;//variable to store the CRN
    private String sCourseID;//variable to store the Course ID
    private String sTitle;//variable to store the Title
    private int nCreditHours;//variable to store the CreditHours
    private String sFacultyID;//variable to store the Faculty ID
    private int nCapacity;//variable to store the Capacity
    
    //  getters and setters 
    
    public void setnCreditHours(int nCreditHours)
    {
        this.nCreditHours = nCreditHours;
    }

    public void setsTerm(String sterm) 
    {
        this.sTerm = sterm;
    }

    public void setnCRN(int nCRN) 
    {
        this.nCRN = nCRN;
    }

    public void setnCapacity(int nCapacity) 
    {
        this.nCapacity = nCapacity;
    }
    
    public void setsCourseID(String sCourseID)
    {
        this.sCourseID = sCourseID;
    }
    
    public void setsTitle(String sTitle)
    {
        this.sTitle = sTitle;
    }

    public void setsFacultyID(String sFacultyID)
    {
        this.sFacultyID = sFacultyID;
    }

    public void setsRoom(String sRoom)
    {
        this.sRoom = sRoom;
    }

    public int getnCRN()
    {
        return nCRN;
    }
    public String getsFacultyID() 
    {
        return sFacultyID;
    }
    public String getsTitle()
    {
        return sTitle;
    }
    public int getnCapacity() 
    {
        return nCapacity;
    }
    public String getsTerm() 
    {
        return sTerm;
    }
    public String getsRoom()
    {
        return sRoom;
    }
    public int getnCreditHours()
    {
        return nCreditHours;
    }
    public String getsCourseID() 
    {
        return sCourseID;
    }
    
    
public void printSchedule(){
    String sScheduleFormatted = String.format("%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s", sCourseID, nCRN, sTitle, sTerm, sFacultyID, sRoom, nCapacity, nCreditHours);
        System.out.println(sScheduleFormatted);
}
    
}
