import javax.swing.JOptionPane;

public class ExemploVetores{

    public static void main(String[]args) {
        int cap = 15;
        String [] nomes = new String[cap];
        for(int i = 0; i < cap; i++){
            JOptionPane.showInputDialog("Digite o" + (i + 1) + "° nome");
        }

        for(int i = 0; i < cap; ++i){
            JOptionPane.showMessageDialog(null, nomes[i], null, i);    
        }
    }
}