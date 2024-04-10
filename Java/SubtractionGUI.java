import javax.swing.JOptionPane;

public class SubtractionGUI {
    public static void main(String [] args){
        String num1,num2;
        int firstNumber,secondNumber;
        double average;
        num1=JOptionPane.showInputDialog("Enter the first Number");
        num2=JOptionPane.showInputDialog("Enter second number");

        firstNumber=Integer.parseInt(num1);
        secondNumber=Integer.parseInt(num2);

        average=(firstNumber+secondNumber)/2;

        JOptionPane.showMessageDialog(null, "The average is "+average,"of two numbers",JOptionPane.PLAIN_MESSAGE);

    }
}
