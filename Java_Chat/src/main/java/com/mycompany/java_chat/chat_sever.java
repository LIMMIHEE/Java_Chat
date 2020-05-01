/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_chat;

import static com.mycompany.java_chat.chat_client.dout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 임미희
 */
public class chat_sever extends javax.swing.JFrame {
        static ServerSocket Ss;
        static Socket Soket;
        static DataInputStream dis;
        static DataOutputStream dout;
        static String name="";

        
        private static boolean Chat_On_off=true;
    /**
     * Creates new form chat_sever
     */
    public chat_sever() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mes_btn = new javax.swing.JButton();
        Mes_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Msg_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mes_btn.setText("보내기");
        Mes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mes_btnActionPerformed(evt);
            }
        });

        Mes_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mes_fieldActionPerformed(evt);
            }
        });

        Msg_area.setColumns(20);
        Msg_area.setRows(5);
        jScrollPane1.setViewportView(Msg_area);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setText("SEVER");

        jLabel2.setText("서버 닫기 : exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Mes_field, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mes_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mes_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Mes_field))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mes_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mes_fieldActionPerformed
        // TODO add your handling code here:
//       try{
//        
//        String msg = "";
//        msg = Mes_field.getText();
//        dout.writeUTF(msg);
//        
//        //Msg_area.setText(Mes_field.getText()+"\n 관리자 : "+msg);
//        Mes_field.setText("");  
//       }catch(Exception e){
//           
//       }
//        
    }//GEN-LAST:event_Mes_fieldActionPerformed

    private void Mes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mes_btnActionPerformed
        // TODO add your handling code here:
        if(Chat_On_off){
            try{
            String msg = "";
            msg = Mes_field.getText();
            

      
            if(msg.equals("exit")){
                Msg_area.setText(Msg_area.getText()+"\n 관리자님이 서버를 닫았습니다.");
                Ss.close();
                Chat_On_off=false;
            }else{
                
                dout.writeUTF(msg);
              Msg_area.setText(Msg_area.getText()+"\n 관리자 : "+msg);
              Mes_field.setText("");  
            }
           }catch(Exception e){

           }
        }
        
    }//GEN-LAST:event_Mes_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
//        static ServerSocket Ss;
//        static Socket Soket;
//        static DataInputStream dis;
//        static DataOutputStream dout;
        
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
            java.util.logging.Logger.getLogger(chat_sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat_sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat_sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat_sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat_sever().setVisible(true);
            }
        });
        
        try{
            
            String Mes="";
//            String text="";
//            String Name="";
            Ss = new ServerSocket(2000);    // 서버 설정
            Soket = Ss.accept();
            dis = new DataInputStream(Soket.getInputStream());
            dout = new DataOutputStream(Soket.getOutputStream());
            
            while(Chat_On_off){
                        File file = new File("E:/전공/클론장소/Java_Chat/Output.txt");
                 FileReader file_reader = new FileReader(file);
                int num=0;
                name="";
                while((num = file_reader.read()) != -1){
                    name+=(char)num;
                }
                
                
                Mes = dis.readUTF();
                if(Mes.equals("exit")){
                    Msg_area.setText(Msg_area.getText()+"\n "+name+"님이 채팅방을 나갔습니다.");
                    file_reader.close();
                }else{
                    Msg_area.setText(Msg_area.getText()+"\n "+name+" : "+Mes);   
                }
                /*
                    Name = Mes.substring(Mes.lastIndexOf("/"+1));
                    Msg_area.setText(Msg_area.getText()+"\n 관리자 : "+Name);
                    System.out.println(text);
                    text = Mes.substring(0,Name.length());
                    System.out.println(Name);
                    //Msg_area.setText(Msg_area.getText()+"\n "+Name+" : "+Mes);
                    Msg_area.setText(Msg_area.getText()+"\n 관리자 : "+Mes);
                */
            }
            
            
            
        }catch(Exception e){
            
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mes_btn;
    private javax.swing.JTextField Mes_field;
    private static javax.swing.JTextArea Msg_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
