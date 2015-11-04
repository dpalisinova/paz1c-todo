package sk.upjs.ics.todo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class UlohaListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object uloha, int index, boolean isSelected, boolean cellHasFocus) {
        Component component = super.getListCellRendererComponent(list, uloha, index, isSelected, cellHasFocus);
        if (jeSplnena(uloha) && !isSelected) {
            component.setBackground(Color.green);
        }
        return component;
    }

    private boolean jeSplnena(Object uloha) {
        return true;
    }

}
