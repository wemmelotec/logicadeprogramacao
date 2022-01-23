package challenges.second.repository;
import challenges.second.classes.Automaker;
import challenges.second.classes.Vehicle;

public class VehicleRepository {

     private Vehicle[] bancoDeDadosVehicle = new Vehicle[12];

     public void createBancoDeDados(){
          Automaker automaker = new Automaker("GM");
          Automaker automaker2 = new Automaker("Hyundai");
          Automaker automaker3 = new Automaker("Volkswagen");
          Automaker automaker4 = new Automaker("Audi");
          Automaker automaker5 = new Automaker("Mercedes");
          Automaker automaker6 = new Automaker("Peugeot");
          Vehicle vehicle = new Vehicle(automaker, "Suburban","back",2020);
          Vehicle vehicle2 = new Vehicle(automaker, "Suburban","back",2020);
          Vehicle vehicle3 = new Vehicle(automaker, "Suburban","back",2020);
          Vehicle vehicle4 = new Vehicle(automaker2,"Azera", "blue", 2022);
          Vehicle vehicle5 = new Vehicle(automaker2,"Azera", "blue", 2022);
          Vehicle vehicle6 = new Vehicle(automaker2,"Azera", "blue", 2022);
          Vehicle vehicle7 = new Vehicle(automaker3,"Golf", "red", 2015);
          Vehicle vehicle8 = new Vehicle(automaker4,"A4", "yellow", 2019);
          Vehicle vehicle9 = new Vehicle(automaker5,"C 180", "white", 2010);
          Vehicle vehicle10 = new Vehicle(automaker6,"206", "red", 2008);
          Vehicle vehicle11 = new Vehicle(automaker6,"206", "red", 2008);
          Vehicle vehicle12 = new Vehicle(automaker6,"206", "red", 2008);

          bancoDeDadosVehicle[0]=vehicle;
          bancoDeDadosVehicle[1]=vehicle2;
          bancoDeDadosVehicle[2]=vehicle3;
          bancoDeDadosVehicle[3]=vehicle4;
          bancoDeDadosVehicle[4]=vehicle5;
          bancoDeDadosVehicle[5]=vehicle6;
          bancoDeDadosVehicle[6]=vehicle7;
          bancoDeDadosVehicle[7]=vehicle8;
          bancoDeDadosVehicle[8]=vehicle9;
          bancoDeDadosVehicle[9]=vehicle10;
          bancoDeDadosVehicle[10]=vehicle11;
          bancoDeDadosVehicle[11]=vehicle12;
     }

     public VehicleRepository() {
          createBancoDeDados();
     }

     public Vehicle[] getBancoDeDadosVehicle() {
          return bancoDeDadosVehicle;
     }

     public void setBancoDeDadosVehicle(Vehicle[] bancoDeDadosVehicle) {
          this.bancoDeDadosVehicle = bancoDeDadosVehicle;
     }
}
