import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class startPhish extends JFrame
{ 
    public static JFrame f; 

    // Costruttore superclasse 
    public startPhish()
    {
        super("try_phish_me v 1.0"); 
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tpm_logo.jpg")));

        // Prendo il container 
        Container c = this.getContentPane(); 
        c.setBackground(new Color(1,81,150));

        // Dichiarazione variabili -> interfaccia grafica realizzata con NetBeans 
        javax.swing.JLabel email_label;
        javax.swing.JTextField email_tf;
        javax.swing.JScrollPane jScrollPane1;
        javax.swing.JScrollPane jScrollPane2;
        javax.swing.JTable jTable1;
        javax.swing.JButton lets_phish_btn;
        javax.swing.JLabel lets_phish_label;
        javax.swing.JTextField obj_tf;
        javax.swing.JLabel object_label;
        javax.swing.JLabel testo_label;
        javax.swing.JTextArea testo_ta;
        javax.swing.JLabel title;
        javax.swing.JButton upload_attachments;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        object_label = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        obj_tf = new javax.swing.JTextField();
        testo_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        testo_ta = new javax.swing.JTextArea();
        upload_attachments = new javax.swing.JButton();
        lets_phish_btn = new javax.swing.JButton();
        lets_phish_label = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        // Label & buttons
        setPreferredSize(new java.awt.Dimension(450, 501));

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Inserire dati della vittima");
        title.setForeground(Color.WHITE);

        email_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_label.setText("E - mail");
        email_label.setForeground(Color.WHITE);

        object_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        object_label.setText("Oggetto");
        object_label.setForeground(Color.WHITE);

        testo_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        testo_label.setText("Testo e - mail");
        testo_label.setForeground(Color.WHITE);

        testo_ta.setColumns(20);
        testo_ta.setRows(5);
        jScrollPane2.setViewportView(testo_ta);

        upload_attachments.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        upload_attachments.setText("Carica allegati ");
         
        lets_phish_btn.setText("amo");

        lets_phish_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lets_phish_label.setText("lets_phish");
        lets_phish_label.setForeground(Color.WHITE);

        // Layout code - Inherited from NetBeans 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(testo_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(object_label))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(title))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(obj_tf))))
                    .addComponent(jScrollPane2))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lets_phish_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lets_phish_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(upload_attachments)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(object_label)
                    .addComponent(obj_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(testo_label)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(upload_attachments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lets_phish_btn)
                    .addComponent(lets_phish_label))
                .addGap(17, 17, 17))
        );

        pack();


    }
}
