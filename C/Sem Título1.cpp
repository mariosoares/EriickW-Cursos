#include <stdlib.h>
#include <stdio.h>
#include <locale.h>



int main(){
	setlocale(LC_ALL,"portuguese");
		int nums[5],nums2[5],soma[5];
		int indice;
			for(indice=0;indice<=4;indice++){
				printf("Digite O n�mero %d ",indice+1);
				scanf("%d",&nums[indice]);
			}
			
			printf("\n\n Digite mais 5 n�meros \n\n");
			
			for(indice=0;indice<=4;indice++){
				printf("Digite O n�mero %d ",indice+1);
				scanf("%d",&nums2[indice]);
			}
			
			for(indice=0;indice<=4;indice++){
				printf("Digite O n�mero %d ",indice+1);
				
			}
	return 0;
}

