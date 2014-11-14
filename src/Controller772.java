
public class Controller772 {

	Model772 m;
	View772 v;
	
	Controller772(Model772 m) {
		
		this.m = m;
		this.v = new View772(m, this);
		
	}

	public void createRdmNum() {
		m.createRdmN();
	}
}
