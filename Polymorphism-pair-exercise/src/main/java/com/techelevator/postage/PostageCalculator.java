package com.techelevator.postage;

import com.techelevator.toll.Vehicle;

import java.text.NumberFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PostageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the weight of the package? ");
        double inputWeight = Double.parseDouble(scanner.nextLine());
        System.out.print("(P)ounds or (O)unces? ");
        String units = scanner.nextLine();
        System.out.print("What distance will it be traveling? ");
        int distance = Integer.parseInt(scanner.nextLine());

        double weight = 0;
        if (units.equalsIgnoreCase("O")) {
            weight = inputWeight;
        } else if (units.equalsIgnoreCase("P")) {
            weight = inputWeight * 16;
        }

        List<DeliveryDriver> drivers = new ArrayList<>();
        PostalService1 ps1 = new PostalService1();
        PostalService2 ps2 = new PostalService2();
        PostalService3 ps3 = new PostalService3();
        FexEd fexed = new FexEd();
        Spu2DayBusiness spu2Day = new Spu2DayBusiness();
        Spu4DayGround spu4Day = new Spu4DayGround();
        SpuNextDay spuNextDay = new SpuNextDay();

        drivers.add(ps1);
        drivers.add(ps2);
        drivers.add(ps3);
        drivers.add(fexed);
        drivers.add(spu4Day);
        drivers.add(spu2Day);
        drivers.add(spuNextDay);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.printf("%-30s %-7s", "Delivery Method", "$ cost\n");
        System.out.println("_______________________________________");

        for (DeliveryDriver driver : drivers) {

            String driverOutput = "";
            if (driver == ps1) {
                driverOutput = "Postal Service (1st Class)";
            } else if (driver == ps2) {
                driverOutput = "Postal Service (2nd Class)";
            } else if (driver == ps3) {
                driverOutput = "Postal Service (3rd Class)";
            } else if (driver == fexed) {
                driverOutput = "FexEd";
            } else if (driver == spu4Day) {
                driverOutput = "SPU (4-Day Ground)";
            } else if (driver == spu2Day) {
                driverOutput = "SPU (2-Day Business)";
            } else if (driver == spuNextDay) {
                driverOutput = "SPU (Next Day)";
            }

            System.out.printf("%-30s %-7s %n", driverOutput, currency.format(driver.calculateRate(distance, weight)));

        }

    }
}


