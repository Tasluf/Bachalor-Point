
package projectwithhand;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProjectWithHand extends JFrame implements MouseListener{
    private Container c;        //Main container for this Project
    private JPanel MainLeftPanel,userPageRightPanel,userPageRhymeDetails,userPageTilokDetails,userPageIshtiaqDetails,userPageMosarofDetails;   //Main left panel. Jai kahne user,bazar,bill ai butto thakbo.
    private CardLayout cardLayout;
    JButton user,meal,bazar,bill,amount,option;
    
    ProjectWithHand()
    {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bachalor Point");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        MainLeftPanel = new JPanel();
        c.add(MainLeftPanel);
        MainLeftPanel.setBounds(0,0,200,500);
        MainLeftPanel.setBackground(new java.awt.Color(43, 30, 72));
        MainLeftPanel.setLayout(null);
        SetIcon();  //Frame ar left side sob icon set korbo. Ex: user,Meal,Amount,Option etc
        //LabelEffect();
        SetButton(); //Frame ar left side sob label set korbo. Ex: user,Meal,Amount,Option etc
        SetUserPage();
        
    }
    public void SetUserPage()
    {
        UserPage userpage = new UserPage(userPageRightPanel,userPageRhymeDetails,userPageTilokDetails,userPageIshtiaqDetails,userPageMosarofDetails);
        c.add(userpage.panel);
        c.add(userpage.panel2);
        c.add(userpage.panel3);
        c.add(userpage.panel4);
        c.add(userpage.panel5);
        userpage.UserPanel();
        userpage.UserPanel2();
        userpage.UserPanel3();
        userpage.UserPanel4();
        userpage.UserPanel5();
    }
    public void SetIcon()//Aita icon set korbo. User, Meal, Option oigoal.
    {
        
        
        JLabel userIcon = new JLabel();
        labelGenarator(userIcon,"2703063-512.png",70);

        JLabel MealIcon = new JLabel();
        labelGenarator(MealIcon,"meal.png",125);

        JLabel BazarIcon = new JLabel();
        labelGenarator(BazarIcon,"bazar.png",180);

        JLabel BillIcon = new JLabel();
        labelGenarator(BillIcon,"bill.png",235);
        
        JLabel AmountIcon = new JLabel();
        labelGenarator(AmountIcon,"amount.png",290);
        
        JLabel OptionIcon = new JLabel();
        labelGenarator(OptionIcon,"option.png",345);
        
    }
    public void labelGenarator(JLabel userIcon,String forIconGenarator,int y) //Aita icon ar jonno label genarate korbo. User bill amount meal ai gola.
    {
        MainLeftPanel.add(userIcon);
        userIcon.setBounds(45,(y+7),25,25);
        userIcon.setOpaque(true);
        userIcon.setBackground(new java.awt.Color(43, 30, 72));
        userIcon.setIcon(iconGenarator(forIconGenarator));
    }
    public ImageIcon iconGenarator(String s)    //Aita icon genarate korbo. User bill amount meal ai gola.
    {
        ImageIcon icon = new ImageIcon("src/ProjectWithHand/"+s);
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(25,25, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }

    public void SetButton() // Aita button creat korbo left panel a. and button a user, Amount, bill etc likha thakbo
    {
        Font f = new Font("Calibri", 0, 18);
        
        user = new JButton();
        labelGenarator(user,"User",70,f);
        user.addMouseListener(this);
        
        meal = new JButton();
        labelGenarator(meal,"Meal",125,f);
        meal.addMouseListener(this);
        
        bazar = new JButton();
        labelGenarator(bazar,"Bazar",180,f);
        bazar.addMouseListener(this);
        
        bill = new JButton();
        labelGenarator(bill,"Bill",235,f);
        bill.addMouseListener(this);
        
        amount = new JButton();
        labelGenarator(amount,"Amount",290,f);
        amount.addMouseListener(this);
        
        option = new JButton();
        labelGenarator(option,"Option",345,f);
        option.addMouseListener(this);
    }
    public void labelGenarator(JButton user,String text,int y,Font f) //Aita user,amount meal likhae ar jonno label genarate korbo.
    {
        MainLeftPanel.add(user);
        user.setBounds(95,(y+2),75, 40);
        user.setText(text);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.setFont(f);
        user.setVisible(true);
        user.setFocusable(false);
        user.setBorder(null);
        user.setOpaque(true);
        user.setBackground(new java.awt.Color(43, 30, 72));
        user.setForeground(Color.white);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == user)
        {
            user.setBackground(new java.awt.Color(24, 17, 41));
        }
        else if(e.getSource() == meal)
        {
            meal.setBackground(new java.awt.Color(24, 17, 41));
        }
        else if(e.getSource() == bazar)
        {
            bazar.setBackground(new java.awt.Color(24, 17, 41));
        }
        else if(e.getSource() == bill)
        {
            bill.setBackground(new java.awt.Color(24, 17, 41));
        }
        else if(e.getSource() == amount)
        {
            amount.setBackground(new java.awt.Color(24, 17, 41));
        }
        else if(e.getSource() == option)
        {
            option.setBackground(new java.awt.Color(24, 17, 41));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == user)
        {
            user.setBackground(new java.awt.Color(43, 30, 72));
        }
        else if(e.getSource() == meal)
        {
            meal.setBackground(new java.awt.Color(43, 30, 72));
        }
        else if(e.getSource() == bazar)
        {
            bazar.setBackground(new java.awt.Color(43, 30, 72));
        }
        else if(e.getSource() == bill)
        {
            bill.setBackground(new java.awt.Color(43, 30, 72));
        }
        else if(e.getSource() == amount)
        {
            amount.setBackground(new java.awt.Color(43, 30, 72));
        }
        else if(e.getSource() == option)
        {
            option.setBackground(new java.awt.Color(43, 30, 72));
        }
    }
    
    public static void main(String[] args) {
        ProjectWithHand frame = new ProjectWithHand();
    }

    
    
}
