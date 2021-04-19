package info.novatec

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class RestController {

    @Get("/hello")
    fun hello() = "Hi there!"
}