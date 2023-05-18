import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bombilla extends JFrame implements ActionListener {
    private JButton btnEncenderApagar;
    private JPanel panelBombilla;
    private boolean encendida;

    public Bombilla() {
        super("Bombilla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnEncenderApagar = new JButton("Encender");
        btnEncenderApagar.addActionListener(this);

        panelBombilla = new JPanel();
        panelBombilla.setPreferredSize(new Dimension(100, 100));

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(btnEncenderApagar);
        getContentPane().add(panelBombilla);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        encendida = !encendida;
        if (encendida) {
            panelBombilla.setBackground(Color.YELLOW);
            btnEncenderApagar.setText("Apagar");
        } else {
            panelBombilla.setBackground(Color.GRAY);
            btnEncenderApagar.setText("Encender");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Bombilla());
    }
}
