package br.digital.com

fun main() {

    var estoque = Estoque("Arroz", 100, 50)

    estoque.mostra()

    estoque.mudarNome("Feijão")

    estoque.mudarQtdMinima(10)

    estoque.mostra()

}