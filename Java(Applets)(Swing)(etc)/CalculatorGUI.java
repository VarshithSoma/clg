import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CalculatorGUI extends JFrame implements ActionListener {
    // Components
    JTextField textField;
    JButton[] numberButtons;
    JButton[] functionButtons;
    JPanel panel;
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    CalculatorGUI() {
        // Frame settings
        this.setTitle("Calculator");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        // Text Field
        textField = new JTextField();
        textField.setBounds(30, 40, 340, 50);
        textField.setEditable(false);
        // Number Buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }
        // Function Buttons
        functionButtons = new JButton[7];
        for (int i = 0; i < 7; i++) {
            functionButtons[i] = new JButton();
            functionButtons[i].addActionListener(this);
        }
        // Setting button text
        functionButtons[0].setText("C");
        functionButtons[1].setText("DEL");
        functionButtons[2].setText("/");
        functionButtons[3].setText("*");
        functionButtons[4].setText("-");
        functionButtons[5].setText("+");
        functionButtons[6].setText("=");
        // Panel
        panel = new JPanel();
        panel.setBounds(30, 100, 340, 400);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        // Adding components to the panel
        for(int i=1;i<=3;i++){
        panel.add(numberButtons[i]);
        }
        
        panel.add(functionButtons[2]);
        for(int i=4;i<=6;i++){
        panel.add(numberButtons[i]);
        }
        panel.add(functionButtons[3]);
        for(int i=7;i<=9;i++){
        panel.add(numberButtons[i]);
        }
        panel.add(functionButtons[4]);
        panel.add(functionButtons[0]);
        panel.add(numberButtons[0]);
        panel.add(functionButtons[6]);
        panel.add(functionButtons[5]);
        // Adding components to the frame
        this.add(textField);
        this.add(panel);
        // Setting visibility
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorGUI();
    }
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }
        if (e.getSource() == functionButtons[0]) { // Clear
            textField.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        }
        if (e.getSource() == functionButtons[1]) { // Delete
            String currentText = textField.getText();
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
        if (e.getSource() == functionButtons[2]) { // Division
            setOperator('/');
        }
        if (e.getSource() == functionButtons[3]) { // Multiplication
            setOperator('*');
        }
        if (e.getSource() == functionButtons[4]) { // Subtraction
            setOperator('-');
        }
        if (e.getSource() == functionButtons[5]) { // Addition
            setOperator('+');
        }
        if (e.getSource() == functionButtons[6]) { // Equals
            calculateResult();
        }
    }
    void setOperator(char op) {
        num1 = Double.parseDouble(textField.getText());
        operator = op;
        textField.setText("");
    }
    void calculateResult() {
        num2 = Double.parseDouble(textField.getText());
        switch (operator) 
	{
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    textField.setText("Error");
                    return;
                }
                break;
            default:
                textField.setText("Error");
                return;
        }
        textField.setText(String.valueOf(result));
        num1 = result;
        operator = '\0';
    }
}