package br.digital.com

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

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
        _qtdAtual += qtd
    }

    fun mudarQtdMinima(novaqtdMinima: Int){
        when (novaqtdMinima >= 1) {
            true -> {_qtdMinima = novaqtdMinima
                println("Nova quantidade minima...:")
                mostra()}
            false -> println("Valor para a quantidade minima é menor que 1, alteração não permitida!")
        }
    }

    fun precisaRepor(): Boolean = (_qtdAtual <= _qtdMinima)

    fun darBaixa(qtd: Int){
        if (qtd > _qtdAtual) println("Erro: Quantidade é maior que quantidade em estoque")
        else _qtdAtual -= qtd
    }

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mostra() = println ("Nome do produto: $nome; Quantidade mínima: $_qtdMinima; Quantidade atual: $_qtdAtual.")
}