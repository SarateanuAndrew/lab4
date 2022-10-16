import model.*;
import model.baterry_company.Lizard;
import model.baterry_company.UltraEnergy;
import model.motor_company.DGS;
import model.motor_company.DivineMotors;
import model.weels_companies.GoodYear;
import model.weels_companies.Micheline;
import model.weels_companies.micheline_subdivision.Marks;
import service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Random random = new Random();

        List<Battery> batteryList= new ArrayList<>(List.of(
                new Lizard("Lizard", 23.5, "Battery A", 12.4, true, 100, true),
                new UltraEnergy("Energy", 53.2,"Battery B", 22.6, true, 150, true),
                new Battery("Ultra", 33.4,"Battery C", 14.7, false)
                ));

        List<Light> lightList = new ArrayList<>(List.of(
                new Light("White", 23, ColorOfLight.WHITE, 3000),
                new Light("Yellow", 43,ColorOfLight.YELLOW, 5000),
                new Light("Green", 45, ColorOfLight.WHITE, 2000)
        ));

        List<Motor> motorList = new ArrayList<>(List.of(
                new DGS("DGS Ultra", 340, new TypeOfMotor("SasTrik", 140,"Motor A", 4), 1.8, 89, "Titian"),
                new DivineMotors("DivineMotors Has", 440, new TypeOfMotor("BattleStr", 160,"Motor B", 6), 2.0, "B9", true),
                new Motor("RealCruck", 440,new TypeOfMotor("SuperSlim", 200,"Motor C", 8), 4.0)
        ));

        List<Person> personList = new ArrayList<>(List.of(
            new Person("093423", 45,"Vasile", "Bas"),
            new Person("056233", 45,"Nicu", "Grigorescu"),
            new Person("094523", 45,"Florin", "Degea")
        ));

        List<Wheels> wheelsList = new ArrayList<>(List.of(
               new GoodYear("GoodYear", 145,"Micheline", 5, 2, 345, "Box"),
               new Micheline("Micheline", 85,"Destroy", 5, 3, 1, 434),
               new Marks("Marks", 93,"Suzu", 6, 2, 2, 342, "Motocicles")
        ));

        List<TypeOfCar> typeOfCars = new ArrayList<>(List.of(
                new TypeOfCar("Car A", 560,"Cupe"),
                new TypeOfCar("Car B", 450,"Sedan"),
                new TypeOfCar("Car C", 900,"Cabriolet")
        ));

        List<TypeOfFuel> typeOfFuels = new ArrayList<>(List.of(
                new TypeOfFuel("1", 20,"Diesel"),
                new TypeOfFuel("2", 17,"Gasoline"),
                new TypeOfFuel("3", 23,"LGP")
        ));

        List<TypeOfGearBox> typeOfGearBoxes = new ArrayList<>(List.of(
                new TypeOfGearBox("Mechanic", 45,true),
                new TypeOfGearBox("Auto", 45,false),
                new TypeOfGearBox("Robotic", 45,false)
        ));

        carService.addCar(new Cars(
                "Mercedes",
                "CMD213",
                wheelsList.get(random.nextInt(wheelsList.size()-1)),
                motorList.get(random.nextInt(motorList.size()-1)),
                typeOfCars.get(random.nextInt(typeOfCars.size()-1)),
                batteryList.get(random.nextInt(batteryList.size()-1)),
                typeOfGearBoxes.get(random.nextInt(typeOfCars.size()-1)),
                typeOfFuels.get(random.nextInt(typeOfFuels.size()-1)),
                List.of(personList.get(random.nextInt(personList.size()-1))),
                lightList.get(random.nextInt(lightList.size()-1)),
                12000,
                240,
                2000
                ));

        carService.addCar(new Cars(
                "AUDI",
                "CMD214",
                wheelsList.get(random.nextInt(wheelsList.size()-1)),
                motorList.get(random.nextInt(motorList.size()-1)),
                typeOfCars.get(random.nextInt(typeOfCars.size()-1)),
                batteryList.get(random.nextInt(batteryList.size()-1)),
                typeOfGearBoxes.get(random.nextInt(typeOfCars.size()-1)),
                typeOfFuels.get(random.nextInt(typeOfFuels.size()-1)),
                List.of(personList.get(random.nextInt(personList.size()-1))),
                lightList.get(random.nextInt(lightList.size()-1)),
                6500,
                160,
                1500
        ));

        carService.showCars();

    }
}