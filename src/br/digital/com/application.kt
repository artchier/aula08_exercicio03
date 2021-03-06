package br.digital.com

fun main(){

    // Criação do estoque
    val estoque1 = Estoque("Bebidas", 12, 5)

    // Testando as funções
    estoque1.mudarQtdMinima(10)
    println(estoque1.precisaRepor())
    estoque1.mostra()
    println()

    estoque1.mudarQtdMinima(-5)
    estoque1.mostra()
    println()

    estoque1.repor(20)
    estoque1.mostra()
    println()

    estoque1.darBaixa(30)
    println(estoque1.precisaRepor())
    estoque1.mostra()
    println()

    estoque1.darBaixa(50)
    estoque1.mostra()
    println()

    estoque1.mudarNome("Coca")
    estoque1.mostra()
    println()
}
