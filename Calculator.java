import javax.swing.JOptionPane ;
public class Calculator {
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        
        Double Sum1 = num1 + num2;
        String Sum = "The sum is: " + Sum1;

        Double Diff1 = num1 - num2;
        String Diff = "The difference is: " + Diff1;

        Double Pro1 = num1 * num2;
        String Pro = "The product is: " + Pro1;

        Double Quo1 = num1 / num2;
        String Quo = "The quotient is: " + Quo1;

        JOptionPane.showMessageDialog(null,Sum, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,Diff, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,Pro, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,Quo, "Calculator", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
//exercise 2.2.5
