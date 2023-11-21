package questao_02;

public class Main {

    public static void main(String[] args) {

        IVehicleMaker criaHonda = Singleton.getInstance("honda");

        IVehicleMaker criaToyota = Singleton.getInstance("toyota");

        IVehicle honda,toyota;
        honda = criaHonda.makeVehicle("Fit");
        toyota = criaToyota.makeVehicle("Yaris");
        honda.start();
        honda.drive();
        honda.stop();
        toyota.start();
        toyota.drive();
        toyota.stop();

        if(honda == null || toyota == null){
            System.out.println("Erro");
        }
        else {
            System.out.println("Tudo ok");
        }
    }
}
