package metro;


public class Troncon{
	
	private int num;
	private Station depart;
	private Station arrive; 
	private int duree;
	private boolean incident;
	
	public Troncon(int num, Station depart, Station arrive, int duree) {
		this.num = num;
		this.depart = depart; 
		this.arrive = arrive;
		this.duree = duree;
		this.incident = false;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Station getDepart() {
		return depart;
	}

	public void setDepart(Station depart) {
		this.depart = depart;
	}

	public Station getArrive() {
		return arrive;
	}

	public void setArrive(Station arrive) {
		this.arrive = arrive;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void setIncident(boolean incident){
		this.incident=incident;
	}
	
	public boolean isIncident() {
		return (depart.isIncident() || arrive.isIncident());
	}

	public boolean isIncidenttroncon() {
		return this.isIncident();
	}

}
