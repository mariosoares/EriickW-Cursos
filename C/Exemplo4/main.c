#include <stdio.h>  	
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main(){
	   setlocale( LC_ALL, "portuguese" );
	
	int num,contador,res;
	
	printf("Digite um número e saiba sua tabuada até o 10 : ");
	scanf("%d",&num);
	
	for(contador=1; contador <= 10;contador++){
		res= num*contador;
		printf("%d X %d = %d \n",num,contador,res);
	}
	
	
	return 0;
}
