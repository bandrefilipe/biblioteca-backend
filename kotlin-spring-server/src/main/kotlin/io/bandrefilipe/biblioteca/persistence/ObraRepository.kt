package io.bandrefilipe.biblioteca.persistence

import io.bandrefilipe.biblioteca.domain.ObraEntity
import io.bandrefilipe.biblioteca.domain.ObraVO
import org.springframework.stereotype.Component
import java.util.concurrent.atomic.AtomicInteger

@Component
class ObraRepository {

    private val idGenerator = AtomicInteger()
    private val obrasById: MutableMap<Int, ObraEntity> = mutableMapOf()

    fun insert(obra: ObraVO): ObraEntity {
        val entity = ObraEntity(
            id = idGenerator.incrementAndGet(),
            values = obra,
        )
        obrasById[entity.id] = entity
        return entity
    }
}
