import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Name: " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "I am "+age +"old");

    }
}
