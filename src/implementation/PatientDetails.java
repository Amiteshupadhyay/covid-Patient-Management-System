package implementation;

public class PatientDetails {
	private String adharId;
	private String name;
	private String state;
	private String city;
	private int pinCode;
	private char status;
	

	public String getAdharId() {
		return adharId;
	}

	public void setAdharId(String adharId) {
		this.adharId = adharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	
	PatientDetails(String adhar,String name,String state,String city,int pin,char status){
		this.adharId = adhar;
		this.state = state;
		this.name = name;
		this.pinCode = pin;
		this.status = status;
		this.city = city;
	}
	
    @Override
    public String toString() { 
        return String.format(name +" " + adharId+" "+city+" "+status); 
    }

}
