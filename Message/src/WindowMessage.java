public class WindowMessage extends Message{

    @Override
    public String getMessage() {
        return "This is class " + this.getClass().getName();
    }
}
