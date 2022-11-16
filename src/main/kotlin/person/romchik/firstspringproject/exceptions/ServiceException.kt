package person.romchik.firstspringproject.exceptions

import org.springframework.http.HttpStatus

class ServiceException:RuntimeException {
    var status: HttpStatus? = null

    constructor(status: HttpStatus, message: String) : super(message) {
        this.status = status
    }

    constructor(status: HttpStatus, message: String, exception:Throwable) : super(message, exception) {
        this.status = status
    }
}