
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails, checkpackages,calculator, notepad;
    JButton bookpackages,viewpackages, viewhotels, destination, bookhotels,viewbookedhotels,payment,about, deletePersonalDetails;
    Dashboard(String username){
        this.username=username;
//        setBounds()
          setExtendedState(JFrame.MAXIMIZED_BOTH);
          setLayout(null);
          
          JPanel p1 = new JPanel();
          p1.setLayout(null);
          p1.setBackground(new Color(0,0,102));
          p1.setBounds(0,0,1600,65);
          add(p1);
          
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);//image ko label k upar lagana hai directly nahi laga sakte image icon me convert karke
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        heading.setBounds(80, 10,300,40);
        heading.setForeground(Color.WHITE);
        p1.add(heading);
        
        JPanel p2 = new JPanel();
          p2.setLayout(null);
          p2.setBackground(new Color(0,0,102));
          p2.setBounds(0,65,350,900);
          add(p2);
          
        addPersonalDetails = new JButton("Add personal Details");
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.BOLD,20));
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update personal Details");
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.BOLD,20));
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View personal Details");
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.BOLD,20));
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete personal Details");
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.BOLD,20));
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackages = new JButton("Check Packages");
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.BOLD,20));
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton("Book Packages");
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.BOLD,20));
        bookpackages.setBounds(0,250,300,50);
        bookpackages.setMargin(new Insets(0,0,0,120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton("View Packages");
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.BOLD,20));
        viewpackages.setBounds(0,300,300,50);
        viewpackages.setMargin(new Insets(0,0,0,120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.BOLD,20));
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels = new JButton("Book Hotels");
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma", Font.BOLD,20));
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setMargin(new Insets(0,0,0,140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookedhotels = new JButton("View Booked Hotels");
        viewbookedhotels.setBackground(new Color(0,0,102));
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma", Font.BOLD,20));
        viewbookedhotels.setBounds(0,450,300,50);
        viewbookedhotels.setMargin(new Insets(0,0,0,70));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);
        
        destination = new JButton("Destination");
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma", Font.BOLD,20));
        destination.setBounds(0,500,300,50);
        destination.setMargin(new Insets(0,0,0,125));
        destination.addActionListener(this);
        p2.add(destination);
        
        payment = new JButton("Payments");
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma", Font.BOLD,20));
        payment.setBounds(0,550,300,50);
        payment.setMargin(new Insets(0,0,0,155));
        payment.addActionListener(this);
        p2.add(payment);
        
        calculator = new JButton("calculator");
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.BOLD,20));
        calculator.setBounds(0,600,300,50);
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.BOLD,20));
        notepad.setBounds(0,650,300,50);
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("Abouts");
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.BOLD,20));
        about.setBounds(0,700,300,50);
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);//image ko label k upar lagana hai directly nahi laga sakte image icon me convert karke
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Ralway", Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource() == checkpackages){
            new CheckPackages();
        }else if(ae.getSource() == bookpackages){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackages){
            new ViewPackage(username);
        }else if(ae.getSource() == viewhotels){
            new CheckHotel();
        }else if(ae.getSource() == destination){
            new Destination();
        }else if(ae.getSource() == bookhotels){
            new BookHotel(username);
        }else if(ae.getSource() == viewbookedhotels){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
        else if(ae.getSource() == payment){
            new Payment();
        }else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
        }
        
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
}
