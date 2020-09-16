package br.digital.com

class Estoque(var nome: Estoque, var qtdAtual: Int, var qtdMinima: Int) {

    init {
        println("Novo estoque criado")
    }
    //eu vi que o nome disso aqui é backing field
    var _qtdAtual: Int = qtdAtual
        get() = qtdAtual
        private set

    var _qtdMinima: Int = qtdMinima
        get() = qtdMinima
        private set

    fun repor(qtd: Int){
        qtdAtual += qtd
    }

    fun mudarQtdMinima(novaqtdMinima: Int){
        when (novaqtdMinima >= 1) {
            true -> qtdMinima = novaqtdMinima
            false -> println("Valor para remoção é menor que 1")
        }
    }

    fun precisaRepor(): Boolean = (qtdAtual <= qtdMinima)
}