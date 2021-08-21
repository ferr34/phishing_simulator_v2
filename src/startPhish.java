import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.*;

// Classi per l'invio della mail 
import javax.mail.*; 
import javax.mail.internet.*;


public class startPhish extends JFrame
{ 
    public static JFrame f; 

    // Costruttore superclasse 
    public startPhish() throws MessagingException
    {
        super("try_phish_me v1.0"); 
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setPreferredSize(new java.awt.Dimension(450,501));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/amo5.jpg")));

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

        title.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        title.setText("Inserire dati della vittima");
        title.setForeground(Color.WHITE);

        email_label.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        email_label.setText("E - mail");
        email_label.setForeground(Color.WHITE);

        object_label.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        object_label.setText("Oggetto");
        object_label.setForeground(Color.WHITE);

        testo_label.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        testo_label.setText("Testo e - mail");
        testo_label.setForeground(Color.WHITE);

        testo_ta.setColumns(20);
        testo_ta.setRows(5);
        jScrollPane2.setViewportView(testo_ta);

        upload_attachments.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        upload_attachments.setText("Carica allegati");
         
        lets_phish_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/insertRight.png")));
        lets_phish_btn.setContentAreaFilled(false);
        lets_phish_btn.setBorderPainted(false);
        lets_phish_btn.setMaximumSize(new java.awt.Dimension(32,32));
        lets_phish_btn.setMinimumSize(new java.awt.Dimension(32,32));

        lets_phish_label.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lets_phish_label.setText("Attacca!");
        lets_phish_label.setForeground(Color.WHITE);

        // Layout code - Inherited from NetBeans 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(testo_label, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(object_label)
                            .addComponent(email_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obj_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lets_phish_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lets_phish_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(upload_attachments)
                        .addGap(146, 146, 146))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upload_attachments, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lets_phish_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lets_phish_label)
                        .addGap(10, 10, 10)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();

        lets_phish_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Invia l'email per l'attacco 
                System.out.println("Pulsante premuto!");
                try
                {
                    // Impostazione dati dell'attacco 
                    boolean debug = false; 

                    // Impostazioni SMTP
                    Properties props = new Properties();
                    props.put("mail.smtp.host","smtp.gmail.com");
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.auth", "true"); 

                    // Istanzio un oggetto in Session 
                    Session session = Session.getDefaultInstance(props,   new javax.mail.Authenticator() {  
                        protected PasswordAuthentication getPasswordAuthentication() {  
                        return new PasswordAuthentication("segreteriastudenti.test@gmail.com","Segreteria44!");  
                        }  
                       });
                    session.setDebug(debug);

                    // Creo l'oggetto Message partendo da session 
                    Message msg = new MimeMessage(session);

                    // Definisco il mittente 
                    InternetAddress email_mitt = new InternetAddress("Segreteria_Studenti");
                    msg.setFrom(email_mitt);

                    // Definisco il destinatario 
                    InternetAddress email_dest = new InternetAddress(email_tf.getText().toString()); 
                    msg.setRecipient(Message.RecipientType.TO, email_dest);

                    // Definisco header aggiuntivi
                    String oggettoEmail = obj_tf.getText().toString();
        
                    if(oggettoEmail != null)
                         {
                            msg.setSubject(oggettoEmail);
                         }
                        else 
                        {
                            // Intestazione per frode di base 
                            msg.setSubject("Pericolo intrusione nel tuo account del Politecnico");
                        }
        

                        // Definisco il messaggio da inviare e setto il contenuto -> controllo che non sia vuoto, solo per test 
        
                        String daInviare = " ";

                    if(testo_ta.getText().toString() != null)
                        {
                            daInviare = testo_ta.getText().toString();
                        }
                        else 
                        {     
                            daInviare = "Gentile studente/studentessa, \n è stata rilevata una fuga di password, per cortesia reinserisci le ultime credenziali a questo link: \n\n" +
                                "Se hai problemi non esitare a contattarci. \n Cordiali saluti, la Segreteria Studenti"; 
                        }

        
                        msg.setContent(daInviare, "text/plain");

                        // Invio del messaggio 
                        Transport.send(msg); 
                        
                        // Message box per indicare che è stato correttamente inviato il messaggio + blank tf per ricominciare 
                        
                }
                catch(AddressException e1)
                {
                    System.out.println("Address exception rilevata\n");
                    e1.printStackTrace(); 
                }
                catch(MessagingException e2)
                {
                    System.out.println("MessagingException rilevata \n");
                    e2.printStackTrace();
                }

      


            }
        });
        
    }


}
