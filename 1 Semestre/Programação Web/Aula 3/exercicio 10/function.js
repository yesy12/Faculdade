let altura_degrau, altura_escada,quantidade_degraus;

altura_degrau = parseFloat(prompt("Digite a altura dos dregrais de sua escada (em metros): "));
altura_escada = parseFloat(prompt("Digite a altura da sua escada (em metros): "));

quantidade_degraus = altura_escada/altura_degrau;

document.write(`<p>Para alcançar seu destino de ${altura_escada} metros</p>`)
document.write(`<p>Você precisa subir ${quantidade_degraus} de degraus</p>`);