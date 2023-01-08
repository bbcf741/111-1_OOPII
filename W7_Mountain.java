import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class W7_Mountain extends JFrame implements ListSelectionListener{
    public static void main(String[] args){
        W7_Mountain mont = new W7_Mountain();
        mont.setVisible(true);
    }

    JLabel jLabel;
    JList<String> jList;
    JTextArea jTextArea;
    String cities[] = {"台北", "桃園", "台中", "南投", "彰化", "台南"};
    String monts[] = {"七星山", "石門山", "梨山", "虎子山", "八卦山", "關仔嶺大凍山"};

    public W7_Mountain(){
        super("各地名山");
        
        setBounds(0, 0, 300, 240);
        setLayout(null);

        jLabel = new JLabel("找各地名山：");
        add(jLabel);
        jLabel.setBounds(60, 10, 100, 100);
            
        jList = new JList<String>(cities);
        jList.addListSelectionListener(this);
        JScrollPane jsp1 = new JScrollPane(jList);
        add(jsp1);
        jsp1.setBounds(140, 20, 80, 80);

        jTextArea = new JTextArea("可單取/複選地名");
        JScrollPane jsp2 = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp2);
        jsp2.setBounds(40, 120, 200, 60);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String text = "";
        for(int i : jList.getSelectedIndices()){
            text = text + cities[i] + " 名山" + "：　" + monts[i] + "\n";
            jTextArea.setText(text);
        }
    }
}