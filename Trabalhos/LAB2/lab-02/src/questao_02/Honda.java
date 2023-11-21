package questao_02;

import java.util.Objects;

public class Honda implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(String modelo) {
        IVehicle carro = null;
        if(Objects.equals(modelo, "Fit"))carro = new City();
        if(Objects.equals(modelo, "City"))carro = new Civic();
        if(Objects.equals(modelo, "Civic"))carro = new Fit();
        return carro;
    }
}
