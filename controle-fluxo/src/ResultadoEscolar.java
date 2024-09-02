public class ResultadoEscolar {
    public static void main(String[] args) {
        //Cenário 1
        /* 
        int nota = 7;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota > 3 && nota  < 7)
            System.out.println("Prova de Recuperação");
        
        else
            System.out.println("Reprovado");
        */
        
        
        //Cenário 2
        int nota = 3;

        String resultado = nota >= 7 ? "Aprovado" : nota > 3 && nota  < 7 ? "Recupeação" : "Reprovado";

        System.out.println(resultado);
    }
}
