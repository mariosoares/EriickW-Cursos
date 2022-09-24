#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"portuguese");
		int idades[5];
		int indice,maioresIdade=0;
			for(indice=0;indice<=4;indice++){
				printf("Digite a idade do %dº aluno: ",indice+1);
				scanf("%d",&idades[indice]);
			}
			for(indice=0;indice<=4;indice++){
				if(idades[indice]<=25){
					++maioresIdade;
				}
			}
			
			printf("%d possuem mais que 25 anos de idade ", maioresIdade);
	return 0;
}
