import javax.swing.JOptionPane;

public class AdditionGUI {
    public static void main(String args[]) {
        String firstNumber, secondNumber;
        int number1, number2, sum;

        firstNumber = JOptionPane.showInputDialog("Enter first number");
        secondNumber = JOptionPane.showInputDialog("Enter second number");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum,
                "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
