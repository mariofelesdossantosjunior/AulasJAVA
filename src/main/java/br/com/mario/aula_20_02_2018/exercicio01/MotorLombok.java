package br.com.mario.aula_20_02_2018.exercicio01;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MotorLombok {
    public String marca;
    public double kmAtual;
    public double combustivel;
    public int potencia;
}
