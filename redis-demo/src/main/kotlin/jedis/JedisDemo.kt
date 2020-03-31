package jedis

import redis.clients.jedis.Jedis

// implementation "redis.clients:jedis:3.2.0"

fun main() {
    val jedis = Jedis();
    jedis.set("test", "123")
    // print(jedis.get("abcd"))

    // jedis.hset("this-is-a-hash", hashMapOf("a" to "1", "b" to "2"))
    print( jedis.hget( "this-is-a-hash", "a"))
}
