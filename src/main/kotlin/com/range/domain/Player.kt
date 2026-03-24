package com.range.domain

import com.range.enums.GameRole
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "players")
data class Player(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val username: String,
    val role: GameRole,
    val isAlive: Boolean,

    @ManyToMany(mappedBy = "players")
    val games: MutableSet<Game> = mutableSetOf()
)