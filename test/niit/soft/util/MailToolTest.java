package niit.soft.util;

import niit.soft.domain.Mail;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2018/10/29.
 */
public class MailToolTest {
    @Test
    public void send() throws Exception {
        Mail mail=new Mail();
        mail.setToAddress("3374465619@qq.com");
        mail.setSubject("大宝");
        mail.setMailContent("爱你哦");
        MailTool mailTool=new MailTool();
        mailTool.send(mail);
    }

}