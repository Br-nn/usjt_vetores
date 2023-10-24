public class VetorDinamico {
    private int qtd;
    private int cap;
    private int [] elementos;

    public VetorDinamico(){
        qtd = 0;
        //preferencialmente utilizar potencias de 2 para capacidade (facilita a dividir e dobrar)
        cap = 16;
        elementos = new int [cap];
    }
    public void add (int e){
        elementos [qtd] = e;
        qtd++;
    }
    public void exibir(){
        System.out.printf("Qtde: %d\nCap: %d\n", qtd, cap);
        for(int i : elementos){
            System.out.printf("%d ", i);
        }
    }
}

