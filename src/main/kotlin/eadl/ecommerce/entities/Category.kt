package eadl.ecommerce.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class Category {
    @Id
    val id: UUID = UUID.randomUUID()

    @Column(nullable = false, length = 50)
    var name: String = ""

    var description: String = ""

}