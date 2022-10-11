package ModelLayer;

public class modelLayer {
    private String StudentID, FirstName, LastName, Course;

    public String getID(){
        return StudentID;
    }

    public void setID( String id){
        this.StudentID=id;
    }

    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName( String name){
        this.FirstName=name;
    }

    public String getLastName(){
        return LastName;
    }

    public void setLastName( String name){
        this.LastName=name;
    }

    public String getCourse(){
        return Course;
    }

    public void setCourse(String course){
        this.Course=course;
    }
}
