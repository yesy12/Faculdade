window.onload = () =>{
	let criarTabela = document.getElementById("criarTabela");
	let tabela = document.getElementById("tabela");
	let d1;
	let d2;
	let extruturaTabela;
	
	let menorValor = 100;
	let maiorValor = 0;
	let maiorValorLinha;
	let valorMedio;
	
	let minValue = 2;
	let maxValue;
	
	criarTabela.addEventListener("click",()=>{
		d1 = Number(document.getElementById("d1").value);
		d2 = Number(document.getElementById("d2").value);
		
		if(d2 == 10){
			maxValue = 16;
		}
		else{
			minValue = 0;
			maxValue = 6+d2;
		}
		valorMedio = Math.floor((minValue+maxValue)/2);
		extruturaTabela = "<table><tbody>";
		
		for(let linha = 1; linha < 7; linha++){
			extruturaTabela += "<tr>";
			//document.write(linha);
			
			for(let coluna = 1; coluna <= d2; coluna++){
				soma = linha+coluna;
				
				if(menorValor >= soma){
					menorValor = soma;
					extruturaTabela += `<td class='red'>${soma}</td>`;
				}
				else if(valorMedio == soma){
					extruturaTabela += `<td class='yellow'>${soma}</td>`;
				}
				else if(soma >= maiorValor){
					maiorValor = soma;
					maiorValorLinha = linha;
					extruturaTabela += `<td id="${soma}-${maiorValorLinha}">${soma}</td>`;
				}
				else{
					extruturaTabela += `<td>${soma}</td>`;
				}
			}
			
			extruturaTabela += "</tr>";
		}
		
		extruturaTabela += "</tbody></table>";
		tabela.innerHTML = extruturaTabela;
		
		document.getElementById(`${soma}-${maiorValorLinha}`).classList.add("green");
		
		maiorValor = 0;
		valorMedio = 0;
		extruturaTabela = "";
	})
}