package com.example.crudsample.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id


@Entity
data class Todo(
    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column(name = "content", length = 500)
    val content: String? = null

)