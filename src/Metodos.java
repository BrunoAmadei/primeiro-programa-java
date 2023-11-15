public class Metodos {
    public static void main(String[] args) {
        //ativarSoneca();
        String msgAlarme = agendarAlarme(12, 30);
        System.out.println(msgAlarme);
    }

    /*
     * <tipo retorno do metodo> identificador(<tipo> parametros){
     * <bloco de comandos>
     * }
     */
    static void ativarSoneca() {
        System.out.println("Soneca ativada");
    }

    static String agendarAlarme(int hora, int min) {
        return ("Seu alarme foi agendado às " + hora +":"+ min);
    }
}
