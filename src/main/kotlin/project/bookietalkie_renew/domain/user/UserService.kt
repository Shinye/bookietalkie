package project.bookietalkie_renew.domain.user

import org.springframework.stereotype.Service
import project.bookietalkie_renew.model.entity.User
import java.lang.IllegalStateException

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun join(user: User): Long {
        validateDuplicateUser(user)
        return userRepository.save(user).id!!
    }

    private fun validateDuplicateUser(user: User) {
        if (userRepository.findByEmail(user.email) != null) {
            throw IllegalStateException("이미 가입한 회원입니다.")
        }
    }

    fun findByIdIn(ids: Collection<Long>): List<User> {
        return userRepository.findByIdIn(ids)
    }

    fun findByEmail(email: String): User? {
        return userRepository.findByEmail(email)
    }
}
