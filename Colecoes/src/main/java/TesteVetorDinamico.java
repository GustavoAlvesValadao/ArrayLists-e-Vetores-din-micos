import java.util.Random;

public class TesteVetorDinamico {
    public static void main (String[] args) throws InterruptedException{
        //VetorDinamico v1 = new VetorDinamico();
        //VetorDinamico <Double> v2 = newVetorDinamico<>();
                
        VetorDinamico v1 = new VetorDinamico();
        Random r1 = new Random();
        while(true){
            int op = r1.nextInt(2);
                    switch(op){
                        case 0:
                        int elemento = 1 + r1.nextInt(6);
                        v1.adicionar(elemento);
                        break;
                        case 1:
                            v1.remover();
                            break;
                    }
                    
                    v1.exibir();
                    Thread.sleep(5000);
                    System.out.println("========================================");
        }
    
}
}
