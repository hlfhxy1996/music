package overall.a;

public class Station {
	public String name;
	public int fare;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	Station(String name,int fare){
		this.name=name;
		this.fare=fare;
	}
	public String toString(){
		return name+"まで"+'\t'+fare+"円";
	}
}
