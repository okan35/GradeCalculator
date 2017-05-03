/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

/**
 *
 * @author pc
 */
public class StudentModel {

    private String studentName;
    private String studentSurname;
    private int firstScore;
    private int secondScore;
    private int thirthScore;
    private int skillScore;
    private int absenceScore;
    private int homeworkScore;
    private static final int LIMIT = 70;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public int getThirthScore() {
        return thirthScore;
    }

    public void setThirthScore(int thirthScore) {
        this.thirthScore = thirthScore;
    }

    public int getSkillScore() {
        return skillScore;
    }

    public void setSkillScore(int skillScore) {
        this.skillScore = skillScore;
    }

    public int getAbsenceScore() {
        return absenceScore;
    }

    public void setAbsenceScore(int absenceScore) {
        this.absenceScore = absenceScore;
    }

    public int getHomeworkScore() {
        return homeworkScore;
    }

    public void setHomeworkScore(int homeworkScore) {
        this.homeworkScore = homeworkScore;
    }
    
     public boolean calculator() {
        int examAverage = (firstScore + secondScore + thirthScore) / 3;
        int skillAverage = (skillScore + absenceScore + homeworkScore) / 3;

        return examAverage + skillAverage >= LIMIT;
    }

}
