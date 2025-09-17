package eadl.ecommerce.entities

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity
class Order {
    @Id
    val id: UUID? = UUID.randomUUID()

    @ManyToOne(fetch = FetchType.EAGER)
    lateinit var user: User
}