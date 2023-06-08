package StudentDup;

public class Student {
    private int studentID;
    private String Sfname;
    private String Slname;
    private String address;
    private String email;
    private String course;

    public Student(int studentID, String Sfname, String Slname, String address, String email, String course) {
        this.studentID = studentID;
        this.Sfname = Sfname;
        this.Slname = Slname;
        this.address = address;
        this.email = email;
        this.course = course;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getSfname() {
        return this.Sfname;
    }

    public void setSfname(String Sfname) {
        this.Sfname = Sfname;
    }

    public String getSlname() {
        return this.Slname;
    }

    public void setSlname(String Slname) {
        this.Slname = Slname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentID:" + this.studentID + "Student First Name:" + this.Sfname +
                "Student LAst Name:" + this.Slname + "Address:" + this.address + "Email:" + email + "Course:"
                + this.course;
    }

}