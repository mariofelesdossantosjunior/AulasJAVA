package br.com.mario.terceira_aula.exercicio01;

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
