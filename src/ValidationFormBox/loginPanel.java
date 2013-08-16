/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * loginPanel.java
 *
 * Created on Dec 17, 2012, 7:25:25 AM
 */
package ValidationFormBox;

import Model.LoginModel;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.String;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import SimpleItemEnterInterface.BaseContainer;


/**
 *
 * @author paradise lost
 */
public class loginPanel extends javax.swing.JPanel {

    /** Creates new form loginPanel */
    public loginPanel() {
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        change2 = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        changeButton = new javax.swing.JToggleButton();
        submitButton = new javax.swing.JToggleButton();
        passwordField = new javax.swing.JPasswordField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 14), new java.awt.Dimension(0, 14), new java.awt.Dimension(32767, 14));
        passwordLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        displayLabel = new javax.swing.JLabel();
        adminButton = new javax.swing.JRadioButton();
        logoutButton = new javax.swing.JButton();
        newPwd1 = new javax.swing.JPasswordField();
        newPwd2 = new javax.swing.JPasswordField();
        change3 = new javax.swing.JLabel();
        StatusLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 12, 400, 0));

        change2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        change2.setForeground(new java.awt.Color(0, 0, 204));
        change2.setText("New Password");
        add(change2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));
        if(!BaseContainer.isuser)
        {
            change2.setVisible(false);
        }

        StatusLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(204, 0, 51));
        add(StatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 200, 30));
        if(!BaseContainer.isuser)
        {
            StatusLabel.setVisible(false);
        }

        changeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeButton.setForeground(new java.awt.Color(0, 51, 204));
        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });
        add(changeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 90, 30));
        if(!BaseContainer.isuser)
        {
            changeButton.setVisible(false);
        }

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 51, 204));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 90, -1));
        if(BaseContainer.isuser)
        {
            submitButton.setVisible(false);
        }

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 230, 30));
        if(BaseContainer.isuser)
        {
            passwordField.setVisible(false);
        }

        filler1.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        filler1.setForeground(new java.awt.Color(0, 0, 204));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 460, 250));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 204));
        passwordLabel.setText("Password ");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        if(BaseContainer.isuser)
        {
            passwordLabel.setVisible(false);
        }

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 204));
        userNameLabel.setText("User Name");
        add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));
        if(BaseContainer.isuser)
        {
            userNameLabel.setVisible(false);
        }

        UserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 230, 30));
        if(BaseContainer.isuser)
        {
            UserName.setVisible(false);
        }

        displayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        displayLabel.setForeground(new java.awt.Color(0, 0, 255));
        displayLabel.setText("Enter your username and passoword");
        add(displayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 410, -1));
        if(!BaseContainer.isuser)
        {
            displayLabel.setText("Enter your username and passoword");
        }
        else
        displayLabel.setText("Logged in as : "+BaseContainer.username);

        adminButton.setForeground(new java.awt.Color(0, 0, 255));
        adminButton.setText("Admin");
        adminButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                adminButtonStateChanged(evt);
            }
        });
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 80, -1));
        if(!BaseContainer.isuser)
        {
            logoutButton.setVisible(false);
        }
        add(newPwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 230, 30));
        if(!BaseContainer.isuser)
        {
            newPwd1.setVisible(false);
        }

        newPwd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPwd2ActionPerformed(evt);
            }
        });
        newPwd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPwd2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newPwd2KeyReleased(evt);
            }
        });
        add(newPwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 230, 30));
        if(!BaseContainer.isuser)
        {
            newPwd2.setVisible(false);
        }

        change3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        change3.setForeground(new java.awt.Color(0, 0, 204));
        change3.setText("Retype New Password");
        add(change3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));
        if(!BaseContainer.isuser)
        {
            change3.setVisible(false);
        }

        StatusLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StatusLabel1.setForeground(new java.awt.Color(204, 0, 51));
        add(StatusLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 230, 30));
        if(!BaseContainer.isuser)
        {
            StatusLabel.setVisible(false);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        try {
           if(newPwd2.getText().trim()!="" && newPwd1.getText().trim()!="" && newPwd1.getText()==newPwd2.getText())
           { LoginModel lm=new LoginModel();
            String[] name=BaseContainer.username.split("#");
            System.out.println(name[1].toString());
            lm.changePass(name[1].toString(),newPwd2.getText());  
            StatusLabel.setText("Password Change Successful !!");                      
            StatusLabel.setVisible(false);
            StatusLabel.setVisible(true);
           }
        } catch (SQLException ex) {
            Logger.getLogger(loginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            LoginModel lm=new LoginModel();
            String fmlyNm="";
            if("admin".equals(Case))
                fmlyNm=lm.getAdmin(UserName.getText(),passwordField.getText());
            else
                fmlyNm=lm.getUser(UserName.getText(),passwordField.getText().toString());
            
            if(fmlyNm.length()>3) {
                displayLabel.setVisible(false);
                displayLabel.setVisible(true);
                logoutButton.setVisible(true);
                passwordLabel.setVisible(false);
                passwordField.setVisible(false);
                userNameLabel.setVisible(false);
                submitButton.setVisible(false);
                UserName.setVisible(false);
                if("admin".equals(Case))
                 BaseContainer.isadmin=true;
                BaseContainer.isuser=true;
                BaseContainer.username=fmlyNm;
                Date date =new Date(); // your date
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH)+1;
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String[] id=fmlyNm.split("#");
                int ssn_id=new Integer(lm.getSsnId())+1;
                BaseContainer.ssn_id=ssn_id+"";
                displayLabel.setText("Logged in : "+fmlyNm+" "+date.toString());
                lm.setLog(ssn_id+"",id[0].toString(),year+"",month+"",day+"",date+"");
                showChangePassPanel(true);
                StatusLabel.setText(" ");
                StatusLabel1.setText(" ");
            }
            
            else {
                displayLabel.setText("Incorrect UserName or Password !");
                displayLabel.setVisible(false);
                displayLabel.setVisible(true);
                showChangePassPanel(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_submitButtonActionPerformed

    private void adminButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_adminButtonStateChanged
        if(adminButton.isSelected()) {
            Case="admin";
        } else
            Case="user";
        // TODO add your handling code here:
}//GEN-LAST:event_adminButtonStateChanged

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_adminButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        try {
            BaseContainer.username="";
            BaseContainer.isuser=false;
            BaseContainer.isadmin=false;// TODO add your handling code here:
            passwordLabel.setVisible(true);
            passwordField.setVisible(true);
            userNameLabel.setVisible(true);
            submitButton.setVisible(true);
            UserName.setVisible(true);
            displayLabel.setText("Enter your Username and Password ");
            displayLabel.setVisible(false);
            displayLabel.setVisible(true);
            LoginModel lm=new LoginModel();
            int ssn_id=new Integer(lm.getSsnId());
            lm.chkOutLog(ssn_id+"");
           showChangePassPanel(false);
        } catch (SQLException ex) {
            Logger.getLogger(loginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newPwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPwd2ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_newPwd2ActionPerformed

    private void newPwd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPwd2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPwd2KeyPressed

    private void newPwd2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPwd2KeyReleased
if(newPwd1.getText().equals(newPwd2.getText()))
        {
        StatusLabel.setText("Password Match");
        }
else
    StatusLabel.setText("Password donot Match");
    
    // TODO add your handling code here:
    }//GEN-LAST:event_newPwd2KeyReleased

    private void showChangePassPanel(boolean flag)
    {
    if(flag)
    {
   
    changeButton.setVisible(true);
    StatusLabel.setVisible(true);
    change2.setVisible(true);    
    change3.setVisible(true);
    newPwd1.setVisible(true);
    newPwd2.setVisible(true);   
    }
      else
    {
    changeButton.setVisible(false);
    StatusLabel.setVisible(false);
    change2.setVisible(false);
    change3.setVisible(false);
    newPwd1.setVisible(false);
    newPwd2.setVisible(false);    
    }    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel StatusLabel1;
    private javax.swing.JTextField UserName;
    private javax.swing.JRadioButton adminButton;
    private javax.swing.JLabel change2;
    private javax.swing.JLabel change3;
    private javax.swing.JToggleButton changeButton;
    private javax.swing.JLabel displayLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPasswordField newPwd1;
    private javax.swing.JPasswordField newPwd2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JToggleButton submitButton;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
     String Case="user";
}
