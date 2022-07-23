package com.company;
public class Main {

    public static void main(String[] args) {
        SalaAula salaAula = new SalaAula();
        salaAula.qtdCadeiras = 40;
        salaAula.qtdAlunos = 40;
        salaAula.numSala = K09;
        salaAula.nomeProf = Lucas;
        salaAula.discAula = POO;

        System.out.println("Quantidade de Cadeira: "+ salaAula.qtdCadeiras);
        System.out.println("Quantidade de Alunos: "+ salaAula.qtdAlunos);
        System.out.println("Numero da Sala: "+ salaAula.numSala);
        System.out.println("Nome do Professor(a): "+ salaAula.nomeProf);
        System.out.println("Disciplina Lecionada: "+ salaAula.discAula);

    }
}
