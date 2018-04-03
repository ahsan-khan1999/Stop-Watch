import java.util.Date;
public class StopWatch{
	private double startTime;
	private double endTime;

	public void setstartTime(double startTime){
	
	this.startTime = startTime;
}
		
	public void setendTime(double endTime){
	this.endTime = endTime;
}

	public double getstartTime(){
	return startTime;
}

	public double getendTime(){
	return endTime;
}
	public StopWatch(){} 
	public StopWatch(double startTime , double endTime){
	this.startTime = startTime;
	this.endTime = endTime;

}
	public void start(double currentTime){	
	this.startTime = currentTime;	

}
	public void stop(double currentTime){
	this.endTime =  currentTime; 
}	

	public void elapsedTime(){
	double elspsedTime = (endTime - startTime) / 100;
	System.out.println("Time elcapsd in miliseconds" +elspsedTime);
}
}