
public class VetorDinamico {

    private int[] elementos;
    private int quantidade;
    private int capacidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.elementos = new int[this.capacidade];
    }

    public boolean estaCheio() {
        if (this.quantidade == this.capacidade) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(int elemento) {
        if (estaCheio()) {
            this.aumentarCapacidade();
        }else{    
            this.elementos[this.quantidade] = elemento;
            this.quantidade++;
        }
    }

    public void aumentarCapacidade() {

        int[] aux = new int[this.capacidade * 2];// novo vetor com o dobro da capacidade do atual

        //copiar todos os elementos para o novo vetor
        for (int i = 0; i < this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;
        this.capacidade *= 2;
    }
    
    public void exibir(){
        System.out.printf("A quantidade do vetor : %d, e a capacidade: %d\n", this.quantidade, this.capacidade);
        for (int i=0; i < this.quantidade; i++){
            System.out.println(this.elementos[i]);
        }
    }

    public void remover() {
        if (!estaVazio()){
            this.quantidade--;
            if(this.capacidade > 4 && this.quantidade <= this.capacidade /4){
                this.reduzirCapacidade();
            }
        }
        
    }
        
    public boolean estaVazio(){
        return this.quantidade == 0;
    }
    
    public void reduzirCapacidade(){
        int[] aux = new int[this.capacidade / 2];
         
        for (int i = 0; i < this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;
        this.capacidade /= 2;
    }

}
