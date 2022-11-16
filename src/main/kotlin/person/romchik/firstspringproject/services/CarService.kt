package person.romchik.firstspringproject.services

import org.springframework.http.HttpStatus
import person.romchik.firstspringproject.exceptions.ServiceException
import person.romchik.firstspringproject.models.Car

//@Service // Помечает класс, как сервисный класс, который можно использовать в этой программе, todo: Раскомментировать
class CarService {
    var cars = HashMap<Long, Car>()
    var idCars = 0L

    /**
     * Возвращает MAP Со всеми Машинами и их Id
     */
    fun returnCars(): Map<Long, Car> {
        return cars
    }

    /**
     * Метод который Добавляет Машину в MAP и добавляет ей Id по счетчику, Передает параметр Car со всеми свойствами
     */
    fun addCar(car: Car) {
        cars.put(idCars,car)
        idCars++
    }

    /**
     * Метод который УДАЛЯЕТ машину по параметру Id из MAP
     */
    fun deleteCar(id: Long) {
        cars.remove(id)
    }

    /**
     * Метод который Находит Машину в MAP по парметру Id
     */
    fun searchCar(id: Long): Car {
        if (cars.contains(id)==false){
            throw ServiceException(HttpStatus.NOT_FOUND,"Car with this id does not exist")
        }
        return cars.get(id)!!
    }

    /**
     * Метод который Находит по Id Машину в MAP и Изменяет ее на другую Машину
     */
    fun update(id:Long, car: Car) {
        cars.get(id)!!.brand = car.brand
        cars.get(id)!!.year = car.year
        cars.get(id)!!.color = car.color
        cars.get(id)!!.model = car.model
        cars.get(id)!!.isNew = car.isNew
        cars.get(id)!!.volume = car.volume
        cars.get(id)!!.mileage = car.mileage
    }

}