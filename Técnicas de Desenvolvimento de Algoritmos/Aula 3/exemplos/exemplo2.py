numero1 = float(input("digite o número: ")) #
numero2 = float(input("digite outro número: ")) #
op = input("Digite a operação: ")#
resultado = 0#

if  op == "+":
    resultado = numero1 + numero2
elif  op == "-":
    resultado = numero1 - numero2
elif  op == "*":
    resultado = numero1 * numero2
elif  op == "/":
    resultado = numero1 / numero2
elif  op == "%":
    resultado = numero1 % numero2

print(resultado)