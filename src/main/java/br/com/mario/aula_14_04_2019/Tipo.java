package br.com.mario.aula_14_04_2019;

public enum Tipo {
    INCLANDESCENTE(0), FLUORESCENTE(1);

    private Integer codigo;

    public Integer getCodigo() {
        return codigo;
    }

    Tipo(Integer codigo) {
        this.codigo = codigo;
    }
}
