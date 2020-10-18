package model;

public class Busdetails {
	
	private String busType;
	private String busDestination;
	private float busTiming;
	
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public float getBusTiming() {
		return busTiming;
	}
	public void setBusTiming(float busTiming) {
		this.busTiming = busTiming;
	}
	@Override
	public String toString() {
		return "Busdetails [busType=" + busType + ", busDestination="
				+ busDestination + ", busTiming=" + busTiming + "]";
	}

	

}

