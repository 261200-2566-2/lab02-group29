public class Lab02 {
   public static void main(String[] args){
       AirPurifier purifier1 = new AirPurifier("Model Y","001");
       AirPurifier purifier2 = new AirPurifier("Model Z","002");

       System.out.println("Model : " + purifier1.getModel());
       purifier1.turnOn();
       purifier1.setFanSpeed(3);
       purifier1.checkAirQuality();
       purifier1.turnOff();

       System.out.println("-----------------------------------------------------------------");

       System.out.println("Model : " + purifier2.getModel());
       purifier2.turnOn();
       purifier2.setFanSpeed(2);
       purifier2.checkAirQuality();
       purifier2.turnOff();

       System.out.println("-----------------------------------------------------------------");

       System.out.println("Total Air Purifiers: "+AirPurifier.getTotalAirPurifiers());

   }


}
