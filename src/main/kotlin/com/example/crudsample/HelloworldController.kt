package com.example.crudsample

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HelloworldController {
    @RequestMapping("/")
    private fun index(): String {
        return "hello";
    }

    @GetMapping("/get-message")
    private fun getMessage(@RequestParam("message", required = false) message: String, model: Model): String {
        model.addAttribute("message", message);
        return "get_message";
    }

    @GetMapping("/post-message")
    private fun postMessage(): String {
        return "post_message";
    }

    @PostMapping("/confirm-message")
    private fun confirmMessage(@RequestParam("message") message: String, model: Model): String {
        model.addAttribute("message", message);
        return "confirm_message";
    }
}