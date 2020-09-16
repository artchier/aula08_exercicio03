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
        qtdAtual += qtd
    }

    fun mudarQtdMinima(novaqtdMinima: Int){
        when (novaqtdMinima >= 1) {
            true -> {qtdMinima = novaqtdMinima
                println("Nova quantidade minima...:")
                mostra()}
            false -> println("Valor para a quantidade minima é menor que 1, alteração não permitida!")
        }
    }

    fun precisaRepor(): Boolean = (qtdAtual <= qtdMinima)

    fun darBaixa(qtd: Int){
        if (qtd > qtdAtual) println("Erro: Quantidade é maior que quantidade em estoque")
        else qtdAtual -= qtd
    }

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mostra() = println ("Nome do produto: $nome; Quantidade mínima: $qtdMinima; Quantidade atual: $qtdAtual.")
}