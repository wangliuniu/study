package niit.soft.util;
        import java.util.Date;
        import java.util.Properties;
        import javax.mail.Message;
        import javax.mail.Session;
        import javax.mail.Transport;
        import javax.mail.internet.InternetAddress;
        import javax.mail.internet.MimeMessage;
        import com.sun.mail.util.MailSSLSocketFactory;
        import niit.soft.domain.Mail;


/**
 * Created by ASUS on 2018/10/29.
 */
public class MailTool {
    public void send(Mail mail) {
        try {
// 获得属性并生成Session对象
            Properties props = new Properties();
            Session sendsession;
            Transport transport;
//开启Debug调试
            props.setProperty("mail.debug", "true");
// 向属性中写入SMTP服务器的主机
            props.put("mail.smtp.host", "smtp.qq.com");
// 设置SMTP服务器需要权限认认证
            props.put("mail.smtp.auth", "true");
//发送邮件协议名称
            props.setProperty("mail.transport.protocol", "smtp");
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
// or
// sf.setTrustedHosts(new String[] { "my-server" });
            props.put("mail.smtp.ssl.enable", "true");
// also use following for additional safety
//props.put("mail.smtp.ssl.checkserveridentity", "true");
            props.put("mail.smtp.ssl.socketFactory", sf);

            sendsession = Session.getInstance(props, null);
// 设置输出调试信息
            sendsession.setDebug(true);
// 根据Session生成Message对象
            Message message = new MimeMessage(sendsession);
// 设置发信人地址
            message.setFrom(new InternetAddress("3374465619@qq.com"));
// 设置收信人地址
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(
                    mail.getToAddress()));
// 设置e-mail标题
            message.setSubject(mail.getSubject());
// 设置e-mail发送时间
            message.setSentDate(new Date());
// 设置e-mail内容
            message.setText(mail.getMailContent());
// 保存对于Email的修改
            message.saveChanges();
// 根据Session生成Transport对象
            transport = sendsession.getTransport("smtp");
// 连接到SMTP服务器
            transport.connect("smtp.qq.com", "3374465619@qq.com",
                    "kaerjomrbasmchfh");// !!!!!******注意修改************
            //发送e-mail
            transport.sendMessage(message, message.getAllRecipients());
// 关闭Transport连接
            transport.close();
            System.out.println("邮件发送成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("邮件发送失败！");
        }
    }


}




