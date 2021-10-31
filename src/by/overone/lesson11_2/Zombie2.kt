package by.overone.lesson11_2

import java.util.*

class Zombie2(private val health: Int, private val damage: Int) : Enemy(health, damage) {
    val random = Random()
}