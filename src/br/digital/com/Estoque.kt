package br.digital.com

class Estoque (var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

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

    fun mudarQtdMinima(qtd: Int){
        when (qtdAtual >= qtd) {
            true -> qtdAtual -= qtd
            false -> println("Valor para remoção é maior que a quantidade em estoque")
        }
    }

    fun precisaRepor(): Boolean = (qtdAtual <= qtdMinima)

    fun darBaixa(qtd: Int){
        if (qtd > qtdAtual) println("Erro: Quantidade é maior que quantidade em estoque")
        else qtdAtual -= qtd
    }
}