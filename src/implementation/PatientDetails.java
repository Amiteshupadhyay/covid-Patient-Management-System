package implementation;

public class PatientDetails {
	private String adharId;
	private String name;
	private String state;
	private String city;
	private int pinCode;
	private char status;
	String newline = System.lineSeparator();


	public void setStatus(char status) {
		this.status = status;
	}
	
	PatientDetails(){
		
	}

	PatientDetails(String adhar, String name, String state, String city, int pin, char status) {
		this.adharId = adhar;
		this.state = state;
		this.name = name;
		this.pinCode = pin;
		this.status = status;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Adhar Number: "+ adharId+newline+"Name: "+name +newline+"City: "+ city+newline+"State: "+state+newline+"Status: " +status+newline+"Pin Code: "+ pinCode);
	}

}
