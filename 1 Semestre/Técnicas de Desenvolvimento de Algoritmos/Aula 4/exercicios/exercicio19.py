import random
import math

numero_Aleatorio =  math.floor(random.random() * 100)
valor = 0


print(numero_Aleatorio )

while valor != numero_Aleatorio:
    valor = int(input("Digite um número entre 0 e 100: "))

    if( valor > numero_Aleatorio):
        print("O valor é menor")
    elif(numero_Aleatorio > valor):
        print("O valor é maior")
    else:
        print("O valor é identico")
    print("\n")
