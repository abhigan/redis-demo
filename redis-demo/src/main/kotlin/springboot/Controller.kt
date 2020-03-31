package springboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @Autowired
    lateinit var dataService: DataService

    @Autowired
    lateinit var redisTemplate : RedisTemplate<String, String>

    @GetMapping("/api")
    fun api(): String? {
        return redisTemplate.opsForValue().get("some-key")
        // return dataService.getData()
    }

}
