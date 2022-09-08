import java.util.Objects;

public class HelloWorld {
 
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloWorld helloWorld = (HelloWorld) o;
        return Objects.equals(message, helloWorld.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}