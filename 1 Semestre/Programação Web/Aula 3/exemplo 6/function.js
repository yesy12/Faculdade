let salario, salario_aumento;

salario = parseFloat(prompt("Digite o seu salário atual: "));
salario_aumento = salario * 1.25;

document.write(`<p>Seu salário atual é: R$ ${salario}`);
document.write(`<p>Seu novo salário atual é: R$ ${salario_aumento}`);
