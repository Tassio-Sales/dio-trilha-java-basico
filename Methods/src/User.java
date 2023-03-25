public class User {

    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.decreaseVolume();
        smartTV.decreaseVolume();
        smartTV.decreaseVolume();
        smartTV.raiseVolume();
        System.out.println("What is the current volume? " + smartTV.volume);

        System.out.println("What is the current channel? " + smartTV.channel);
        smartTV.changeChannel(13);
        System.out.println("What is the current channel? " + smartTV.channel);

        System.out.println("The TV is on? " + smartTV.on);
        System.out.println("What is the current channel? " + smartTV.channel);
        System.out.println("What is the current volume? " + smartTV.volume);

        smartTV.on();
        System.out.println("The TV is on? " + smartTV.on);
        smartTV.off();
        System.out.println("The TV is on? " + smartTV.on);

    }
}
