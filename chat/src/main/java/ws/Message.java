package ws;

public class Message {

    private String msg;
    private String name;

    public Message() {
    }

    public Message(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public void setName(String name) {
        this.name = name;
    }
}