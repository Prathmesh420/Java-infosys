public class StudentTester {
    private int studentId,yearOfEngg;
    private String name;
    private float qualifyingExamMarks;
    private char residentailStatus;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public char getResidentialStatus() {
        return residentailStatus;
    }

    public void setResidentialStatus(char residentailStatus) {
        this.residentailStatus = residentailStatus;
    }

    public int getYearOfEngg() {
        return yearOfEngg;
    }

    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    public static void main(String[] args) {
        StudentTester stud1 = new StudentTester();
        stud1.setStudentId(1001);
        stud1.setName("Jacob");
        stud1.setQualifyingExamMarks(80);
        stud1.setResidentialStatus('H');
        stud1.setYearOfEngg(3);
        System.out.println(
                "Student Name: " + stud1.getName());
        System.out.println(
                "Student Id: " + stud1.getStudentId());
        System.out.println(
                "Qualifying marks: " + stud1.getQualifyingExamMarks());
        System.out.println(
                "Year Of Engineering: " + stud1.getYearOfEngg());
        System.out.println(
                "Residentail status: " + stud1.getResidentialStatus() == "H" ? "Hostellers" : "Day Scholars");

    }

}
