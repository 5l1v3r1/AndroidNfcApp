package com.batyuk.dmytro.librarynfc


sealed class Entity
data class Error(val t: Throwable): Entity()
sealed class Command: Entity()

object SelectApdu: Command()
object ApduSelectedOk: Command()
data class Text(val text: String): Command()
data class Data(val code: Byte, val payload: ByteArray): Command()
data class NotReady(val delaySeconds: Long): Command()
object ExchangeCompleted: Command()
object Unknown: Command()