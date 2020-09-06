package project.bookietalkie_renew.api.v1

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HealthCheckController {

    @GetMapping("/api/v1/healthcheck")
    fun ping(): ResponseEntity<String> = ResponseEntity.ok("pong")

}
