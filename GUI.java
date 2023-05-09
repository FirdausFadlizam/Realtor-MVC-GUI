import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.CardLayout;

public class GUI implements ActionListener{

    static JTextField jTextField;
    static JFrame jFrame;
    static CardLayout cl;

    static JPanel container;

    static HouseController houseController;
    public static void main(String[] args) {

        GUI gui = new GUI();
        houseController = new HouseController();
        cl = new CardLayout();
        jFrame = new JFrame("House Buying System");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,400);
        container = new JPanel();
        container.setLayout(cl);

        //Realtor view
        RealtorView realtorView = new RealtorView();
        JPanel realtorAddPanel = realtorView.getRealtorAddView();

        //Customer view
        CustomerView customerView = new CustomerView();
        JPanel customerPanel = customerView.searchHouse();
        JPanel detailedPanel = new JPanel();


        container.add(realtorAddPanel, "1");
        container.add(customerPanel, "2");
        container.add(detailedPanel, "3");
        cl.show(container, "1");
        jFrame.getContentPane().add(BorderLayout.WEST, container);
        jFrame.setVisible(true);



    }

    public void actionPerformed(ActionEvent e){

        //retrieve input of bid price from user and convert it into double type from string.


    }

}