package br.com.fantomb.relogio;
public class Despertador {
    int horas;
    int min;
    int soneca;

    void ativarSoneca() {
        System.out.println("Soneca de " + soneca + " ativada");
    }

    String agendarAlarme() {
        return ("Seu alarme foi agendado às " + horas + ":" + min);
    }
}
