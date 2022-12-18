
import java.sql.Timestamp;

/**
 *
 * @author Zita Nwafor
 */
public class ScheduleEntry {
    private String semester;
    private String studentID;
    private String courseCode;
    private String status;
    private Timestamp timestamp;
    
    public ScheduleEntry(String semester, String studentID, String courseCode, String status, Timestamp timestamp){
        this.semester = semester;
        this.studentID = studentID;
        this.courseCode = courseCode;
        this.status = status;
        this.timestamp = timestamp;
    }
    public String getSemester(){
        return this.semester;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String getCourseCode(){
        return this.courseCode;
    }
    public String getStatus(){
        return this.status;
    }
    public Timestamp getTimestamp(){
        return this.timestamp;
    }
}
