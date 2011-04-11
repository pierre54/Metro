package metro;


public class Trajet {

	private Station dep;
	private Station arr;
	
	public Trajet (Station dep , Station arr ) {
		this.dep = dep;
		this.arr = arr;
	}

	public Station getDep() {
		return dep;
	}

	public void setDep(Station dep) {
		this.dep = dep;
	}

	public Station getArr() {
		return arr;
	}

	public void setArr(Station arr) {
		this.arr = arr;
	}
}
