package com.range.domain

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "games")
data class Game(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinTable(
        name = "game_players",
        joinColumns = [JoinColumn(name = "game_id")],
        inverseJoinColumns = [JoinColumn(name = "player_id")]
    )
    val players: MutableSet<Player> = mutableSetOf()
)