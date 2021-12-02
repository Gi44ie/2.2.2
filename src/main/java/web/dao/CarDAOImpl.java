package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Oka", "Semen", 1888));
        carList.add(new Car("Kelevim", "Shlomo", 1997));
        carList.add(new Car("UAZ", "Richard", 2002));
        carList.add(new Car("Nasher", "Uriel", 2001));
        carList.add(new Car("Tagundnachtsgleiche", "Paul Röder", 1945));
    }

    @Override
    public List<Car> getCars(int number) {
        if( number > 5) {
            return carList;
        }
        return carList.subList(0, number);
    }
}
