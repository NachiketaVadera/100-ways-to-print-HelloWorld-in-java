import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HelloWorld_UsingButton extends JFrame implements ActionListener {

        private JButton button;

        public HelloWorld_UsingButton() {
                setTitle("Print Hello World");
                setVisible(true);
                setSize(300, 300);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setLayout(new FlowLayout());

                button = new JButton("Press to Greet");
                button.addActionListener(this);
                add(button);
        }

        public static void main(String[] args) {
                new HelloWorld_UsingButton();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
                System.out.println("Hello, World!");
        }
}
