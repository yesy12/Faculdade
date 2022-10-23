let nome, nascimento, anoAtual, idade;

nome = prompt("Digite o seu nome: ");
nascimento = parseInt(prompt("Digite o ano em que você nasceu: "));
anoAtual = parseInt(prompt("Digite o ano atual: "));

idade = anoAtual - nascimento;

document.writeln(`<p> Ola ${nome}</p>`);
document.writeln(`<p>\nVocê tem ${idade} anos</p>`);