package com.example.abstractf;

public class EquipamentosFutebolFactory  implements Factory{
    @Override
    public Bola criarBola() {
        return new BolaFutebol();
    }

    @Override
    public Calcado criarCalcado() {
        return new CalcadoFutebol();
    }
}
