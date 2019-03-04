package niit.soft.domain;

/**
 * Created by lenovo on 2018/10/29.
 */
public class Mail {
    private String toAddress;
    private String subject;
    private String mailContent;

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public Mail() {

    }

    public Mail(String toAddress, String subject, String mailContent) {
        this.toAddress = toAddress;
        this.subject = subject;
        this.mailContent = mailContent;
    }
}
