
package Codes;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class mailsend {
    private static String id;
    private static String name;
    private static String units;
    private static String amount;
    private static String date;
    
    public mailsend(String id1, String name1, String units1, String amount1, String date1){
        id = id1;
        name = name1;
        units = units1;
        amount = amount1;
        date = date1;
    }

    public static void sendMail(String recepient) {
        System.out.println("Preparing to send Email......");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "25");

        String uname = "smartelectricitybilling00@gmail.com";
        String pass = "sliit12345";

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname, pass);
            }
        });
        
        Message message=prepareMessage(session,uname,recepient,id,name,units,amount,date);
        try {
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Email Send Successfully to" + recepient);
    }

    private static Message prepareMessage(Session session, String uname, String recepient, String id, String name, String units, String amount, String date) {
        Message message=new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(uname));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Monthly Electricity Bill");
            String t1 = "Dear Sir/Madam,";
            String t2 = "\nHere is your Monthly Electricity Bill.";
            String t3 = "\nCustomer ID      :"+id;
            String t4 = "\nCustomer Name    :"+name;
            String t5 = "\nUnits            :"+units;
            String t6 = "\nBill Amount      :Rs."+amount;
            String t7 = "\nIssue Date       :"+date;
            String t8 = "\nHave a nice day! \nThank You.";
            
            message.setText(t1+t2+t3+t4+t5+t6+t7+t8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

}
