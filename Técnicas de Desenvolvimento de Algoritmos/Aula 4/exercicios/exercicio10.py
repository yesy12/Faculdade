"""
10 FASES .
EM CADA FASE ELE PODE MATAR DE 0 A 100 INIMIGOS.
"""
media = 0
resultado = False
quantidade = 0
i = 1
opcao = ""
valor = 0

while resultado == False:
    
    valor = int(input(f"Digite quanto inimigos você matou na fase {i}: "))

    quantidade += valor

    print("Você gostaria de sair? 1 para Sim ou digite qualquer coisa")
    opcao = int(input("Opção: "))

    if(opcao == 1):
        resultado = True
    else:   
        i += 1
    

media = quantidade/i

print(f"A sua média é: {media}")
