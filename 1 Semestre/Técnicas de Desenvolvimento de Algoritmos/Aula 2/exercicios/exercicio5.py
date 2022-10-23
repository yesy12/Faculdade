n1 = int(input("Digite o primeiro Número: "))
n2 = int(input("Digite o segundo Número: "))
n3 = int(input("Digite o terceiro Número: "))


soma = (n1 + n2) * 2 + (n3*6)
resultado = soma % 9

n4 = f"{n1}{n2}{n3}{resultado}"

print(n4)
