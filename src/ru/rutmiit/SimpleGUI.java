package ru.rutmiit;

import java.awt.*; // Все подклассы и методы библиотеки
import javax.swing.*; // Для формочек (надпись, кнопка...)
import java.awt.event.*; // Отслеживание нажатий

// класс SimpleGUI наследует класс JFrame
public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("Select this:");
    private JRadioButton radio2 = new JRadioButton("Select that:");
    private JCheckBox check = new JCheckBox("Check", false);

    // Конструктор (что будет происходить при создании объекта этого класса)
    public SimpleGUI() {

        // Конструктор класса-наследника (JFrame)
        super("Simple example");

        // Установка размеров формочки
        this.setBounds(500, 200, 250, 100);

        // Операция по умолчанию при закрытии окошка
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // По сути формочка, в которую можно помещать всё что угодно (кнопки, поля...)
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        radio1.setSelected(true);

        container.add(radio1);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEventListener());

        container.add(button);

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected\n";
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }

}



















