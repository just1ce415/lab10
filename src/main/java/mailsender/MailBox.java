package mailsender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }

    public void sendAll(){
        int i = 0;
        while (i < infos.size()){
            MailSender.sendMail(infos.get(i));
            infos.remove(infos.get(i));
        }
    }

    public boolean mailBoxIsEmpty(){
        return infos.isEmpty();
    }
}
