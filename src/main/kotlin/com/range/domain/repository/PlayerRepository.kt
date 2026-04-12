package com.range.domain.repository

import com.range.domain.entity.Player
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.UUID
@Repository
interface PlayerRepository: JpaRepository<Player, UUID> {
}