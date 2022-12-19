package com.example.crudsample

import com.example.crudsample.model.Todo
import com.example.crudsample.repository.TodoRepository
import lombok.RequiredArgsConstructor
import org.springframework.boot.Banner.Mode
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import kotlin.math.log

@RequiredArgsConstructor
@Controller
class TodoController(private val repository: TodoRepository) {
    @GetMapping("/todo")
    fun showAllTodo(@ModelAttribute todo: Todo, model: Model): String {
        model.addAttribute("todos", repository.findAll())
        return "todo"
    }

    //  Create
    @PostMapping("/add")
    fun addTodo(@ModelAttribute todo: Todo): String {
        repository.save(todo)
        return "redirect:/todo"
    }

    //  Update
    @PostMapping("/edit")
    fun editTodo(@ModelAttribute todo: Todo): String? {
        repository.update(todo)
        return "redirect:/todo"
    }

    //  Delete
    @GetMapping("/delete/{id}")
    fun deleteTodo(@PathVariable id: Long): String? {
        repository.delete(id)
        return "redirect:/todo"
    }
}