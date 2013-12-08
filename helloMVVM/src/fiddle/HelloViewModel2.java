package fiddle;

import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.Command;

public class HelloViewModel2 {
	private String message=null;
	
	public String getMessage() {
		return this.message;
	}
	
	@Command @NotifyChange("message")
	public void showHello() {
		this.message = "Hello World!";
	}
	
	@Command @NotifyChange("message")
	public void hideHello() {
		this.message = null;
		//ctx.getTriggerEvent().stopPropagation();
	}
}
