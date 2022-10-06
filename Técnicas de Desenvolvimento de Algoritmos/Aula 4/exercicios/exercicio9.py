"""
10 FASES .
EM CADA FASE ELE PODE MATAR DE 0 A 100 INIMIGOS.
"""
media = 0
i = 0
quantidade = 0
while i < 10:
    valor = int(input(f"Digite quanto inimigos você matou na fase{i}: "))
    quantidade += valor
    i += 1

media = quantidade/10

print(f"A sua média é: {media}")
