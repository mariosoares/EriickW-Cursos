#include <stdio.h>  	
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
int main()
{
	setlocale( LC_ALL, "portuguese" );
		
	char opcao;
	

	printf("\n**********************");//10
	printf("\n*                    *");
	printf("\n*   Menu de opções   *");
	printf("\n*   A - Cadastrar    *");
	printf("\n*   B - Pesquisar    *");
	printf("\n*   C - Alterar      *");
	printf("\n*                    *");
	printf("\n**********************");//10

	
	printf("\n\n Digite sua escolha: ");
	scanf("%c",&opcao);
	
	if(opcao == 'A' || opcao == 'a'){// é necessário colocar a opção entre aspas simples pois dados de tipo char so podem ser comparados com dados entre aspas simples
	printf("\n**********************");
	printf("\n*                    *");
	printf("\n*     Cadastrar      *");
	printf("\n*                    *");
	printf("\n**********************");
	}else if(opcao == 'B' || opcao =='b' ){
	printf("\n**********************");//10
	printf("\n*                    *");
	printf("\n*     Pesquisar      *");
	printf("\n*                    *");
	printf("\n**********************");//10
	}else{
		
	printf("\n**********************");//10
	printf("\n*                    *");
	printf("\n*      Alterar       *");
	printf("\n*                    *");
	printf("\n**********************");//10
	}

 return 0;
}
