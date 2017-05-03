/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class CalculatorController {

    private StudentModel model;
    private GuiView view;

    public CalculatorController(StudentModel model, GuiView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName() {
        model.setStudentName(view.getTxt_name());
    }

    public String getStudentName() {
        return view.getTxt_name();
    }

    public void setStudentSurname() {
        model.setStudentSurname(view.getTxt_surname());
    }

    public String getStudentSurname() {
        return view.getTxt_surname();
    }

    public void setFirstScore() {
        model.setFirstScore(view.getTxt_first_score());
    }

    public int getFirstScore() {
        return view.getTxt_first_score();
    }

    public void setSecondScore() {
        model.setSecondScore(view.getTxt_second_score());
    }

    public int getSecondScore() {
        return view.getTxt_second_score();
    }

    public void setThirthScore() {
        model.setThirthScore(view.getTxt_thirth_score());
    }

    public int getThirthScore() {
        return view.getTxt_thirth_score();
    }

    public void setAbsence() {
        model.setAbsenceScore(view.getTxt_absence());
    }

    public int getAbsence() {
        return view.getTxt_absence();
    }

    public void setHomework() {
        model.setHomeworkScore(view.getTxt_homework());
    }

    public int getHomework() {
        return view.getTxt_homework();
    }

    public void setSkill() {
        model.setSkillScore(view.getTxt_skill());
    }

    public int getSkill() {
        return view.getTxt_skill();
    }

    /**
     * @param args the command line arguments
     */
    // static ArrayList<StudentModel> studentList = new ArrayList<>();
//    private static final int MIN_EXAM_SCORE = 0;
//    private static final int MAX_EXAM_SCORE = 100;
//    private static final int MIN_SKILL_SCORE = 0;
//    private static final int MAX_SKILL_SCORE = 5;
//    private static final int LIMIT = 70;
//    public static int examScoreController(int scoreToCheck) {
//
//        while (scoreToCheck > MAX_EXAM_SCORE || scoreToCheck < MIN_EXAM_SCORE) {
//            System.out.println("Enter a number between 0-100");
//            System.out.print("First Exam Score: ");
//            scoreToCheck = Integer.parseInt(scanner.nextLine());
//
//        }
//        return scoreToCheck;
//    }
//
//    public static int skillScoreController(int scoreToCheck) {
//        while (scoreToCheck > MAX_SKILL_SCORE || scoreToCheck < MIN_SKILL_SCORE) {
//            System.out.println("Enter a number between 0-5");
//            System.out.print("Score: ");
//            scoreToCheck = Integer.parseInt(scanner.nextLine());
//
//        }
//        return scoreToCheck;
//
//    }
//
//    public boolean calculator() {
//        int examAverage = (firstScore + secondScore + thirthScore) / 3;
//        int skillAverage = (skillScore + absenceScore + homeworkScore) / 3;
//
//        return examAverage + skillAverage >= LIMIT;
//    }
//
//    public static void validInputController(JTextField name, JTextField surname, JTextField firstScore,
//            JTextField secondScore, JTextField thirthScore, JTextField skill, JTextField absence,
//            JTextField homework) {
//
//    }
}
