#CALCULADORA ORIENTADA A OBJETOS KOTLIN INICIANTE

#Explicando as funcionalidades

#Calculadora feita com orientação a objetos com intuito de treino

* Pacote calculatorOOP foi criado para empacotar a classe funcionCalc
* Esta classe contém as funções das operações aritméticas para evitar 
* Que poluissemos a nossa função principal main() juntamente com nossa 
* Classe principal.
* Cada função da nossa classe functionCalc retornam valores de tipo float
* a intenção foi abstrair o maximo as funções evitando conversões e casting
#EXEMPLO:
* Ao Invés de criarmos fun soma(num1:Float, num2:Float):Float{
	return num1 + num2
} 
* Simplificamos conforme as aulas na seguinte sintaxe:
* fun soma(num1:Float, num2:Float):Float = num1 + num2  
***************************************************************************
#Classe principal DisplayCalc no pacote displa.calc.digital.one
* Nesta classe importamos o pacote calculatorOOP para podermos 
* instanciar o objeto arithmetic da classe funcionCalc
* a cada operação o objeto arithmetic faz referencia as funções
* da classe functionCalc.
* Ao invés de utilizarmos longas linhas de codigo com if e else if
* Simplificamos com a operação when()



