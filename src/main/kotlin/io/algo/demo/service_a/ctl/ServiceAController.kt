package io.algo.demo.service_a.ctl

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ServiceAController {

    @Value("\${service.a.message}")
    private lateinit var message: String

    @GetMapping("/a/message")
    fun getMessage() : ResponseEntity<String> {
        return ResponseEntity.ok(message)
    }
}