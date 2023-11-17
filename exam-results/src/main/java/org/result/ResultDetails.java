package org.result;

public class ResultDetails {
    private int studentId;
    private String studentName;
    private String courseName;
    private float cgpa;
    private String grade;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ResultDetails{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", cgpa=" + cgpa +
                ", grade='" + grade + '\'' +
                '}';
    }
}
