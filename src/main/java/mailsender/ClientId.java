package mailsender;

public class ClientId {
    private static int clientId = -1;
    public static int getClientId(){
        clientId++;
        return clientId;
    }
}
