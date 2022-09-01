#include <stdio.h>  	
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
int main()
{
    setlocale( LC_ALL, "portuguese" );
	char nomeAluno[30];
	char email[30];
	char endereco[30];
	char nomeDoCurso[20];
	char periodo[20];
	char turma[5];
	char telefone[12];
	int escolha;
	
	
	inicio:
	printf("===========================\n");
	printf("Formul�rio do aluno\n");
	printf("===========================\n");
	
	
	printf("Digite seu nome completo: ");
	gets(nomeAluno);
	
	printf("Digite seu E-mail: ");
	gets(email);
	 
	printf("Digite seu endere�o: ");
	gets(endereco);
	
	printf("Digite o nome do seu curso: ");
	gets(nomeDoCurso);
	
	printf("Digite o periodo: ");
	gets(periodo);
	
	printf("Digite sua turma: ");
	gets(turma);
	
	printf("Digite o seu n�mero de telefone: ");
	gets(telefone);
	
	system("cls");
	printf("Seus dados est�o corretos ? \n");
	printf("Nome: %s \n", nomeAluno);
	printf("Email: %s \n", email);
	printf("Endere�o: %s \n", endereco);
	printf("nomeDoCurso: %s \n", nomeDoCurso);
	printf("Turma: %s \n", turma);
	printf("Telefone: %s \n", telefone);	
	
    return 0;
}
