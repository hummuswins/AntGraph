import java.util.ArrayList;

public class Course {
    private boolean taken;
    private int numUntakenPreqs;
    private ArrayList<Integer> preqs;
    private ArrayList<Integer> reqs;
    private String courseName;
    private String courseTitle;

    Course(String courseName, String courseTitle) {
        taken = false;
        numUntakenPreqs = 0;
        preqs = new ArrayList<>();
        reqs = new ArrayList<>();
        this.courseName = courseName;
        this.courseTitle = courseTitle;
    }

    void addPreq(int courseID) {
        numUntakenPreqs++;
        preqs.add(courseID);
    }

    void addReq(int courseID) {
        reqs.add(courseID);
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    //Update when using bool expression tree preq evaluation
    public boolean canTake() {
        return numUntakenPreqs == 0;
    }

    public int getNumUntakenPreqs() {
        return numUntakenPreqs;
    }

    public void decrementPreqs() {
        this.numUntakenPreqs--;
    }

    public void incremementReqs() {
        this.numUntakenPreqs++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public ArrayList<Integer> getPreqs() {
        return preqs;
    }

    public void setPreqs(ArrayList<Integer> preqs) {
        this.preqs = preqs;
    }

    public ArrayList<Integer> getReqs() {
        return reqs;
    }

    public void setReqs(ArrayList<Integer> reqs) {
        this.reqs = reqs;
    }
}
