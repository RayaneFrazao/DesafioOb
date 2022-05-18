
package sistemalanchonete


import  sistemalanchonete.lanchonete.*

fun main() {
    println("Bem vindo  ")
    println("Digite 1 para X Burger")
    println("Digite 2 para X Salada")
    var opcao = readln().toInt()

    val lanche: Produto = Lanche()
    val bebida: Produto = Bebida()

    when (opcao) {
        1 -> {
            lanche.nome = "X Burger"
            lanche.valor = 10.0
            lanche.quantidade = 1
        }
        2 -> {
            lanche.nome = "X Salada"
            lanche.valor = 12.0
            lanche.quantidade = 1
        }
    }
    val pedido: Pedido = Pedido()
    pedido.adicionarProduto(lanche)
    pedido.exibirProdutos()

    println("O que mais?")
    println("Digite 1 para refrigerante")
    println("Digite 2 para suco")

    opcao = readln().toInt()

    when (opcao) {
        1 -> {
            bebida.nome = "refrigerante"
            bebida.valor = 08.0
            bebida.quantidade = 1

        }
        2 -> {
            bebida.nome = "suco"
            bebida.valor = 06.0
            bebida.quantidade = 1

            pedido.adicionarProduto(bebida)
            println("Seu pedido ficou:")
            pedido.exibirProdutos()

            println("Digite 1 para remover lanche 2 para remover bebida")

            opcao = readln().toInt()
            when (opcao) {
            1-> pedido.removerProduto(lanche.codigo)
            2-> pedido.removerProduto(bebida.codigo)
            3-> {

            when(readln().toInt()) {
            else-> {
            println("Opção inválida")
                        }
                    }
                }
            }
        }
    }
}










