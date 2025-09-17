package eadl.ecommerce.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany
import java.util.UUID

@Entity
class User {
    @Id
    val id: UUID? = UUID.randomUUID()

    @Column(nullable = false, length = 50)
    var name: String = ""

    @Column(nullable = false, length = 250)
    var email: String = ""

    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "user")
    val orders: MutableSet<Order> = HashSet()

    @ManyToMany(cascade = [(CascadeType.MERGE)])
    @JoinTable(
        name = "users_categories",
        joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "category_id", referencedColumnName = "id")]
    )
    val categories: MutableSet<Category> = mutableSetOf()
}