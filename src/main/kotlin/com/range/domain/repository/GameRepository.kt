package com.range.domain.repository

import com.range.domain.entity.Player
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.UUID

interface GameRepository: JpaRepository<Player, UUID> {
}