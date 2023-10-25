import java.util.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
public class MenuMusica {
    public static void main(String[] args) {
       List <Musica> playlist = new ArrayList<>(0);
       int op;
       String menu = "1-Adicionar\n2-Ver a playlist\n3- Remover Música\n0-Sair";
       do{
        op = parseInt(showInputDialog(menu));
        switch(op){
            case 1:{
                String titulo = showInputDialog("Adicione o título da música");
                var musica = new Musica(titulo);
                playlist.add(musica);
                break;
            }
            case 2:{
                StringBuilder sb = new StringBuilder("");
                Collections.sort(playlist);
                for(Musica musica : playlist){
                    sb.append(musica.getTitulo());
                    sb.append("\n");

              }
              showMessageDialog(null, sb);
              break;
            }
            case 3:{
                int indice = parseInt(showInputDialog(null, "Digite a posição da música a ser removida"));
                playlist.remove(indice - 1);
                showMessageDialog(null, "Música removida");
            }
        }
       }while (op != 0); 
    }
}
