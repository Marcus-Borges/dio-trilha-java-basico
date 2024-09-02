 //Possibilidade de implementar switch/case - Criar sistema de plano telefônico onde:
 //O sistema terá 03 planos: BASIC, MIDIA, TURBO
//BASIC: 100 minutos de ligação
 //MIDIA: 100 minutos de ligação + Whats e Instagram grátis
 //TURBO: 100 minutos de ligação + Whats e Instagram grátis + 5Gb YouTube
public class PlanoOperadora {
    public static void main(String[] args) {
       String plano = "M"; //M / T
        /*
         * if(plano =="B"){
            System.out.println("100 minutos de ligação");
        }else if (plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }else if (plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb YouTube");
        }
         */
        
         switch (plano){
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("Wats e Instragram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
         }
    }
}
