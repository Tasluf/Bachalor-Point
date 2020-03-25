
package projectwithhand;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserPage implements ActionListener{
    JPanel panel,panel2,panel3,panel4,panel5;
    JButton rhyme,tilok,riaz,istaik;
    JLabel name,mobile,blood,address;
    JLabel nameTilok,mobileTilok,bloodTilok,addressTilok;
    JLabel nameIshtiaq,mobileIshtiaq,bloodIshtiaq,addressIshtiaq;
    JLabel nameMosarof,mobileMosarof,bloodMosarof,addressMosarof;
    UserPage(JPanel panel,JPanel panel2,JPanel panel3,JPanel panel4,JPanel panel5)
    {
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        this.panel = panel;
        this.panel2 = panel2;
        this.panel3 = panel3;
        this.panel4 = panel4;
        this.panel5 = panel5;
    }
    public void UserPanel()
    {
        panel.setBounds(200,70,600,140);
        panel.setBackground(new java.awt.Color(67, 47, 125));
        panel.setLayout(null);
        SetButton();
        SetIcon();
    }
    public void UserPanel2()
    {
        panel2.setBounds(200,210,600,240);
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);
        panel2.setVisible(true);
        DetailesForRhyme();
        
    }
    public void UserPanel3()
    {
        panel3.setBounds(200,210,600,240);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(null);
        panel3.setVisible(false);
        DetailesForTilok();
    }
    public void UserPanel4()
    {
        panel4.setBounds(200,210,600,240);
        panel4.setBackground(Color.WHITE);
        panel4.setLayout(null);
        panel4.setVisible(false);
        DetailesForIshtiaq();
    }
    public void UserPanel5()
    {
        panel5.setBounds(200,210,600,240);
        panel5.setBackground(Color.WHITE);
        panel5.setLayout(null);
        panel5.setVisible(false);
        DetailesForMosarof();
    }
    public void SetButton() // Aita button creat korbo left panel a. and button a user, Amount, bill etc likha thakbo
    {
        Font f = new Font("Calibri", 0, 16);
        
        rhyme = new JButton();
        labelGenarator(rhyme,"Md Tasluf Morshed",65,28,f);
        rhyme.addActionListener(this);
        
        tilok = new JButton();
        labelGenarator(tilok,"Assadujjaman Tilok",360,28,f);
        tilok.addActionListener(this);
        
        istaik = new JButton();
        labelGenarator(istaik,"Sayed Mohammed Ishtiaq",85,85,f);
        istaik.addActionListener(this);
        
        riaz = new JButton();
        labelGenarator(riaz,"Md. Mosarof Korim",360,85,f);
        riaz.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rhyme)
        {
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
        }
        else if(e.getSource() == tilok)
        {
            panel2.setVisible(false);
            panel3.setVisible(true);
            panel4.setVisible(false);
            panel5.setVisible(false);
        }
        else if(e.getSource() == istaik)
        {
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(true);
            panel5.setVisible(false);
        }
        else if(e.getSource() == riaz)
        {
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(true);
        }
    }
    
    public void labelGenarator(JButton user,String text,int x,int y,Font f) //Aita user,amount meal likhae ar jonno label genarate korbo.
    {
        panel.add(user);
        user.setBounds(x,y,180, 40);
        user.setText(text);
        user.setFont(f);
        user.setVisible(true);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.setFocusable(false);
        user.setBorder(null);
        user.setOpaque(true);
        user.setBackground(new java.awt.Color(67, 47, 125));
        user.setForeground(Color.white);
    }
    
    public void SetIcon()
    {
        JLabel userIcon = new JLabel();
        labelGenarator(userIcon,"2703063-512.png",40,28);

        JLabel userIcon2 = new JLabel();
        labelGenarator(userIcon2,"2703063-512.png",335,28);

        JLabel userIcon3 = new JLabel();
        labelGenarator(userIcon3,"2703063-512.png",40,85);

        JLabel userIcon4 = new JLabel();
        labelGenarator(userIcon4,"2703063-512.png",335,85);
    }
    
    public void labelGenarator(JLabel userIcon,String forIconGenarator,int x,int y) //Aita icon ar jonno label genarate korbo. User bill amount meal ai gola.
    {
        panel.add(userIcon);
        userIcon.setBounds(x,(y+3),25,25);
        userIcon.setOpaque(true);
        userIcon.setBackground(new java.awt.Color(67, 47, 125));
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
    
    public void DetailesForRhyme()
    {
        Font f = new Font("Calibri", 0, 16);
        
        name = new JLabel();
        labelGenarator(panel2,name,"Name: Md Tasluf Morshed",310,50,f,true);
        
        mobile = new JLabel();
        labelGenarator(panel2,mobile,"Mobile: 01956140407",310,80,f,true);
        
        blood = new JLabel();
        labelGenarator(panel2,blood,"Blood: B+",310,110,f,true);
        
        address = new JLabel();
        labelGenarator(panel2,address,"Address: Mushiganj, Dhaka",310,140,f,true);
    }
    public void DetailesForTilok()
    {
        Font f = new Font("Calibri", 0, 16);
        
        nameTilok = new JLabel();
        labelGenarator(panel3,nameTilok,"Name: Assadujjaman Tilok",310,50,f,true);
        
        mobileTilok = new JLabel();
        labelGenarator(panel3,mobileTilok,"Mobile: 0198844552",310,80,f,true);
        
        bloodTilok = new JLabel();
        labelGenarator(panel3,bloodTilok,"Blood: A+",310,110,f,true);
        
        addressTilok = new JLabel();
        labelGenarator(panel3,addressTilok,"Address: Mushiganj, Dhaka",310,140,f,true);
    }
    public void DetailesForIshtiaq()
    {
        Font f = new Font("Calibri", 0, 16);
        
        nameIshtiaq = new JLabel();
        labelGenarator(panel4,nameIshtiaq,"Name: Sayed Mohammed Ishtiaq",310,50,f,true);
        
        mobileIshtiaq = new JLabel();
        labelGenarator(panel4,mobileIshtiaq,"Mobile: 018456552",310,80,f,true);
        
        bloodIshtiaq = new JLabel();
        labelGenarator(panel4,bloodIshtiaq,"Blood: O+",310,110,f,true);
        
        addressIshtiaq = new JLabel();
        labelGenarator(panel4,addressIshtiaq,"Address: Mirpur, Dhaka",310,140,f,true);
    }
    public void DetailesForMosarof()
    {
        Font f = new Font("Calibri", 0, 16);
        
        nameMosarof = new JLabel();
        labelGenarator(panel5,nameMosarof,"Name: Md. Mosarof Korim",310,50,f,true);
        
        mobileMosarof = new JLabel();
        labelGenarator(panel5,mobileMosarof,"Mobile: 0133456552",310,80,f,true);
        
        bloodMosarof = new JLabel();
        labelGenarator(panel5,bloodMosarof,"Blood: AB+",310,110,f,true);
        
        addressMosarof = new JLabel();
        labelGenarator(panel5,addressMosarof,"Address: Coxs Bazar, Dhaka",310,140,f,true);
    }
     public void labelGenarator(JPanel panel,JLabel user,String text,int x,int y,Font f,boolean b) //Aita user,amount meal likhae ar jonno label genarate korbo.
    {
        panel.add(user);
        user.setBounds(x,y,220, 40);
        user.setText(text);
        user.setFont(f);
        user.setVisible(b);
        user.setFocusable(false);
        user.setBorder(null);
        user.setOpaque(true);
        user.setBackground(Color.white);
        user.setForeground(Color.black);
    }

    
}
