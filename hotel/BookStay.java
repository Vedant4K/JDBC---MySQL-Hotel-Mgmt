/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import java.util.*;
//import java.sql;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Vedant
 */
public class BookStay extends javax.swing.JFrame {

    /**
     * Creates new form BookStay
     */
    int flag = -1;
    int x = -1;
    int finalroomno = 0;
    public BookStay() {
        initComponents();
        setLocationRelativeTo(null);
        bashcustid.setVisible(false);
        bsfinalroomno.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RTYPE = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        indate = new com.toedter.calendar.JDateChooser();
        outdate = new com.toedter.calendar.JDateChooser();
        BookButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        simple = new javax.swing.JRadioButton();
        suite = new javax.swing.JRadioButton();
        deluxe = new javax.swing.JRadioButton();
        BACKBTN = new javax.swing.JButton();
        availability = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bashcustid = new javax.swing.JLabel();
        bsfinalroomno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(201, 240, 246));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Book A Stay");

        BookButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BookButton.setText("BOOK");
        BookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("CHECK-IN DATE");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("CHECK-OUT DATE");

        RTYPE.add(simple);
        simple.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        simple.setText("Simple");
        simple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RTYPE.add(suite);
        suite.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        suite.setText("Suite");

        RTYPE.add(deluxe);
        deluxe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        deluxe.setText("Deluxe");

        BACKBTN.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BACKBTN.setText("BACK");
        BACKBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });

        availability.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        availability.setText("Check Availability");
        availability.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Choose a room type:");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vedant\\Downloads\\building_1_361x341.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bashcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BACKBTN)
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)
                        .addGap(106, 236, Short.MAX_VALUE)
                        .addComponent(bsfinalroomno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(simple, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(suite, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deluxe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(indate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(outdate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsfinalroomno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACKBTN))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(simple)
                                    .addComponent(suite)
                                    .addComponent(deluxe))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(indate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(outdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bashcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        NecessaryDetailsPage ndp = new NecessaryDetailsPage();
        java.util.Date indate = this.indate.getDate();
        java.sql.Date sqlDateIn = new java.sql.Date(indate.getTime());
        java.util.Date outdate = this.outdate.getDate();
        java.sql.Date sqlDateOut = new java.sql.Date(outdate.getTime());
        float finalgstamt=0, finaluseramt = 0, price, total_days, gstamt;
        Connection conn;
        PreparedStatement ps,ps1, ps2;
        
        
        
        if(RTYPE.getSelection() == null || sqlDateIn == null || sqlDateOut == null)
        {
            JOptionPane.showMessageDialog(this,"Please select the necessary details");
        }
        
        
        else if(flag == 1)
        {
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel?user=root&password=root");
                ps = conn.prepareStatement("update room set indate = ? , outdate = ? where rno = ?");
                ps.setDate(1, sqlDateIn);
                ps.setDate(2, sqlDateOut);
                ps.setInt(3, finalroomno);
                ps.executeUpdate();
                
                ps2 = conn.prepareStatement("select price, totaldays from room where rno = ?");
                ps2.setInt(1, finalroomno);
                ResultSet rst = ps2.executeQuery();
                
                while(rst.next())
                {
                    price = rst.getInt("price");
                    total_days = rst.getInt("totaldays");
                    finaluseramt = price * total_days;
                    gstamt = (float) 0.18 * finaluseramt;
                    finalgstamt = finaluseramt + gstamt;
                    ndp.amt.setText(String.valueOf(finaluseramt));
                    ndp.gst.setText(String.valueOf(0.18*finaluseramt));
                }
                ndp.finalamt.setText(String.valueOf(finalgstamt));
                
                
                ps1 = conn.prepareStatement("insert into allbookings(rno,rtype,indate,outdate,cust_id)values (?,?,?,?,?)");
                ps1.setInt(1,finalroomno);
                if(simple.isSelected())
                {
                    ps1.setString(2, "Simple");
                }
                if(suite.isSelected())
                {
                    ps1.setString(2, "Suite");
                }
                if(deluxe.isSelected())
                {
                    ps1.setString(2, "Deluxe");
                }
                ps1.setDate(3, sqlDateIn);
                ps1.setDate(4, sqlDateOut);
                ps1.setString(5, String.valueOf(bashcustid.getText()));
                ps1.executeUpdate();
                
                ndp.ndphcustid.setText(bashcustid.getText());
                ndp.ndpfinalrooomno.setText(bsfinalroomno.getText());
                ndp.setVisible(true);
                ndp.setLocationRelativeTo(null);
                this.dispose();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Sorry you cannot book a room");
        }
        
    }//GEN-LAST:event_BookButtonActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTNActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        hp.setLocationRelativeTo(null);
        this.dispose();
        Connection con;
        PreparedStatement pst;
        String firstname=null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel?user=root&password=root");
            pst = con.prepareStatement("select fname from user where cust_id = ?");
            pst.setString(1, bashcustid.getText());
            ResultSet r = pst.executeQuery();
            
            while(r.next())
            {
                firstname = r.getString("fname");
            }
            hp.unfromlogin.setText(firstname);
            hp.hcustid.setText(bashcustid.getText());
            hp.setVisible(true);
            hp.setLocationRelativeTo(null);
            this.dispose();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_BACKBTNActionPerformed

    private void availabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityActionPerformed
        // TODO add your handling code here:
        Connection conn;
        PreparedStatement ps, ps1;
        java.util.Date indate = this.indate.getDate();
        java.sql.Date sqlDateIn = new java.sql.Date(indate.getTime());
        java.util.Date outdate = this.outdate.getDate();
        java.sql.Date sqlDateOut = new java.sql.Date(outdate.getTime());
        long millis = System.currentTimeMillis();  
        java.sql.Date currentdate = new java.sql.Date(millis);
        
        if(sqlDateIn.compareTo(currentdate) < 0 || sqlDateOut.compareTo(currentdate) < 0 || (sqlDateIn.compareTo(sqlDateOut) > 0))
        {
            JOptionPane.showMessageDialog(this,"Invalid Dates");
        }
        
        
        else if(simple.isSelected())
        {
                try{
                   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel?user=root&password=root");
                   ps = conn.prepareStatement("select indate, outdate, rno from room where rtype = 'Simple'");
                   ResultSet rs = ps.executeQuery();
                   
                   
                   flag = 0;
                   x=0;
                   
                   
                   while(rs.next())
                   {
                       
                       if(rs.getDate("outdate") == null && rs.getDate("indate") == null)
                       {
                           finalroomno = rs.getInt("rno");
                           flag = 1;
                           break;
                       }
                       
                       else if(sqlDateIn.compareTo(rs.getDate("outdate")) == 0 || sqlDateOut.compareTo(rs.getDate("indate")) == 0 || sqlDateIn.compareTo(rs.getDate("indate")) == 0 || sqlDateOut.compareTo(rs.getDate("outdate")) == 0)
                       {
                           continue;
                       }
                       
                       
                       else if(sqlDateIn.compareTo(rs.getDate("outdate")) > 0 || sqlDateOut.compareTo(rs.getDate("indate")) < 0)
                       {
                           ps1 = conn.prepareStatement("select indate,outdate from allbookings where rtype = 'Simple' and rno = ? ORDER BY indate");
                           int i = rs.getInt("rno");
                           ps1.setString(1, String.valueOf(i));
                           ResultSet rs1 = ps1.executeQuery();
                           
                           if(rs1.next() == false)
                           {
                               finalroomno = i;
                               flag = 1;
                               break;
                           }
                           else
                           {
                              do{
                                  //System.out.println(rs1.getDate("indate") + " " + rs1.getDate("outdate"));
                                  if(sqlDateIn.compareTo(rs1.getDate("outdate")) == 0 || sqlDateOut.compareTo(rs1.getDate("indate")) == 0 || sqlDateIn.compareTo(rs1.getDate("indate")) == 0 || sqlDateOut.compareTo(rs1.getDate("outdate")) == 0)
                                {
                                    x = 0;
                                    break;
                                }
                                  
                                else if(sqlDateIn.compareTo(rs1.getDate("outdate")) > 0 || sqlDateOut.compareTo(rs1.getDate("indate")) < 0)
                                {
                                   finalroomno = i;
                                   flag = 1;
                                   x = 1;
                                   //break;
                                }
                                else
                                {
                                    x = 0;
                                    break;
                                }
                                  
                              }while(rs1.next());
                               
                           }
                           if(x == 1)
                           {
                               break;
                           }
                       }
                   }
                   
                   if(flag == 1)
                   {
                       JOptionPane.showMessageDialog(this,"Room is available");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(this,"Sorry, no rooms available");
                   }
                }
                catch(Exception e){
                    System.out.println(e);
                }
        }
        else if(suite.isSelected())
        {
            try{
                   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel?user=root&password=root");
                   ps = conn.prepareStatement("select indate, outdate, rno from room where rtype = 'Suite'");
                   ResultSet rs = ps.executeQuery();
                   
                   
                   flag = 0;
                   x=0;
                   
                   
                   while(rs.next())
                   {
                       //System.out.println(rs.getDate("indate") + " " + rs.getDate("outdate"));
                       if(rs.getDate("outdate") == null && rs.getDate("indate") == null)
                       {
                           finalroomno = rs.getInt("rno");
                           flag = 1;
                           break;
                       }
                       
                       else if(sqlDateIn.compareTo(rs.getDate("outdate")) == 0 || sqlDateOut.compareTo(rs.getDate("indate")) == 0 || sqlDateIn.compareTo(rs.getDate("indate")) == 0 || sqlDateOut.compareTo(rs.getDate("outdate")) == 0)
                       {
                           continue;
                       }
                       
                       
                       else if(sqlDateIn.compareTo(rs.getDate("outdate")) > 0 || sqlDateOut.compareTo(rs.getDate("indate")) < 0)
                       {
                           ps1 = conn.prepareStatement("select indate,outdate from allbookings where rtype = 'Suite' and rno = ? ORDER BY indate");
                           int i = rs.getInt("rno");
                           ps1.setString(1, String.valueOf(i));
                           ResultSet rs1 = ps1.executeQuery();
                           
                           if(rs1.next() == false)
                           {
                               finalroomno = i;
                               flag = 1;
                               break;
                           }
                           else
                           {
                              do{
                                  //System.out.println(rs1.getDate("indate") + " " + rs1.getDate("outdate"));
                                  if(sqlDateIn.compareTo(rs1.getDate("outdate")) == 0 || sqlDateOut.compareTo(rs1.getDate("indate")) == 0 || sqlDateIn.compareTo(rs1.getDate("indate")) == 0 || sqlDateOut.compareTo(rs1.getDate("outdate")) == 0)
                                {
                                    x = 0;
                                    break;
                                }
                                  
                                else if(sqlDateIn.compareTo(rs1.getDate("outdate")) > 0 || sqlDateOut.compareTo(rs1.getDate("indate")) < 0)
                                {
                                   finalroomno = i;
                                   flag = 1;
                                   x = 1;
                                   //break;
                                }
                                else
                                {
                                    x = 0;
                                    break;
                                }
                                  
                              }while(rs1.next());
                               
                           }
                           if(x == 1)
                           {
                               break;
                           }
                       }
                   }
                   
                   if(flag == 1)
                   {
                       JOptionPane.showMessageDialog(this,"Room is available");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(this,"Sorry, no rooms available");
                   }
                }
                catch(Exception e){
                    System.out.println(e);
                }
        }
        else if(deluxe.isSelected())
        {
           try{
                   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel?user=root&password=root");
                   ps = conn.prepareStatement("select indate, outdate, rno from room where rtype = 'Deluxe'");
                   ResultSet rs = ps.executeQuery();
                   
                   
                   flag = 0;
                   x=0;
                   
                   
                   while(rs.next())
                   {
                       
                       if(rs.getDate("outdate") == null && rs.getDate("indate") == null)
                       {
                           finalroomno = rs.getInt("rno");
                           flag = 1;
                           break;
                       }
                       
                       else if(sqlDateIn.compareTo(rs.getDate("outdate")) == 0 || sqlDateOut.compareTo(rs.getDate("indate")) == 0 || sqlDateIn.compareTo(rs.getDate("indate")) == 0 || sqlDateOut.compareTo(rs.getDate("outdate")) == 0)
                       {
                           continue;
                       }
                       
                       
                       else if(sqlDateIn.compareTo(rs.getDate("outdate")) > 0 || sqlDateOut.compareTo(rs.getDate("indate")) < 0)
                       {
                           ps1 = conn.prepareStatement("select indate,outdate from allbookings where rtype = 'Deluxe' and rno = ? ORDER BY indate");
                           int i = rs.getInt("rno");
                           ps1.setString(1, String.valueOf(i));
                           ResultSet rs1 = ps1.executeQuery();
                           
                           if(rs1.next() == false)
                           {
                               finalroomno = i;
                               flag = 1;
                               break;
                           }
                           else
                           {
                              do{
                                  //System.out.println(rs1.getDate("indate") + " " + rs1.getDate("outdate"));
                                  if(sqlDateIn.compareTo(rs1.getDate("outdate")) == 0 || sqlDateOut.compareTo(rs1.getDate("indate")) == 0 || sqlDateIn.compareTo(rs1.getDate("indate")) == 0 || sqlDateOut.compareTo(rs1.getDate("outdate")) == 0)
                                {
                                    x = 0;
                                    break;
                                }
                                  
                                else if(sqlDateIn.compareTo(rs1.getDate("outdate")) > 0 || sqlDateOut.compareTo(rs1.getDate("indate")) < 0)
                                {
                                   finalroomno = i;
                                   flag = 1;
                                   x = 1;
                                   //break;
                                }
                                else
                                {
                                    x = 0;
                                    break;
                                }
                                  
                              }while(rs1.next());
                               
                           }
                           if(x == 1)
                           {
                               break;
                           }
                       }
                   }
                   
                   if(flag == 1)
                   {
                       JOptionPane.showMessageDialog(this,"Room is available");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(this,"Sorry, no rooms available");
                   }
                }
                catch(Exception e){
                    System.out.println(e);
                }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please select values");
        }
        bsfinalroomno.setText(String.valueOf(finalroomno));
    }//GEN-LAST:event_availabilityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookStay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookStay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookStay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookStay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookStay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JButton BookButton;
    private javax.swing.ButtonGroup RTYPE;
    public javax.swing.JButton availability;
    public javax.swing.JLabel bashcustid;
    public javax.swing.JLabel bsfinalroomno;
    private javax.swing.JRadioButton deluxe;
    private com.toedter.calendar.JDateChooser indate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser outdate;
    private javax.swing.JRadioButton simple;
    private javax.swing.JRadioButton suite;
    // End of variables declaration//GEN-END:variables
}
