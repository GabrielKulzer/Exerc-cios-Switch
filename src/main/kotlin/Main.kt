fun main() {
    //atividade1()
    atividade2()
}
fun atividade1():Unit{
    var numeroDeHabitantes:Float? = null
    var criancasNascidas:Float? = null
    var falecidos:Float? = null
    var opcao:Int? = null


    println("Digite a opção calculo que deseja fazer:\n" +
            "\n1- Taxa de natalidade" +
            "\n2- Taxa de mortalidade")
    opcao = readLine()!!.toInt()
    when(opcao){
        1 -> {
            println("Digite o número de habitantes:")
            numeroDeHabitantes = readLine()!!.toFloat()
            println("Digite o número de crianças nascidas:")
            criancasNascidas = readLine()!!.toFloat()
            fun calcularNatalidade(): Float {
                return (criancasNascidas * 1000) / numeroDeHabitantes!!
            }
            println("Taxa de natalidade em %: ${calcularNatalidade()}")
        }
        2 -> {
            println("Digite o número de habitantes:")
            numeroDeHabitantes = readLine()!!.toFloat()
            println("Digite o número de falecidos:")
            falecidos = readLine()!!.toFloat()
            fun calcularMortalidade():Float{
                return (falecidos * 1000) / numeroDeHabitantes
            }
            println("Taxa de mortalidade em %: ${calcularMortalidade()}")
        }
        else ->{
            println("Selecione uma das opções!!!")
        }
    }
}
fun atividade2():Unit{
    var valorDoProduto:Float? = null
    var formaDePagamento:Int? = null
    var meses:Short? = null
    println("Digite o valor do produto:")
    valorDoProduto = readLine()!!.toFloat()
    println("Digite a forma de pagamento:\n" +
            "\n1- À vista" +
            "\n2- À prazo (30 dias)" +
            "\n3- À prazo parcelado")
    formaDePagamento = readLine()!!.toInt()
    when(formaDePagamento){
    1 -> {
        fun calcularTotalAVista():Float{
            return valorDoProduto - (valorDoProduto * 10/100)
        }
        println("Total á vista R$: ${calcularTotalAVista()}")
     }
    2 -> {
        fun calcularValorAPrazo():Float{
            return valorDoProduto + (valorDoProduto * 3/100)
        }
        println("Total á prazo (30 dias) R$: ${calcularValorAPrazo()}")
    }
        3 -> {
            println("Digite em quantos meses deseja parcelar (1.5% de juros ao mês):")
            meses = readLine()!!.toShort()
            fun calcularTotalParcelado():Float{
            return (valorDoProduto * (meses * 1.5f/100)) + valorDoProduto
            }
            println("Valor total parcelado em $meses meses R$: ${calcularTotalParcelado()}")
        }
        else ->{
            println("Selecione uma das opções!!!")
        }
    }
}
