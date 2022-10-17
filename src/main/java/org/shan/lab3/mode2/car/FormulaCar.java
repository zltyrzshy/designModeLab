package org.shan.lab3.mode2.car;

public class FormulaCar extends CarRace {
    @Override
    public void makeBody() {
        car += "FormulaBody\n";
    }

    @Override
    public void makeEngine() {
        car += "FormulaEngine\n";
    }

    @Override
    public void makeTyre() {
        car += "FormulaTyre\n";
    }
}
