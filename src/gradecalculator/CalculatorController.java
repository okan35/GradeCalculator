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
public class CalculatorController {

    private StudentModel model;
    private GuiView view;

    public CalculatorController(StudentModel model, GuiView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName() {
        model.setStudentName(view.getTxtName());
    }

    public String getStudentName() {
        return view.getTxtName();
    }

    public void setStudentSurname() {
        model.setStudentSurname(view.getTxtSurname());
    }

    public String getStudentSurname() {
        return view.getTxtSurname();
    }

    public void setFirstScore() {
        model.setFirstScore(view.getTxtFirstScore());
    }

    public int getFirstScore() {
        return view.getTxtFirstScore();
    }

    public void setSecondScore() {
        model.setSecondScore(view.getTxtSecondScore());
    }

    public int getSecondScore() {
        return view.getTxtSecondScore();
    }

    public void setThirthScore() {
        model.setThirthScore(view.getTxtThirthScore());
    }

    public int getThirthScore() {
        return view.getTxtThirthScore();
    }

    public void setAbsence() {
        model.setAbsenceScore(view.getTxtAbsence());
    }

    public int getAbsence() {
        return view.getTxtAbsence();
    }

    public void setHomework() {
        model.setHomeworkScore(view.getTxtHomework());
    }

    public int getHomework() {
        return view.getTxtHomework();
    }

    public void setSkill() {
        model.setSkillScore(view.getTxtSkill());
    }

    public int getSkill() {
        return view.getTxtSkill();
    }

    /**
     * @param args the command line arguments
     */
}
