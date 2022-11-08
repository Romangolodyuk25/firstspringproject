package person.romchik.firstspringproject

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CarController() {
    var carService = CarService()

    @GetMapping("/returnCars")
    fun returnCars (): Map<Long, Car> {
        return carService.returnCars()
    }

    @GetMapping("/addCar")
    fun addCars (@RequestParam brand:String,
                 @RequestParam model: String,
                 @RequestParam year: Int,
                 @RequestParam mileage: Long,
                 @RequestParam isNew: Boolean,
                 @RequestParam color: String,
                 @RequestParam volume: Double
    )
    {
        var firstCar = Car()
        firstCar.brand = brand
        firstCar.isNew = isNew
        firstCar.volume = volume
        firstCar.year = year
        firstCar.mileage = mileage
        firstCar.model = model
        firstCar.color = color

        carService.addCar(firstCar)

    }

    @GetMapping("/deleteCar")
    fun deleteCars (@RequestParam id:Long) {
       carService.deleteCar(id)
    }

    @GetMapping("/searchCar")
    fun searchCar (@RequestParam id:Long):Car {
        return carService.searchCar(id)
    }

    @GetMapping("/uppdateCar")
    fun uppdateCar (@RequestParam id:Long,
                    @RequestParam brand:String,
                    @RequestParam model: String,
                    @RequestParam year: Int,
                    @RequestParam mileage: Long,
                    @RequestParam isNew: Boolean,
                    @RequestParam color: String,
                    @RequestParam volume: Double
    )
    {
        var secondCar = Car()
        secondCar.brand = brand
        secondCar.isNew = isNew
        secondCar.volume = volume
        secondCar.year = year
        secondCar.mileage = mileage
        secondCar.model = model
        secondCar.color = color

        carService.update(id,secondCar)
    }

}