package mailsender;

import lombok.Getter;
import mailsender.enums.Gender;
import mailsender.enums.MailCode;

@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    private MailInfo(Client client, MailCode mailCode){
        this.client = client;
        this.mailCode = mailCode;
    }

    public String getClientName(){
        return getClient().getName();
    }

    public static MailInfo createMailInfo(String clientName, int clientAge, Gender clientGender, MailCode mailCode){
        return new MailInfo(new Client(clientName, clientAge, clientGender), mailCode);
    }

    public static MailInfo createMailInfo(Client client, MailCode mailCode){
        return new MailInfo(client, mailCode);
    }
}
