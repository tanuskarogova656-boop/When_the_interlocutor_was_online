package ru.netology

fun main() {
    agoToText(30)
    agoToText(180)
    agoToText(7200)
    agoToText(90000)
    agoToText(200000)
    agoToText(300000)
}

fun agoToText(seconds: Int) {
    when {
        seconds in 0..60 ->
            println("был(а) только что")

        seconds in 61..60 * 60 -> {
            val minutes = seconds / 60
            println("был(а) $minutes ${minutesWord(minutes)} назад")
        }

        seconds in 60 * 60 + 1..24 * 60 * 60 -> {
            val hours = seconds / (60 * 60)
            println("был(а) $hours ${hoursWord(hours)} назад")
        }

        seconds in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 ->
            println("был(а) вчера")

        seconds in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 ->
            println("был(а) позавчера")

        else ->
            println("был(а) давно")
    }
}

fun minutesWord(minutes: Int): String = when {
    minutes % 100 in 11..14 -> "минут"
    minutes % 10 == 1 -> "минуту"
    minutes % 10 in 2..4 -> "минуты"
    else -> "минут"
}

fun hoursWord(hours: Int): String = when {
    hours % 100 in 11..14 -> "часов"
    hours % 10 == 1 -> "час"
    hours % 10 in 2..4 -> "часа"
    else -> "часов"
}
