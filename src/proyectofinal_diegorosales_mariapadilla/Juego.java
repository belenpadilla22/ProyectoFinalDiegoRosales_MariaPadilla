package proyectofinal_diegorosales_mariapadilla;
// ola
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author belen
 */
public class Juego extends javax.swing.JFrame {
    private ArrayList<User> usuarios = new ArrayList();

   
    /**
     * Creates new form Juego
     */
    public Juego() {
       
        initComponents(); 
        botones();
        
        Timer timer=new Timer (1900,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pack();
                jFrame1.pack();
                setLocationRelativeTo(null);
                jFrame1.setVisible(true);
                setVisible(false);
            }
        });
        timer.setRepeats(false);
        timer.start();
        
        
        Timer timer2=new Timer (3000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               Login.pack();
               setLocationRelativeTo(null);
               Login.setVisible(true);
               jFrame1.setVisible(false);
            }
        
        
        });
        timer2.setRepeats(false);
        timer2.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JFrame_Menu = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        B_Clan = new javax.swing.JButton();
        B_Tv = new javax.swing.JButton();
        B_Battle = new javax.swing.JButton();
        B_Mazo = new javax.swing.JButton();
        B_Tienda = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        Login = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Contra = new javax.swing.JTextField();
        Registro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jF_Mazo = new javax.swing.JFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        jB_Duende = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jb_MiniPekka = new javax.swing.JButton();
        jb_Caballero = new javax.swing.JButton();
        jb_gigante = new javax.swing.JButton();
        jb_flechas = new javax.swing.JButton();
        jb_esqueleto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/InicioDesesion2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JFrame_Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/trainingarena.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        JFrame_Menu.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 250, 260));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/menubarr - copia.png"))); // NOI18N
        JFrame_Menu.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 480, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/background cut.jpg"))); // NOI18N
        JFrame_Menu.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        B_Clan.setText("jButton1");
        JFrame_Menu.getContentPane().add(B_Clan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, -1, 70));

        B_Tv.setText("jButton2");
        JFrame_Menu.getContentPane().add(B_Tv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 577, -1, 80));

        B_Battle.setText("jButton3");
        B_Battle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_BattleMouseClicked(evt);
            }
        });
        JFrame_Menu.getContentPane().add(B_Battle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 577, 160, 80));

        B_Mazo.setText("jButton4");
        B_Mazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_MazoMouseClicked(evt);
            }
        });
        B_Mazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MazoActionPerformed(evt);
            }
        });
        JFrame_Menu.getContentPane().add(B_Mazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, 80));

        B_Tienda.setText("jButton5");
        JFrame_Menu.getContentPane().add(B_Tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 577, -1, 80));

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/login images.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Registration/Login");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("User:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Password:");

        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(0, 51, 255));
        Registro.setText("Registration");
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(Contra)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Registro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Registro)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/background cut.jpg"))); // NOI18N
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 590));

        jB_Duende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/emptycarddeck.png"))); // NOI18N
        jLayeredPane1.setLayer(jB_Duende, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jB_Duende, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 380, 220));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/levelbar.png"))); // NOI18N
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/gold bar.png"))); // NOI18N
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/gem bar.png"))); // NOI18N
        jLabel17.setToolTipText("");
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 110, 20));

        jb_MiniPekka.setText("jButton1");
        jLayeredPane1.add(jb_MiniPekka, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 60));

        jb_Caballero.setText("jButton1");
        jLayeredPane1.add(jb_Caballero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 60));

        jb_gigante.setText("jButton1");
        jLayeredPane1.add(jb_gigante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, 60));

        jb_flechas.setText("jButton1");
        jLayeredPane1.add(jb_flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 110, 80, 60));

        jb_esqueleto.setText("jButton1");
        jLayeredPane1.add(jb_esqueleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 60));

        javax.swing.GroupLayout jF_MazoLayout = new javax.swing.GroupLayout(jF_Mazo.getContentPane());
        jF_Mazo.getContentPane().setLayout(jF_MazoLayout);
        jF_MazoLayout.setHorizontalGroup(
            jF_MazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jF_MazoLayout.setVerticalGroup(
            jF_MazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/background cut.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inicio.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/clash-clashroyale.gif"))); // NOI18N

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        // TODO add your handling code here:
        //aqui
    }//GEN-LAST:event_UserMouseClicked

    private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
        AdministradorUsuarios ad = new AdministradorUsuarios("./Jugadores.MBP");
        ad.CargarArchivo();
        ValidadContraseña();
        
        if (ad.getUsuarios().isEmpty()) { // Crear jugador nuevo (Si no ahy ningun jugador anteriormente)
            User u = new User(User.getText());
            ad.getUsuarios().add(u); // Agrego
            ad.EscribirArchivo();// 
            usuarios.add(u); // Agreggo al global
            JOptionPane.showMessageDialog(Login, "Jugador Creado");

        } else {

            boolean rep = false;
            for (User us : ad.getUsuarios()) {
                if (us.getUsuario().equals(User.getText())) {
                    JOptionPane.showMessageDialog(Login, "Usuario ya existe");
                    rep = true;
                }

            }
            if (!rep) {
                User u = new User(User.getText());
                ad.getUsuarios().add(u);
                ad.EscribirArchivo();
                usuarios.add(u);
                JOptionPane.showMessageDialog(Login, "Jugador Creado");
            }

        }
       
        User.setText("");
        Contra.setText("");

    }//GEN-LAST:event_RegistroMouseClicked

    private void B_BattleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_BattleMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_B_BattleMouseClicked

    private void B_MazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_MazoMouseClicked
        //mazo
        
    }//GEN-LAST:event_B_MazoMouseClicked

    private void B_MazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_MazoActionPerformed


// metodos
    
    
    public void botones (){
        B_Battle.setOpaque(false);
        B_Battle.setContentAreaFilled(false);
        B_Battle.setBorderPainted(false);
        //
        B_Mazo.setOpaque(false);
        B_Mazo.setContentAreaFilled(false);
        B_Mazo.setBorderPainted(false);
        //
        B_Tienda.setOpaque(false);
        B_Tienda.setContentAreaFilled(false);
        B_Tienda.setBorderPainted(false);
        //
        B_Tv.setOpaque(false);
        B_Tv.setContentAreaFilled(false);
        B_Tv.setBorderPainted(false);
        //
        B_Clan.setOpaque(false);
        B_Clan.setContentAreaFilled(false);
        B_Clan.setBorderPainted(false);
        /////
        jb_Caballero.setOpaque(false);
        jb_Caballero.setContentAreaFilled(false);
        jb_Caballero.setBorderPainted(false);
        //
        jb_MiniPekka.setOpaque(false);
        jb_MiniPekka.setContentAreaFilled(false);
        jb_MiniPekka.setBorderPainted(false);
        //
        jb_esqueleto.setOpaque(false);
        jb_esqueleto.setContentAreaFilled(false);
        jb_esqueleto.setBorderPainted(false);
        //
        jb_flechas.setOpaque(false);
        jb_flechas.setContentAreaFilled(false);
        jb_flechas.setBorderPainted(false);
        //
        jb_gigante.setOpaque(false);
        jb_gigante.setContentAreaFilled(false);
        jb_gigante.setBorderPainted(false);
        
    
    
    }
  
    public void ValidadContraseña (){
         if (!ValidarPassword(Contra.getText())){
            JOptionPane.showMessageDialog(Login, "Contraseña no valida ");   
        }else {
             JOptionPane.showMessageDialog(Login, "Contraseña valida  ");
             JFrame_Menu.pack();
             setLocationRelativeTo(null);
             JFrame_Menu.setVisible(true);
             Login.setVisible(false);
        }
       
    }
    

    public static boolean ValidarPassword (String password){   
        String regex = "^[a-zA-Z0-9]{6,}$";Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
        
    }
        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Sound sound=new Sound ("./src/audio/sonido.wav");
        sound.start();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
        
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Battle;
    private javax.swing.JButton B_Clan;
    private javax.swing.JButton B_Mazo;
    private javax.swing.JButton B_Tienda;
    private javax.swing.JButton B_Tv;
    private javax.swing.JTextField Contra;
    private javax.swing.JPanel Inicio;
    private javax.swing.JFrame JFrame_Menu;
    private javax.swing.JFrame Login;
    private javax.swing.JButton Registro;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jB_Duende;
    private javax.swing.JFrame jF_Mazo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb_Caballero;
    private javax.swing.JButton jb_MiniPekka;
    private javax.swing.JButton jb_esqueleto;
    private javax.swing.JButton jb_flechas;
    private javax.swing.JButton jb_gigante;
    // End of variables declaration//GEN-END:variables
}
