import javax.swing.*;

public class HelloWorld2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World!");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!", JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
