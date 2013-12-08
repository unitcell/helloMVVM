package fiddle;

import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.Command;
public class HelloViewModel {
  private String message;
  public String getMessage() {
    return message;
  }
  
  @Command() @NotifyChange("message")
  public void showHello() {
    message = "Hello World";
  }
}
