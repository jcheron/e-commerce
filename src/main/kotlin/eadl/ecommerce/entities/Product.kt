package eadl.ecommerce.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.UUID

@Entity
class Product {
    @Id
    val id: UUID? = UUID.randomUUID()

    @Column(nullable = false, length = 50)
    var name: String = ""

    var price: BigDecimal = BigDecimal.ZERO

    var stock: Int = 0
}