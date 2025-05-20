
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
    Choice cPackage;
    JTextField tfperson;
    String username;
    JLabel labelusername,lblusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    BookPackage(String username){
        this.username=username;
        setBounds(350,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Tahoma", Font.BOLD,20));
        add(text);
        
        lblusername = new JLabel("Username");
        lblusername.setBounds(40,70,100,20);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN,16));
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma", Font.PLAIN,16));
        labelusername.setBounds(250,70,100,20);
        add(labelusername);
        
        JLabel lblpackage = new JLabel("SELECT PACKAGE");
        lblpackage.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
        cPackage = new Choice();
        cPackage.add("Gold Package");
        cPackage.add("Silver Package");
        cPackage.add("Bronge Package");
        cPackage.setBounds(250,110,200,20);
        add(cPackage);
        
        JLabel lblperson = new JLabel("Total Person");
        lblperson.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblperson.setBounds(40,150,150,25);
        add(lblperson);
        
        tfperson = new JTextField("1");
        tfperson.setBounds(250,150,200,25);
        add(tfperson);
                
        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblid.setBounds(40,190,150,20);
        add(lblid);
                
        labelid = new JLabel();
        labelid.setBounds(250,290,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblnumber.setBounds(40,230,150,25);
        add(lblnumber);
        
         labelnumber = new JLabel();
        labelnumber.setBounds(250,230,150,25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblphone.setBounds(40,270,150,20);
        add(lblphone);
                
        labelphone = new JLabel();
        labelphone.setBounds(250,270,150,25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma", Font.PLAIN,16));
        lbltotal.setBounds(40,310,150,25);
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,310,150,25);
        add(labelprice);
        
        try{
            conn c = new conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));                         
                labelphone.setText(rs.getString("phone"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        checkprice = new JButton("Check Price");
        //checkprice.setBackground(Color.WHITE);
        checkprice.setForeground(Color.BLACK);
        //checkprice.setFont(new Font("Tahoma", Font.BOLD,20));
        checkprice.setBounds(60,380,120,25);
        //checkprice.setMargin(new Insets(0,0,0,120));
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage = new JButton("Book Package");
        //bookpackage.setBackground(Color.WHITE);
        bookpackage.setForeground(Color.BLACK);
        //bookpackage.setFont(new Font("Tahoma", Font.BOLD,20));
        bookpackage.setBounds(200,380,120,25);
        //bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back = new JButton("Back");
        //back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        //back.setFont(new Font("Tahoma", Font.BOLD,20));
        back.setBounds(340,380,120,25);
        //back.setMargin(new Insets(0,0,0,120));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(550,50,500,300);
        add(l12);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            String pack = cPackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("Gold Package")){
                cost += 12000;
            }else if(pack.equals("Silver Package")){
                cost += 25000;
            }else{
                cost += 32000;
            }
            int persons = Integer.parseInt(tfperson.getText());
            cost *= persons;
            labelprice.setText("Rs"+cost);
        }else if(ae.getSource()==bookpackage){
            try{
                conn c = new conn();
                c.s.executeUpdate("insert into bookpackage values ('"+labelusername.getText()+"', '"+cPackage.getSelectedItem()+"', '"+tfperson.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null, "Package Booked SuccesFully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new BookPackage("sahil");
    }
}
