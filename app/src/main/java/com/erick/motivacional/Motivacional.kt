package com.erick.motivacional

import kotlin.random.Random

object Motivacional {
    val Frases = arrayOf(
        "Os problemas são oportunidades para se mostrar o que sabe",
        "Nossos fracassos, às vezes, são mais frutíferos do que os êxitos.",
        "Tente de novo. Fracasse de novo. Mas fracasse melhor",
        "É costume de um tolo, quando erra, queixar-se dos outros. É costume de um sábio queixar-se de si mesmo",
        "O verdadeiro heroísmo consiste em persistir por mais um momento, quando tudo parece perdido",
        "Mesmo que já tenhas feito uma longa caminhada, há sempre um novo caminho a fazer",
        "Na prosperidade, nossos amigos nos conhecem; na adversidade, nós é que conhecemos nossos amigos",
        "A felicidade não está em fazer o que a gente quer, e sim querer o que a gente faz",
        "É sempre divertido fazer o impossível",
        "Prefiro os erros do entusiasmo à indiferença da sabedoria"
    )

    fun getInstance(): String {
        var random = Random

        return this.Frases[random.nextInt(Frases.size)]
    }
}