#include <stdio.h>  	
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>


int main()
{
    setlocale( LC_ALL, "portuguese" );
    
 	int idade, escolha = 1;
 	char opcao[1];
	 	
	while(escolha !=0){

		printf("\n Digite sua idade: ");
		scanf("%d",&idade);
		
		if(idade<=17){
			printf("Voc� � menor de idade");
		}else if(idade<=64){
			printf("Voc� � maior de idade");
		}else if(idade>65){
			printf("Voc� ta velho em!!");
			
		}
		
		printf("\n Quer inserir a idade novamente?[0]:N�o [1]:Sim ");
		scanf("%i",&escolha);
		
	}
	 return 0;
}
