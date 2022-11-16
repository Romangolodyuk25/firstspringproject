package person.romchik.firstspringproject

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstspringprojectApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun testForMySelf () {
		var carService = CarService()
		var firstCar = Car()

		firstCar.brand = "Lada"
		firstCar.year = 2007
		firstCar.color = "black"

		var secondCar = Car()

		secondCar.brand = "BMW"
		secondCar.year = 2010

		var threeCar = Car()

		threeCar.brand = "Mercedes"
		threeCar.year = 2017
		threeCar.color = "White"
		threeCar.isNew = true

		var fourCar = Car()

		fourCar.brand = "Mitsubishi"
		fourCar.color = "Red"
		fourCar.year = 2005
		fourCar.volume = 1.7

		var fiveCar = Car()
		fiveCar.brand = "Mazda"
		fiveCar.year = 1999
		fiveCar.color = "Yellow"
		fiveCar.isNew = false


		carService.addCar(secondCar)
		carService.addCar(firstCar)
		carService.addCar(threeCar)
		carService.addCar(fourCar)

		carService.searchCar(1)
		carService.update(1, fiveCar)
		carService.update(2, firstCar)
		carService.deleteCar(1)

		var result = carService.returnCars()

		for ((key, value) in result) {
			println(key.toString() + " " + value.brand + " " + value.year + " " + value.color + " " + value.isNew + " " + value.mileage + " " + value.model + " " + value.volume)
		}
	}
}
