package com.company;

public class Main {

    public static void main(String[] args) {

        int num = (int) 2; //Teste, Força uma variável a aceitar outro tipo.
        System.out.println("Hello World");
        System.out.println(num);

        DiasDaSemana aula = DiasDaSemana.Segunda; //Variável do tipo Object.
        System.out.println(aula);

        System.out.println(MesesDoAno.JANEIRO);

        boolean verificacao = 10 == 10 & 10 == 20; //Existe uma diferença entre && e apenas um &. Com dois && verifica a primeira sentença, caso seja falsa, ela não irá verificar a segunda, retornando falso.
        System.out.println(verificacao);

    }
}

enum DiasDaSemana {
    Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo;
}

/*
enum MesesDoAno {
    Janeiro (1), Fevereiro (2), Março (3);

    public int mes;
    MesesDoAno (int valor) {
        mes = valor;
    }
}
*/