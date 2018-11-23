
public class TV {
	int channel=1;
	int volume=1;
	boolean on=false;
	int maxChannel=1;
	int maxVolume=1;
	
	//GETS
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isOn() {
		return on;
	}
	public int getMaxChannel() {
		return maxChannel;
	}
	public int getMaxVolume() {
		return maxVolume;
	}
	
	//SETS
	
	public void setChannel(int someChannel) {
		if (on=true && someChannel>=1 && someChannel<=maxChannel) {
			channel=someChannel;
		}
		
	}
	public void setVolume(int someVolume) {
		if (on=true && someVolume>=1 && someVolume<=maxVolume) {
			volume=someVolume;
	}}
	
	public void setMaxChannel(int maxC) {
		maxC=maxChannel;
	}
	public void setMaxVolume(int maxV) {
		maxV=maxVolume;		
	}
	
	

	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
	}
	
	
	
	
	
	public void channelUp() {
		if (on=true) {
			channel=channel+1;
			if (channel==maxChannel) {
				channel=1;
			}
		}
	}
	
	public void channelDown() {
		if (on=true) {
			channel=channel-1;
			if(channel==0) {
				channel=maxChannel;
			}
		}
	}
	
	
	
	
	public void volumeUp() {
		if (on=true && volume<maxVolume) {
			volume=volume+1;
		}
	}
	public void volumeDown() {
		if(on=true && volume>0) {
			volume=maxVolume;
		}
	}
	}

