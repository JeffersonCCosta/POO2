package questao_02;

public class Singleton {

    private static IVehicleMaker honda;
    private static IVehicleMaker toyota;

    public static IVehicleMaker getInstance(String tipo){

        if(tipo.equals("honda")){
            if(honda == null)
                honda = new Honda();
            return honda;
        }
        else {
            if(toyota == null)
                toyota = new Toyota();
            return toyota;
        }
    }
}
