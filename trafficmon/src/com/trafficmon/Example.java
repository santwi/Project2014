package com.trafficmon;

/**
 * Created by Shirley on 20/01/14.
 */
public class Example {


        public static void main(String[] args) throws Exception {
            CongestionChargeSystem congestionChargeSystem = new CongestionChargeSystem();

            System.out.println("Vehicle A123 XYZ is entering");

            congestionChargeSystem.vehicleEnteringZone(Vehicle.withRegistration("A123 XYZ"));
            delaySeconds(15);

            System.out.println("Vehicle J091 4PY is entering");

            congestionChargeSystem.vehicleEnteringZone(Vehicle.withRegistration("J091 4PY"));
            delayMinutes(3);

            System.out.println("New vehicle A123 ZZZ is entering");

            congestionChargeSystem.vehicleEnteringZone(Vehicle.withRegistration("A123 ZZZ"));
            delaySeconds(20);

            System.out.println("Vehicle A123 XYZ is leaving");

            congestionChargeSystem.vehicleLeavingZone(Vehicle.withRegistration("A123 XYZ"));
            delayMinutes(2);

            System.out.println("Vehicle J091 4PY is leaving");

            congestionChargeSystem.vehicleLeavingZone(Vehicle.withRegistration("J091 4PY"));

            System.out.println("Vehicle AQ123 ZZZ is leaving");

            congestionChargeSystem.vehicleLeavingZone(Vehicle.withRegistration("A123 ZZZ"));



            congestionChargeSystem.calculateCharges();

        }
        private static void delayMinutes(int mins) throws InterruptedException {
           // delaySeconds(mins * 60);
            delaySeconds(mins * 60);
        }
        private static void delaySeconds(int secs) throws InterruptedException {
          // Thread.sleep(secs * 1000);
            Thread.sleep(secs * 1000);
        }

}
