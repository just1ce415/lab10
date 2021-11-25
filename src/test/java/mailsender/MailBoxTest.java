package mailsender;

import mailsender.enums.Gender;
import mailsender.enums.MailCode;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.PrinterMakeAndModel;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {

    @Test
    void mailBoxIsEmpty() {
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(MailInfo.createMailInfo("Arman", 33, Gender.MALE, MailCode.GREETINGS));
        mailBox.addMailInfo(MailInfo.createMailInfo("Barbara", 33, Gender.FEMALE, MailCode.HAPPY_BIRTHDAY));
        assertFalse(mailBox.mailBoxIsEmpty());
        mailBox.sendAll();
        assertTrue(mailBox.mailBoxIsEmpty());
    }
}