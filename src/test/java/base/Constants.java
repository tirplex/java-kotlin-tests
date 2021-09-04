package base;

public final class Constants {

    // if bal not works use https://hub.docker.com/r/gprestes/the-internet/
    public static final String site = "http://localhost:7080";

    private Constants() {
        //this prevents even the native class from calling this ctor as well :
        throw new AssertionError();
    }
}
