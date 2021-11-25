package mailsender;

import mailsender.enums.Gender;
import mailsender.enums.MailCode;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {

    @org.junit.jupiter.api.Test
    void sendMail() {
        MailInfo mailInfo = MailInfo.createMailInfo("Arman", 33, Gender.MALE, MailCode.HAPPY_BIRTHDAY);
        String msg = MailSender.sendMail(mailInfo);
        assertEquals("Hello, Arman!\n", msg);
    }
}