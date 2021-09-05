package base;

public final class Constants {
  // if the-internet site does not work use https://hub.docker.com/r/gprestes/the-internet/
  // public static final String site = "http://localhost:7080";
  public static final String site = "https://the-internet.herokuapp.com/";

  private Constants() {
    //this prevents even the native class from calling this ctor as well :
    throw new AssertionError();
  }
}
