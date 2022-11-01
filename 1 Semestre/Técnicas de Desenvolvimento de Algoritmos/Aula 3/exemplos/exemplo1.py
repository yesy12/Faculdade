numero1 = float(input("digite o número: ")) #
numero2 = float(input("digite outro número: ")) #
print("'A' para média aritmética e 'P' para média ponderada")
opcao = input("Digite a opção: ")#
resultado = 0#
mensagem = ""#

if opcao == "a":
    resultado = (numero1+numero2)/2
    mensagem = f"A média aritmética é igual a {resultado}"
elif opcao == "p":
    resultado = ( (numero1*3) + (numero2*7) )/(3+7)
    mensagem = f"A média ponderada é igual a {resultado}"

print(mensagem)
