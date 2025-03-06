fun main() {
 println("CALCULADORA")
 println("1.Soma");
 println("2.Subtração")
 println("3.Multiplicação")
 println("4.Divisão \n")

 println("Digite a opção desejada:")
 val opcao = readLine()?.toIntOrNull()
 
 println("Digite o primeiro número:")
 val num1 = readLine()?.toDouble()

 println("Digite o segundo número:")
 val num2 = readLine()?.toDouble()

 if (opcao == 1){
    
    var soma  = num1!! + num2!!
    println("$soma") 

   } else if (opcao ==2) {

      var subtracao = num1!! - num2!!
      println("$subtracao")

   } else if (opcao == 3) {

   var multiplicacao = num1!! * num2!!
   println("$multiplicacao")

} else if (opcao == 4) {
   var divisao = num1!! / num2!!
   println("$divisao")
}


}

