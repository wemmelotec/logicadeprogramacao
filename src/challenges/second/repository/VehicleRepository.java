package challenges.second.repository;
import challenges.second.classes.Automaker;
import challenges.second.classes.Vehicle;

public class VehicleRepository {

     private Vehicle[] bancoDeDadosVehicle = new Vehicle[18];

     public void createBancoDeDados(){
          Automaker automaker = new Automaker("GM");
          Automaker automaker2 = new Automaker("Hyundai");
          Automaker automaker3 = new Automaker("Volkswagen");
          Automaker automaker4 = new Automaker("Audi");
          Automaker automaker5 = new Automaker("Mercedes");
          Automaker automaker6 = new Automaker("Peugeot");
          Vehicle vehicle = new Vehicle(automaker, "Suburban","black",2020);
          Vehicle vehicle2 = new Vehicle(automaker, "Malibu","blue",2015);
          Vehicle vehicle3 = new Vehicle(automaker, "Silverado","white",2010);
          Vehicle vehicle4 = new Vehicle(automaker2,"Azera", "black", 2022);
          Vehicle vehicle5 = new Vehicle(automaker2,"Sonata", "blue", 2022);
          Vehicle vehicle6 = new Vehicle(automaker2,"Veloster", "white", 2022);
          Vehicle vehicle7 = new Vehicle(automaker3,"Golf", "red", 2015);
          Vehicle vehicle8 = new Vehicle(automaker3,"Jetta", "white", 2015);
          Vehicle vehicle9 = new Vehicle(automaker3,"Polo", "blue", 2015);
          Vehicle vehicle10 = new Vehicle(automaker4,"A4", "yellow", 2019);
          Vehicle vehicle11 = new Vehicle(automaker4,"Q7", "white", 2019);
          Vehicle vehicle12 = new Vehicle(automaker4,"R8", "blue", 2019);
          Vehicle vehicle13 = new Vehicle(automaker5,"C 180", "blue", 2010);
          Vehicle vehicle14 = new Vehicle(automaker5,"C 200", "white", 2010);
          Vehicle vehicle15 = new Vehicle(automaker5,"GLA 200", "red", 2010);
          Vehicle vehicle16 = new Vehicle(automaker6,"206", "blue", 2008);
          Vehicle vehicle17 = new Vehicle(automaker6,"206", "yellow", 2008);
          Vehicle vehicle18 = new Vehicle(automaker6,"206", "red", 2008);

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
          bancoDeDadosVehicle[12]=vehicle13;
          bancoDeDadosVehicle[13]=vehicle14;
          bancoDeDadosVehicle[14]=vehicle15;
          bancoDeDadosVehicle[15]=vehicle16;
          bancoDeDadosVehicle[16]=vehicle17;
          bancoDeDadosVehicle[17]=vehicle18;
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
