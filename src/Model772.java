import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Model772 {

	List<Observer> observers = new ArrayList<>();
	int rdmNum;
	Random r = new Random();
	
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	public void createRdmN() {
		this.rdmNum = r.nextInt(100);
		notifyObserver();
	}

	private void notifyObserver() {
		for (Observer obs: observers) {
			obs.update();
		}
	}

	public int getRdmNum() {
		return rdmNum;
	}

}
