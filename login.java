package bank.management.system;

import javax.swing.*;

public class login extends JFrame {
    login(){
      super("Bank Management System");
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("C:\\java\\Bhakti\\Bank Management System\\src\\icon\\bank.png"));

      setSize(858,480);
      setLocation(450,200);
      setVisible(true);
    }
    public static void main(String args[]){
        new login();


    }
}
