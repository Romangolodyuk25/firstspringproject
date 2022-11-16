package person.romchik.firstspringproject.exceptions

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import person.romchik.firstspringproject.dtos.ErrorMessage
import javax.servlet.http.HttpServletResponse

@ControllerAdvice
class ServiceExceptionsHandler {
    /**
     * Метод который отлавливает исключение ServiceException Где угодно и возвращает в ответ на HTTP запрос Error Message
     */
    @ExceptionHandler
    fun handleServiceExceptions(serviceException: ServiceException, response: HttpServletResponse) {
        response.status = serviceException.status!!.value()
    }
}