/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
class TextVerifier extends InputVerifier {

    private Pattern patternString;
//    private Pattern patternInteger;

    public TextVerifier() {
    }

    @Override
    public boolean verify(JComponent input) {

        String name = input.getName();
        patternString = Pattern.compile("^[A-Za-z, ]++$");  //to validate just strings
   

        if (name.equals("txtName") || name.equals("txtSurname")) {
            String text = ((JTextField) input).getText().trim();
            if (!patternString.matcher(text).matches() || text.isEmpty()) {
                return false;
            }

        }
        return true;
    }

}

public class CalculatorController {
   

    private TextVerifier verifier = new TextVerifier();
    DefaultTableModel tableModel;

    private StudentModel model;
    private GuiView view;

    public CalculatorController(StudentModel model, GuiView view) {
        this.model = model;
        this.view = view;
    }

    public void validator() {
        String txtNameTable;
        String txtSurnameTable;

        int txtFirstScoreTable;
        int txtSecondScoreTable;
        int txtThirthScoreTable;
        int txtSkillTable;
        int txtHomeworkTable;
        int txtAbsenceTable;

        if (verifier.verify(view.getTxtNameComponent())) {
            txtNameTable = view.getTxtNameComponent().getText();
        } else {
            JOptionPane.showMessageDialog(null, "Name is empty or values are not characters");
            view.getTxtNameComponent().setText("");

            return;
        }
        if (verifier.verify(view.getTxtSurnameComponent())) {
            txtSurnameTable = view.getTxtSurnameComponent().getText();
        } else {
            JOptionPane.showMessageDialog(null, "Surname is empty or values are not characters");
            view.getTxtSurnameComponent().setText("");
            return;
        }

        try {
            txtFirstScoreTable = Integer.parseInt(view.getTxtFirstScoreComponent().getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "1.Exam field is empty or values are not numberic");
            view.getTxtFirstScoreComponent().setText("");
            return;
        }
        if (txtFirstScoreTable < 0 || txtFirstScoreTable > 100) {
            JOptionPane.showMessageDialog(null, "Exam scores must be between 0-100");
            view.getTxtFirstScoreComponent().setText("");
            return;
        }

        try {
            txtSecondScoreTable = Integer.parseInt(view.getTxtSecondScoreComponent().getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "2.Exam field is empty or values are not numberic");
            view.getTxtSecondScoreComponent().setText("");
            return;
        }

        if (txtSecondScoreTable < 0 || txtSecondScoreTable > 100) {
            JOptionPane.showMessageDialog(null, "Exam scores must be between 0-100");
            view.getTxtSecondScoreComponent().setText("");

            return;
        }

        try {
            txtThirthScoreTable = Integer.parseInt(view.getTxtThirthScoreComponent().getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "3.Exam field is empty or values are not numberic");
            view.getTxtThirthScoreComponent().setText("");
            return;
        }
        if (txtThirthScoreTable < 0 || txtThirthScoreTable > 100) {
            JOptionPane.showMessageDialog(null, "Exam scores must be between 0-100");
            view.getTxtThirthScoreComponent().setText("");

            return;
        }

        try {
            txtSkillTable = Integer.parseInt(view.getTxtSkillComponent().getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Skill field is empty or values are not numberic");
            view.getTxtSkillComponent().setText("");
            return;

        }
        if (txtSkillTable > 5 || txtSkillTable < 0) {
            JOptionPane.showMessageDialog(null, "Skill scores must be between 0-5");
            view.getTxtSkillComponent().setText("");
            return;

        }

        try {
            txtAbsenceTable = Integer.parseInt(view.getTxtAbsenceComponent().getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Absence field is empty or values are not numberic");
            view.getTxtAbsenceComponent().setText("");
            return;

        }
        if (txtAbsenceTable > 5 || txtAbsenceTable < 0) {
            JOptionPane.showMessageDialog(null, "Absence score must be between 0-5");
            view.getTxtAbsenceComponent().setText("");
            return;

        }

        try {
            txtHomeworkTable = Integer.parseInt(view.getTxtHomeworkComponent().getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Homework field is empty or values are not numberic");
            view.getTxtHomeworkComponent().setText("");
            return;

        }
        if (txtAbsenceTable <= 5 || txtAbsenceTable >= 0) {

            //Calculation If student failed or not. Under score 70 a student fails.
            int result = ((view.getTxtFirstScore() + view.getTxtSecondScore() + view.getTxtThirthScore()) / 3) + ((view.getTxtSkill() + view.getTxtAbsence() + view.getTxtHomework()) / 3);

            //Entering validated inputs to table. Entries has to be in the same order with Jtable title design.
            Object[] row = {txtNameTable, txtSurnameTable, txtFirstScoreTable, txtSecondScoreTable, txtThirthScoreTable,
                txtSkillTable, txtAbsenceTable, txtHomeworkTable, result};

            tableModel = (DefaultTableModel) view.getJTable1Component().getModel();

            tableModel.addRow(row);

            //After everything is done this method cleans all the fields.
            txtFieldCleaner();

        } else {
            JOptionPane.showMessageDialog(null, "Homework score must be between 0-5");
            view.getTxtHomeworkComponent().setText("");
            return;

        }

    }

    void txtFieldCleaner() {
        view.getTxtNameComponent().setText("");
        view.getTxtAbsenceComponent().setText("");
        view.getTxtFirstScoreComponent().setText("");
        view.getTxtSurnameComponent().setText("");
        view.getTxtHomeworkComponent().setText("");
        view.getTxtSecondScoreComponent().setText("");
        view.getTxtSkillComponent().setText("");
        view.getTxtThirthScoreComponent().setText("");
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
