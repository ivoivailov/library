package log_reg;

import javax.swing.*;
import java.awt.*;

public class Insert_Edit_user extends JDialog{
    private JPanel Insert_Edit_User_Panel;

    public Insert_Edit_user(JFrame parent){
        super(parent);
        setTitle("Insert/Edit user");
        setContentPane(Insert_Edit_User_Panel);
        setMinimumSize(new Dimension(500, 550));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public static void main(String[] args) {
        Insert_Edit_user ieu = new Insert_Edit_user(null);
    }
}
