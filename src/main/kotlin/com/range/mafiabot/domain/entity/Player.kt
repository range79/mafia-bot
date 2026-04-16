package com.range.mafiabot.domain.entity

import com.range.mafiabot.domain.enum.GameRole
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import jakarta.persistence.Table
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
