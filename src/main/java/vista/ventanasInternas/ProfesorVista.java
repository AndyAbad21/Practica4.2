/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista.ventanasInternas;

import controlador.AsignaturaControl;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy Abad
 */
public class ProfesorVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProfesorVentana
     */
    public ProfesorVista() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setText("Formulario de Profesor");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Correo: ");

        jLabel4.setText("Titulo: ");

        jLabel5.setText("Fecha de Nacimiento: ");

        jLabel6.setText("Anios de Trabajo: ");

        jLabel7.setText("Codigo: ");

        jLabel8.setText("Codigo de Asignatura: ");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, 0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setLenguajeProfesorVentana(ResourceBundle resourceBundle)
    {
        jLabel1.setText(resourceBundle.getString("JLABELPV1"));
        jLabel2.setText(resourceBundle.getString("JLABELPV2")+": ");
        jLabel3.setText(resourceBundle.getString("JLABELPV3")+": ");
        jLabel4.setText(resourceBundle.getString("JLABELPV4")+": ");
        jLabel5.setText(resourceBundle.getString("JLABELPV5")+": ");
        jLabel6.setText(resourceBundle.getString("JLABELPV6")+": ");
        jLabel7.setText(resourceBundle.getString("JLABELPV7")+": ");
        jLabel8.setText(resourceBundle.getString("JLABELPV8")+": ");
        
        
        jComboBox2.removeAllItems();
        jComboBox2.addItem(resourceBundle.getString("MES1"));
        jComboBox2.addItem(resourceBundle.getString("MES2"));
        jComboBox2.addItem(resourceBundle.getString("MES3"));
        jComboBox2.addItem(resourceBundle.getString("MES4"));
        jComboBox2.addItem(resourceBundle.getString("MES5"));
        jComboBox2.addItem(resourceBundle.getString("MES6"));
        jComboBox2.addItem(resourceBundle.getString("MES7"));
        jComboBox2.addItem(resourceBundle.getString("MES8"));
        jComboBox2.addItem(resourceBundle.getString("MES9"));
        jComboBox2.addItem(resourceBundle.getString("MES10"));
        jComboBox2.addItem(resourceBundle.getString("MES11"));
        jComboBox2.addItem(resourceBundle.getString("MES12"));
        
        jButton1.setText(resourceBundle.getString("JBUTTON1"));
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String[] args=new String[9];
            boolean llave0=false;
            if(jTextField1.getText().equals(""))
            {
                this.validarJTextField(0, args);
            }else{
                args[0]=jTextField1.getText();
            }
            
            if(jTextField2.getText().equals(""))
            {
                this.validarJTextField(1, args);
            }else{
                args[1]=jTextField2.getText();
            }
            
            if(jTextField3.getText().equals(""))
            {
                this.validarJTextField(2, args);
            }else{
                args[2]=jTextField3.getText();
            }
            
            if(jTextField4.getText().equals(""))
            {
                this.validarJTextField(6, args);
            }else{
                args[6]=jTextField4.getText();
            }
            
            if(jTextField5.getText().equals(""))
            {
                this.validarJTextField(7, args);
            }else{
                args[7]=jTextField5.getText();
            }
            
            if(jTextField5.getText().equals(""))
            {
                this.validarJTextField(7, args);
            }else{
                args[7]=jTextField5.getText();
            }
            
            if(jTextField6.getText().equals(""))
            {
                this.validarJTextField(8, args);
            }else{
                args[8]=jTextField6.getText();
            }
            
            args[3]=jComboBox1.getSelectedItem()+"";
            args[4]=jComboBox2.getSelectedItem()+"";
            args[5]=jComboBox3.getSelectedItem()+"";
            llave0=true;

            if(llave0=true)
            {
                int llave=JOptionPane.showConfirmDialog(this,
                    "Estas seguro que deseas guardar el profesor",
                    "Mensaje de confirmacion",JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE);
                if(llave==0)
                {
                    try{
                        asignaturaControl.crearProfesor(args);

                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");

                        JOptionPane.showMessageDialog(null, "El prefesor se guardo correctamente",
                                "Mensaje de informacion",JOptionPane.INFORMATION_MESSAGE);
                    }catch(NullPointerException ex)
                    {
                        JOptionPane.showMessageDialog(this,
                                "El profesor con el codigo:("+args[7]+") ya existe",
                                "Error al guardar Profesor",JOptionPane.ERROR_MESSAGE);
                    }catch(NumberFormatException ex)
                    {
                        try{
                            asignaturaControl.stringAInt(args[6]);
                        }catch(NumberFormatException ex2)   
                        { 
                            JOptionPane.showMessageDialog(this,
                            "El campo:( Anios de trabajo: "+args[6]+") tiene formato invalido",
                            "Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(RuntimeException ex)
                    {
                        JOptionPane.showMessageDialog(this,"La asignatura con el codigo: ("+args[8]+") no existe",
                                "Error al guardar el profesor",JOptionPane.ERROR_MESSAGE);
                    }
                }else if(llave==2){
                    int llave2=JOptionPane.showConfirmDialog(this,
                            "Desea vaciar los datos de la tabla","Vaciar formulario de Profesor",
                            JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                    if(llave2==0)
                    {
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                    }else if(llave2==2)
                    {

                    }
                }
                llave0=false;
            }
        }catch(RuntimeException ex)
        {
            JOptionPane.showMessageDialog(this,"Llene todos los campos del profesor",
                    "Error al guardar el profesor",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void validarJTextField(int i,String[] args)
    {
        try{
            if(args[i].equals(""))
            {
                 
            }
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("");
        }
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    AsignaturaControl asignaturaControl=new AsignaturaControl();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
