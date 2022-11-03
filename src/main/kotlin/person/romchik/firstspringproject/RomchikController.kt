package person.romchik.firstspringproject

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController //АНОТАЦИЯ которая помечает этот класс, как класс , который работает с HTTP запросами(Обрабатывает их)
class RomchikController {
    @GetMapping("/romchik") //Это АНОТАЦИЯ которая регистрирует этот метод что бы он был доступен из HTTP и что бы ФУНКЦИЮ можно было вызвать
    fun returnRomchik():String {
        return "Romchik Pussy"
    }

    @GetMapping("/cherim")
    fun returnCherimLoh():String {
        return "Cherim Lohhh"
    }
}
