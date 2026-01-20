package com.example._3abstractfactorytarea_carros;

import com.example._3abstractfactorytarea_carros.Enum.VehicleType;
import com.example._3abstractfactorytarea_carros.Factory.VehicleFactory;
import com.example._3abstractfactorytarea_carros.Producto.Engine;
import com.example._3abstractfactorytarea_carros.Producto.Vehicle;
import com.example._3abstractfactorytarea_carros.factoryConcrete.ElectricVehicleFactory;
import com.example._3abstractfactorytarea_carros.factoryConcrete.GasVehicleFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example._3abstractfactorytarea_carros.Enum.VehicleType.ELECTRIC;
import static com.example._3abstractfactorytarea_carros.Enum.VehicleType.GAS;


@Slf4j
@SpringBootApplication
public class Application {

    /**
     * !Instrucciones:
     * 1.Completen las Clases de Productos:
     * •	ElectricCar debe implementar Vehicle y mostrar el mensaje "Ensamblando un auto eléctrico".
     * •	GasCar debe implementar Vehicle y mostrar el mensaje "Ensamblando un auto de combustión".
     * •	ElectricEngine debe implementar Engine y mostrar el mensaje "Arrancando motor eléctrico".
     * •	GasEngine debe implementar Engine y mostrar el mensaje "Arrancando motor de combustión".
     * <p>
     * 2.	Completen las Clases de Fábricas:
     * •	ElectricVehicleFactory debe crear un ElectricCar y un ElectricEngine.
     * •	GasVehicleFactory debe crear un GasCar y un GasEngine.
     * <p>
     * 3. Prueben el Código:
     * •	Ejecuten el código para asegurarse de que cada fábrica produce el tipo correcto de vehículo y motor.
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


        log.info("=== crear vehiculo electrico ===");
        VehicleFactory electricFactory = getFactory(ELECTRIC);
        serveMenu(electricFactory);

        log.info("=== crear vehiculo gas ===");
        VehicleFactory gasFactory = getFactory(GAS);
        serveMenu(gasFactory);

    }

    private static void serveMenu(VehicleFactory factory) {
        Vehicle vehicle = factory.createVehicle();
        Engine engine = factory.createEngine();

        vehicle.assemble();
        engine.start();
    }


    static VehicleFactory getFactory(VehicleType type) {
        return switch (type) {
            case ELECTRIC -> new ElectricVehicleFactory();
            case GAS -> new GasVehicleFactory();
        };
    }
}

