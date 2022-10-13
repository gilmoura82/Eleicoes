package Aplicacao;

import java.util.Scanner;

import Classes.Candidato;

public class Programa  {
	
	public static void main(String[] args) throws Exception {
		
		/* Escopo do Programa
		 * Aproveitando o ano de elei��o, fa�a um sistema que:
		1 � Compute votos enquanto houver eleitores;
		2 � Ao informar o t�tulo do eleitor, se n�o for um eleitor da sess�o informar por println que dever� se direcionar 
		a outra sess�o; 
		3 � Dado que tenha uma classe de Candidato com nome, partido, sigla e n�mero, ao realizar o voto, 
		somar a quantidade votante dos candidatos;
		4 � Ao final da sess�o exibir os candidatos e a quantidade de votos.
		
		*/
		
		/* CANDIDATOS � PRESID�NCIA 2022 - 2� Turno
		
		 CANDIDATO 1
		 NOME: JAIR MESSIAS BOLSONARO
		 PARTIDO: PARTIDO LIBERAL
		 SIGLA: PL
		 N�: 22
		 
		 
		 CANDIDATO 2
		 NOME: LUIS IN�CIO LULA DA SILVA
		 PARTIDO: PARTIDO DOS TRABALHADORES
		 SIGLA: PT
		 N�: 13
		 	 
		
		*/
		Scanner leitor = new Scanner (System.in);
		
		// CANDIDATO 1
		Candidato candidato1 = new Candidato();
		candidato1.setNome("JAIR MESSIAS BOLSONARO");
		candidato1.setPartido("PARTIDO LIBERAL");
		candidato1.setSigla("PL");
		candidato1.setNumero(22);
		
		// CANDIDATO 2
		Candidato candidato2 = new Candidato();
		candidato2.setNome("LUIS IN�CIO LULA DA SILVA");
		candidato2.setPartido("PARTIDO DOS TRABALHADORES");
		candidato2.setSigla("PT");
		candidato2.setNumero(13);		
		
		
		System.out.println(" ================ PRESID�NCIA DA REP�BLICA 2� TURNO - ELEI��ES 2022 =================");
		
		
		int quantidadeEleitores;
		int eleitoresFaltantes;
		int eleitoresVotantes;
		int numeroCandidato = 0;
		int contagem1 = 0;
		int contagem2 = 0;
		int votoNulo = 0;
		int votosValidos = 0;
		int sessao = 50;
		
		
		System.out.println("Bem Vindo!!! Qual � o seu nome? ");
		String nome = leitor.nextLine();
		
				
		System.out.println(nome + " Informe o n� do seu T�tulo de Eleitor: ");
		String titulo = leitor.nextLine();
		
		
		System.out.println("Qual � o n� da sua sess�o? ");
		sessao = leitor.nextInt();
		
		
		System.out.println("Quantos Eleitores Existem Na Sess�o? ");
		quantidadeEleitores = leitor.nextInt();
		
		System.out.println("Quantos Votar�o? ");
		eleitoresVotantes = leitor.nextInt();
		
		// Valida��o de Sess�o
			if (sessao != 50) {
				System.out.println("Voc� est� na sess�o 50!!!" + "Por favor dirija-se � sua sess�o correspondente");
				System.out.printf("SESS�O ATUAL: 50 " + "\n" + "SESS�O INFORMADA: " +  sessao + "\n");
			} else {
				System.out.println("Dirija-se � urna");	
			}
		
		// Contagem dos votos
		for (int total = 1; total <= eleitoresVotantes; total++) {	
			
			// In�cio da Vota��o
			System.out.println("Informe o candidato: ");
			numeroCandidato = leitor.nextInt();
			
			// Escolha dos Candidatos
			if (numeroCandidato == 22) {
				System.out.println("========== |CANDIDATO SELECIONADO| ==========");
				System.out.println("N�MERO: " + candidato1.getNumero() + " || " + "NOME: " + candidato1.getNome());
				System.out.println("PARTIDO: " + candidato1.getPartido() + " || " + "SIGLA: " + candidato1.getSigla());
				System.out.println("=============================================" + "\n");
				contagem1++;
			} else if (numeroCandidato == 13) {
				System.out.println("============ |CANDIDATO SELECIONADO| ===========");
				System.out.println("N�MERO: " + candidato2.getNumero() + " || " + "NOME: " + candidato2.getNome());
				System.out.println("PARTIDO: " + candidato2.getPartido() + " || " + "SIGLA: " + candidato2.getSigla());
				System.out.println("=================================================" + "\n");
				contagem2++;
			} else {
				System.out.println("ATEN��O " + "N�MERO INV�LIDO E ESSE VOTO SER� NULO. CONFIRMAR? 1 PARA SIM OU 2 PARA N�O");
				int resposta = leitor.nextInt();
				if (resposta == 1) {
					System.out.println("VOTO NULO");
					votoNulo++;
				}
				
			}
			
			
			
			
		}
		
		// Final e lista das informa�es
		System.out.println("============== |FINAL DA SESS�O| ================" + "\n");
		
		System.out.println("=================================================");
		System.out.println("N�MERO: " + candidato1.getNumero() + " || " + "NOME: " + candidato1.getNome());
		System.out.println("PARTIDO: " + candidato1.getPartido() + " || " + "SIGLA: " + candidato1.getSigla());
		System.out.println("Total de votos: " + contagem1);
		
		System.out.println("=================================================");
		System.out.println("N�MERO: " + candidato2.getNumero() + " || " + "NOME: " + candidato2.getNome());
		System.out.println("PARTIDO: " + candidato2.getPartido() + " || " + "SIGLA: " + candidato2.getSigla());
		System.out.println("Total de votos: " + contagem2);
		System.out.println("=================================================" + "\n");
		
		// Valida��o da Contagem dos Votos
		if (contagem1 == contagem2) {
			System.out.println("OS CANDIDATOS EST�O EMPATADOS, SENDO NECESS�RIO UM VOTO DE DESEMPATE");
			System.out.println("Informe o candidato para desempatar o placar: ");
			numeroCandidato = leitor.nextInt();
			if (numeroCandidato == 22) {
				System.out.println("========== |CANDIDATO SELECIONADO| ==========");
				System.out.println("N�MERO: " + candidato1.getNumero() + " || " + "NOME: " + candidato1.getNome());
				System.out.println("PARTIDO: " + candidato1.getPartido() + " || " + "SIGLA: " + candidato1.getSigla());
				System.out.println("=============================================" + "\n");
				contagem1++;
			} else if (numeroCandidato == 13) {
				System.out.println("============ |CANDIDATO SELECIONADO| ===========");
				System.out.println("N�MERO: " + candidato2.getNumero() + " || " + "NOME: " + candidato2.getNome());
				System.out.println("PARTIDO: " + candidato2.getPartido() + " || " + "SIGLA: " + candidato2.getSigla());
				System.out.println("=================================================" + "\n");
				contagem2++;
			} else {
				System.out.println("ATEN��O " + "N�MERO INV�LIDO E ESSE VOTO SER� NULO. CONFIRMAR? 1 PARA SIM OU 2 PARA N�O");
				int resposta = leitor.nextInt();
				if (resposta == 1) {
					System.out.println("VOTO NULO");
					votoNulo++;
				}
				
			}
			
		}
		
		// CANDIDATO ELEITO
		if (contagem1 > contagem2) {
			System.out.println("=====================================================");
			System.out.println("PRESIDENTE REELEITO: " + candidato1.getNome() + " - " + candidato1.getSigla());
			System.out.println("=====================================================" + "\n");
		} else {
			System.out.println("=========================================================");
			System.out.println("NOVO PRESIDENTE ELEITO: " + candidato2.getNome() + " - " + candidato2.getSigla());
			System.out.println("=========================================================" + "\n");
		}
		
		
		 
		
		// Eleitores Faltantes
		eleitoresFaltantes = quantidadeEleitores - eleitoresVotantes;

		// Votos V�lidos
		votosValidos = eleitoresVotantes - votoNulo;
		
		// Contagem Final
		System.out.println("============= RESULTADO FINAL ==============");
		System.out.println("Total de Eleitores da Sess�o: " + quantidadeEleitores);
		System.out.println("Eleitores Que Votaram: " + eleitoresVotantes);
		System.out.println("Votos V�lidos: " + votosValidos);
		System.out.println("Votos Nulos: " + votoNulo);
		System.out.println("Eleitores Indecisos Ou Que N�o Votaram: " + eleitoresFaltantes);
		System.out.println("============================================");
		
		
	}

}
