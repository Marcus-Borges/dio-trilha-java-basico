public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumetarCanal(){
        canal ++;
        System.out.println("Aumentando o volume para: " + canal);
    }

    public void dimunuirCanal(){
        canal --;
        System.out.println("Aumentando o volume para: " + canal);
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
