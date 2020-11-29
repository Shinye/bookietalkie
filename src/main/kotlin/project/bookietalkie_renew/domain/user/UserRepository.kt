package project.bookietalkie_renew.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import project.bookietalkie_renew.model.entity.User

@Repository
interface UserRepository: JpaRepository<User, Long> {
    fun save(user: User): User

    fun findByIdIn(ids: Collection<Long>): List<User>

    fun findByName(name: String): List<User>

    fun findByEmail(email: String): User?
}
