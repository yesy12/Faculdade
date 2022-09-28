let coeficienteA, coeficienteB, coeficienteC, delta, raiz1, raiz2;

document.write("<h1>Calculo da Raiz de 2 Grau</h1>");
document.write("<p>Formula ax2 + bx + c</p>");

coeficienteA = parseInt(prompt("Digite o coeficiente A: "));
coeficienteB = parseInt(prompt("Digite o coeficiente B: "));
coeficienteC = parseInt(prompt("Digite o coeficiente C: "));

delta = (coeficienteB * coeficienteB) - 4*coeficienteA*coeficienteC;


if(delta < 0){
    delta *= -1;
}

raiz1 = (-coeficienteB + Math.sqrt(delta))/2*coeficienteA;
raiz2 = (-coeficienteB - Math.sqrt(delta))/2*coeficienteA;

document.write(`<p>Para os coeficientes de A${coeficienteA}, B${coeficienteB} e C${coeficienteC}`)
document.write(`<p>As raizes são ${raiz1} e ${raiz2}</p>`);
