package log_reg;

import javax.swing.*;
import java.awt.*;

public class MediaForm extends JDialog{
    private JPanel panel1;
    private JPanel MediaPanel;
    private JButton INSERTEDITUSERButton;
    private JButton INSERTEDITMEDIAButton;
    private JButton RENTButton;
    private JButton REPORTSButton;

    public MediaForm(JFrame parent){
        super(parent);
        setTitle("Main Media Panel");
        setContentPane(MediaPanel);
        setMinimumSize(new Dimension(500, 550));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public static void main(String[] args) {
        MediaForm md = new MediaForm(null);
    }
}
