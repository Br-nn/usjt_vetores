public class VetorDinamico {
    private int qtd;
    private int cap;
    private int [] elementos;
    private int [] nvelementos;
    public VetorDinamico(){
        qtd = 0;
        //preferencialmente utilizar potencias de 2 para capacidade (facilita a dividir e dobrar)
        cap = 16;
        elementos = new int [cap];
    }
    public void add (int e){
        if(estaCheio())
            aumentarCapacidade();
        elementos [qtd] = e;
        qtd++;
    }
    public void exibir(){
        System.out.printf("Qtde: %d\nCap: %d\n", qtd, cap);
        // for(int i : elementos){
        //     System.out.printf("%d ", i);
        // }
            //Mesma func. porém sem mostrar os campos vazios "0"
        for(int i = 0; i < qtd; i++){
            System.out.printf("%d ", elementos[i]);
        }
    }
    private void aumentarCapacidade(){
        // 1. alocar novo vetor com dobro da cap atual
        nvelementos = new int [cap * 2];

        // 2. copiar todos elementos
        for(int i = 0; i < elementos.length; i++){
            nvelementos[i] = elementos[i];
        }
        
        //3. fazer com que elementos referencie o vetor de nvelementos
        elementos = nvelementos;

        //4. dobrar a capacidade
        cap *= 2;
    }
    private void reduzirCapacidade(){
       
    }
    private boolean estaCheio(){
        return cap == qtd;  
    }   
    public void del(int e){
       if(!estaVazio()){
        qtd --; 

       }
    }
    private boolean estaVazio(){
        return qtd == 0;
    }    

}