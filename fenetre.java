import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class fenetre extends JFrame{
    // créer la fenêtre
    public fenetre(){
        this.setSize(800, 600); // Définir la taille de la fenêtre
        this.setLocationRelativeTo(null); // Centrer la fenêtre sur l'écran
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminer le programme lorsque la fenêtre est fermée
        this.setTitle("Demineure"); // Définir le titre de la fenêtre

        
         // Créer un panel pour contenir les boutons
         JPanel panel = new JPanel(new BorderLayout());

         // Créer un titre
         JLabel titre = new JLabel("Bienvenue !",JLabel.CENTER);

         JPanel panelBouton = new JPanel();

         // Créer les boutons
         JButton boutonFacile = new JButton("Facile");
         JButton boutonNormal = new JButton("Normal");
         JButton boutonDifficile = new JButton("Difficile");
         JButton boutonExpert = new JButton("Expert");
 
         // Ajouter les boutons au panel
         panelBouton.add(boutonFacile);
         panelBouton.add(boutonNormal);
         panelBouton.add(boutonDifficile);
         panelBouton.add(boutonExpert);

         panel.add(titre, BorderLayout.NORTH);
         panel.add(panelBouton, BorderLayout.CENTER);
 
         // Ajouter le panel à la fenêtre
         this.getContentPane().add(panel);
    }
}

