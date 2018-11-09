package Common;

public class Customer {

	private String name;

	private String reg;

	private String time;

	private String slot;
	
	Customer(String n,String r,String t,String s){
		setSlot(s);
		setName(n);
		setReg(r);
		setTime(t);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReg() {
		return reg;
	}
	
	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}
	
}
