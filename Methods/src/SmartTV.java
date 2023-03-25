public class SmartTV {

    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void on() {
        on = true;
    }
    public void off() {
        on = false;
    }
    public void raiseVolume() {
        volume++;
        System.out.println("Increasing the volume to: " + volume);
    }
    public void decreaseVolume() {
        volume--;
        System.out.println("Decreasing the volume to: " + volume);
    }
    public void raiseChannel() {
        channel++;
    } public void decreaseChannel() {
        channel--;
    }
    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}
