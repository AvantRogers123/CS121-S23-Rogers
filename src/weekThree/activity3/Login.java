package weekThree.activity3;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName = "Avant";
        String password = "Cool";
        String name;
        String pw;
        String message;

        name = JOptionPane.showInputDialog("Enter user name");
        pw = JOptionPane.showInputDialog("Enter user password");
       if (userName.equals(name)&& password.equals(pw)){
           message = "Welcome to CS121";
       }else if (userName.equals(name)&& !password.equals(pw)){
           message = "Password is incorrect";
       }else if (!userName.equals(name)&& password.equals(pw)) {
           message = "Username is incorrect";
       }
       else{
           message ="the username and password is both incorrect";
       }
       JOptionPane.showMessageDialog(null,message);

    }
}
