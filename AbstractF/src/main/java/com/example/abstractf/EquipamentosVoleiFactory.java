package com.example.abstractf;

public class EquipamentosVoleiFactory implements Factory{


    @Override
    public Bola criarBola() {
        return new BolaVolei();
    }

    @Override
    public Calcado criarCalcado() {
        return new CalcadoVolei();
    }
}
