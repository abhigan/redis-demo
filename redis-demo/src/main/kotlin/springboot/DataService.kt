package springboot

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.io.Serializable

@Service
class DataService {

    @Cacheable(cacheNames = ["student"])
    fun getData() : StudentDto {
        println("Waao koi to pucha")
        return StudentDto("abba", "1B", 23)
    }
}

data class StudentDto (
    val name: String,
    val clazz: String,
    val roll: Int
) : Serializable

