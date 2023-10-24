import java.util.Random;
public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        var v = new VetorDinamico();
        var gerador = new Random();
        while (true){
            //lançar um dado
            int dado = gerador.nextInt(6) + 1;
            //guardar o resultado
            v.add(dado);
            //exibir estado
            v.exibir();
            System.out.println("\n --------------------------------");
            //wait 5s
            Thread.sleep(5000);
        }
    }
}
