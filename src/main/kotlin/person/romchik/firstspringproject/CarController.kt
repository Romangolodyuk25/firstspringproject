package person.romchik.firstspringproject

import org.springframework.web.bind.annotation.*

@RestController
class CarController() {
    var carService = CarService()

    @GetMapping("/cars")
    fun returnCars (): Map<Long, Car> {
        return carService.returnCars()
    }

    @PostMapping("/cars")
    fun addCars (@RequestBody car: Car) {
        carService.addCar(car)
    }

    @DeleteMapping("/cars/{id}")
    fun deleteCars (@PathVariable id:Long) {
       carService.deleteCar(id)
    }

    @GetMapping("/cars/{id}")
    fun searchCar (@PathVariable id:Long):Car {
        return carService.searchCar(id)
    }

    @PutMapping("/cars/{id}")
    fun uppdateCar (@PathVariable id: Long,
                    @RequestBody car: Car) {
        carService.update(id,car)
    }

}