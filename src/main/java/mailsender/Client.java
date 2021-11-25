package mailsender;

import lombok.Getter;
import mailsender.enums.Gender;

@Getter
public class Client {
    private final int clientId;
    private final String name;
    private final int age;
    private final Gender gender;

    protected Client(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clientId = ClientId.getClientId();
    }
}
