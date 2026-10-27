package org.example;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ActionUpdateThread;
import javax.swing.*;
import java.awt.*;
import com.intellij.openapi.util.IconLoader;

public class Show37Action extends AnAction {

    public Show37Action() {
        super(
                "Show 37",
                "Show a large number 37",
                IconLoader.getIcon("/icons/icon_37.svg", Show37Action.class)
        );
    }

    @Override
    public void update(AnActionEvent event) {
        event.getPresentation().setIcon(
                IconLoader.getIcon("/icons/icon_37.svg", Show37Action.class)
        );
    }

    @Override
    public ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.BGT;
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        JLabel number = new JLabel("37");
        number.setFont(new Font("Arial", Font.BOLD, 500));
        number.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(number, BorderLayout.CENTER);
        panel.setPreferredSize(new Dimension(900, 600));

        JOptionPane.showMessageDialog(
                null,
                panel,
                "37",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
