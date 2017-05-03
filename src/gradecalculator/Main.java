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
public class Main {

    public static void main(String[] args) {

        GuiView theView = new GuiView();
        StudentModel theModel = new StudentModel();
        CalculatorController theController = new CalculatorController(theModel, theView);

        theView.run();

    }

}
