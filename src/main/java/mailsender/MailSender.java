package mailsender;

public class MailSender {
    public static String sendMail(MailInfo mailInfo){
        String clientName = mailInfo.getClientName();
        String message = "Hello, " + clientName + "!\n" + mailInfo.getMailCode().generateText();
        send(message);
        return message;
    }

    private static void send(String message){

    }

}
