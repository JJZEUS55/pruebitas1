package Operaciones_BD;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EnvioCorreo {
//mizzicontra   mizzicontact
   final String senderEmailID = "mizzicontact@gmail.com";
final String senderPassword = "mizzicontra";
final String emailSMTPserver = "smtp.gmail.com";
final String emailServerPort = "465";
String receiverEmailID = null;
static String emailSubject = "Test Mail";
static String emailBody = ":)";
public EnvioCorreo(String receiverEmailID, String emailSubject, String emailBody)
    {
    this.receiverEmailID=receiverEmailID;
    this.emailSubject=emailSubject;
    this.emailBody=emailBody;
    String  d_email = senderEmailID,
            d_uname = "Mizzi",
            d_password = senderPassword,
            d_host = "smtp.gmail.com",
            d_port  = "465",
            m_to = receiverEmailID,
            m_subject = "Indoors Readable File: ",
            m_text = "This message is from Indoor Positioning App. Required file(s) are attached.";
    
    Properties props = new Properties();
    props.put("mail.smtp.user",senderEmailID);
    //props.put("mail.smtp.user",d_email);
    props.put("mail.smtp.host", emailSMTPserver);
    props.put("mail.smtp.port", emailServerPort);
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.socketFactory.port", emailServerPort);
    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
    //props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.socketFactory.fallback", "false");
    //props.put("mail.smtp.connectiontimeout", "1000");
    //props.put("mail.smtp.timeout", "1000");
    SecurityManager security = System.getSecurityManager();
    
    try
    {
    Authenticator auth = new SMTPAuthenticator();
    Session session = Session.getInstance(props, auth);
    MimeMessage msg = new MimeMessage(session);
    msg.setText(emailBody);
    msg.setSubject(emailSubject);
    msg.setFrom(new InternetAddress(senderEmailID));
    
    msg.addRecipient(Message.RecipientType.TO,
    new InternetAddress(receiverEmailID));
    Transport transport = session.getTransport("smtps");
    
    transport.connect(d_host, Integer.valueOf(d_port), d_uname, d_password);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
    //Transport.send(msg);
    System.out.println("Message send Successfully:)");
    }
    catch (Exception mex)
    {
    mex.printStackTrace();
    }
}
public class SMTPAuthenticator extends javax.mail.Authenticator
{
public PasswordAuthentication getPasswordAuthentication()
{
return new PasswordAuthentication(senderEmailID, senderPassword);
}
}
    public static void main(String[] args) {
       EnvioCorreo mailSender;
        System.out.println("Operaciones_BD.EnvioCorreo.main()");
        mailSender = new EnvioCorreo("j.j.rs@hotmail.com","Testing Code 2 example","Testing Code Body yess");
        System.out.println("Operaciones_BD.EnvioCorreo.main()");
    }
}