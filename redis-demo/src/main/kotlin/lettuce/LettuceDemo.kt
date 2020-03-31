package lettuce

import io.lettuce.core.RedisClient

// implementation "io.lettuce:lettuce-core:5.2.2.RELEASE"

fun main() {
    val redisClient = RedisClient.create("redis://localhost/0")
    val connection = redisClient.connect()

    println("Connected to Redis")
    connection.sync().set("key", "Hello World")

    val a = connection.sync().hget("this-is-a-hash", "a")
    println(a)

    val data = connection.async().get("key")

    println(data.isDone)
    println("getting...")
    while (! data.isDone) {
        Thread.sleep(100)
        print(".")
    }

    println(data.isDone())

    println(data.get())

    connection.close()
    redisClient.shutdown()
}
