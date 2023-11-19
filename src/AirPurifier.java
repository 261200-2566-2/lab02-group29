import  java.util.Scanner;
public class AirPurifier {
    private String model;
    private String serialNo;
    private int fanSpeed;
    private int airQuality;
    private boolean power;

    private static int totalAirPurifiers = 0;

    public AirPurifier(String model,String serialNo){
        this.model = model;
        this.serialNo = serialNo;
        this.power = false;
        this.fanSpeed = 0;
        this.airQuality = 0;
        totalAirPurifiers++;

    }
    public void turnOn(){
        this.power = true;
        System.out.println("Air Purifier : ON ");
    }

    public void turnOff(){
        this.power = false;
        System.out.println("Air Purifier : OFF ");
    }

    public void setFanSpeed(int speed){
        if(speed >=1 && speed <=3 ){
            this.fanSpeed =speed;
            System.out.println("Fan speed set to " + speed);
        }else {
            System.out.println("Please choose a speed between 1 - 3");

        }
    }
    public int checkAirQuality(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Air Quality check.Enter a value between 0-200 : ");
        int userInputAqi = scanner.nextInt();

        if(userInputAqi >=0 && userInputAqi<=25){
            this.airQuality = userInputAqi;
            System.out.println("Air quality checked. Current is Excellent ");
        }else if(userInputAqi >=26 && userInputAqi<=50){
            System.out.println("Air quality checked. Current is Satisfactory ");
        } else if (userInputAqi >=51 && userInputAqi<=100) {
            System.out.println("Air quality checked. Current is Moderate ");
        } else if (userInputAqi >=101 && userInputAqi<=200) {
            System.out.println("Air quality checked. Current is Unhealthy ");
        } else if (userInputAqi >=201 ) {
            System.out.println("Air quality checked. Current is Very Unhealthy ");
        }else{
            System.out.println("Invalid input.");
        }
        return this.airQuality;

        //http://air4thai.pcd.go.th/webV2/aqi_info.php
    }
    public static int getTotalAirPurifiers(){
        return totalAirPurifiers;
    }
    public String getModel(){
        return this.model;
    }
}

//https://github.com/syssi/xiaomi_airpurifier


