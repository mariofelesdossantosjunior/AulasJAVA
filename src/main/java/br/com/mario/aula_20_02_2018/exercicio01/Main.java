package br.com.mario.aula_20_02_2018.exercicio01;

public class Main {

    public static void main(String[] args) {

        Automovel automovel = Automovel.newAutomovel()
                .marca("Fiat")
                .kmAtual(1000)
                .motor(
                        Motor.newMotor()
                                .combustivel(50)
                                .potencia(20)
                                .build()
                )
                .pneu01(Pneu.newPneu()
                        .marca("Goodier")
                        .pressaoAr(20)
                        .build())
                .pneu02(Pneu.newPneu()
                        .marca("Goodier")
                        .pressaoAr(20)
                        .build())
                .pneu03(Pneu.newPneu()
                        .marca("Goodier")
                        .pressaoAr(20)
                        .build())
                .pneu04(Pneu.newPneu()
                        .marca("Goodier")
                        .pressaoAr(20)
                        .build())
                .build();

        System.out.println(automovel);
    }
}
