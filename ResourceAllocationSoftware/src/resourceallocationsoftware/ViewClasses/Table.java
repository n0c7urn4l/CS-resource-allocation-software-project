

package resourceallocationsoftware.ViewClasses;



import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
//        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//            @Override
//            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
//                if (i1 != 4) {
//                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
//                    com.setBackground(Color.WHITE);
//                    setBorder(noFocusBorder);
//                    if (selected) {
//                        com.setForeground(new Color(15, 89, 140));
//                    } else {
//                        com.setForeground(new Color(102, 102, 102));
//                    }
//                    return com;
//                } else {
//                    StatusType type = (StatusType) o;
//                    CellStatus cell = new CellStatus(type);
//                    return cell;
//                }
//            }
//        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}

class TableHeader extends JLabel {

    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("poppins", 1, 12));
        setForeground(new Color(57,72,103));
        setBorder(new EmptyBorder(10, 5, 10, 5));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
}

class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
}

class ModernScrollBarUI extends BasicScrollBarUI {

    private static final int SCROLL_BAR_ALPHA_ROLLOVER = 100;
    private static final int SCROLL_BAR_ALPHA = 50;
    private static final int THUMB_SIZE = 8;
    private static final Color THUMB_COLOR = Color.BLACK;

    public ModernScrollBarUI() {

    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        int alpha = isThumbRollover() ? SCROLL_BAR_ALPHA_ROLLOVER : SCROLL_BAR_ALPHA;
        int orientation = scrollbar.getOrientation();
        int x = thumbBounds.x;
        int y = thumbBounds.y;

        int width = orientation == JScrollBar.VERTICAL ? THUMB_SIZE : thumbBounds.width;
        width = Math.max(width, THUMB_SIZE);

        int height = orientation == JScrollBar.VERTICAL ? thumbBounds.height : THUMB_SIZE;
        height = Math.max(height, THUMB_SIZE);

        Graphics2D graphics2D = (Graphics2D) g.create();
        graphics2D.setColor(new Color(THUMB_COLOR.getRed(), THUMB_COLOR.getGreen(), THUMB_COLOR.getBlue(), alpha));
        graphics2D.fillRect(x, y, width, height);
        graphics2D.dispose();
    }

    private static class InvisibleScrollBarButton extends JButton {

        private InvisibleScrollBarButton() {
            setOpaque(false);
            setFocusable(false);
            setFocusPainted(false);
            setBorderPainted(false);
            setBorder(BorderFactory.createEmptyBorder());
        }
    }
}
