import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;

import java.awt.FlowLayout;

public class SwingSlide extends JFrame {

    private static final long serialVersionUID = 1L;

    private SwingSlide() {
        String text = "Hello, World!";

        JFrame frame = new JFrame();
        JSlider sldValue = new JSlider(0, 13, 0);
        JLabel lblDisplay = new JLabel();

        frame.setTitle("Hello World Slider");
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        sldValue.addChangeListener((ChangeEvent event) -> {
            lblDisplay.setText(text.substring(0, sldValue.getValue()));
        }); // event listener

        frame.add(lblDisplay);
        frame.add(sldValue);
    }

    public static void main(String[] args) {
        new SwingSlide();
    }
}