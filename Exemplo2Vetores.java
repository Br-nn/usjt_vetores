public class Exemplo2Vetores {
    public static void main(String[] args) {
        //nomes de alunos
        int []notas = new int[]{4, 10, 6, 7};

        //exibir as notas
        // for(int i = 0; i < notas.length; i++){
        //     System.out.println(notas[i]);
        // }
        
        //enhanced for
        for(int nota : notas){
            System.out.println(nota);
        }
        
        //acumulador
        int soma = 0;
        for(int nota : notas){
           soma = soma + nota; 
        }
            System.out.println(soma);

    }
}
