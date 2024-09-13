fun main() {
    // println - imprime no console e pula a linha, print - imprime no console e não pula a linha
    println("String: Hello World!")

    // Tipos
    /*
    * Long, Int, Short, Byte, Float, Double, Char, Boolean, String - Tipos primitivos
    * */
    // var (mutável) e val (imutável) para declarar variáveis

    var idade = 30
    idade = 40
    println("Var: $idade")
    println("Conversão de tipos: ${idade.toFloat()}") // Conversão de tipos

    val nome: String = "Saulo"
    val sobrenome: String = "J V Filho"
    val nomeCompleto = "$nome $sobrenome" // Interpolação de strings
    println("Interpolação: $nomeCompleto")

    // Arrays
    val n: Array<Int> = arrayOf(10, 20, 30, 40, 50) // Array de inteiros
    imprimir("Array: ${n[0]}") // Acessando o primeiro elemento do array

    // For
    print("For: ")
    for (x in n) {
        print("$x ")
    }
    println()

    // Funções
    val result = somar(x = 10, z = 20)
    imprimir("Função: $result")

    val subtrair = fun(x: Int, y: Int) : Int = x - y
    imprimir("Função anônima: ${subtrair(10, 5)}")

    imprimir2("Single-Expression Function: Hello World!")

    imprimir2("Single-Expression Function (somar): ${somar2(10, 20, 30)}")

    println()

    // POO
    val carro = Carro()
    carro.cor = "Vermelho"
    carro.ano = 2021
    println("Carro: ${carro.cor} - ${carro.ano}")
    carro.acelerar()
    carro.frear()
    println("-----------------------------")
    // Herança
    val carroTunado = CarroTunado()
    carroTunado.cor = "Azul"
    carroTunado.ano = 2020
    println("Carro Tunado: ${carroTunado.cor} - ${carroTunado.ano}")
    carroTunado.fazerDrift()

}

// Funções
fun imprimir(msg: String = "") : Unit {
    println(msg)
}

fun somar(x: Int, y: Int = 0, z: Int) : Int {
    return x + y + z
}

// Single-Expression Function
fun imprimir2(msg: String) = println(msg)

fun somar2(x: Int, y:Int, z:Int) = x + y + z

// Class
open class Carro{
    // Atributos
    var cor: String = ""
    var ano: Int = 0

    // Métodos / Funções
    fun acelerar(){
        println("Acelerando...")
    }

    fun frear(){
        println("Freando...")
    }
}

// Herança
class CarroTunado : Carro(){
    fun fazerDrift(){
        println("Fazendo drift...")
    }
}