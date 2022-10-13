package Aplicacao;

import java.util.Scanner;

import Classes.Candidato;

public class Programa  {
	
	public static void main(String[] args) throws Exception {
		
		/* Escopo do Programa
		 * Aproveitando o ano de eleição, faça um sistema que:
		1 – Compute votos enquanto houver eleitores;
		2 – Ao informar o título do eleitor, se não for um eleitor da sessão informar por println que deverá se direcionar 
		a outra sessão; 
		3 – Dado que tenha uma classe de Candidato com nome, partido, sigla e número, ao realizar o voto, 
		somar a quantidade votante dos candidatos;
		4 – Ao final da sessão exibir os candidatos e a quantidade de votos.
		
		*/
		
		/* CANDIDATOS À PRESIDÊNCIA 2022 - 2º Turno
		
		 CANDIDATO 1
		 NOME: JAIR MESSIAS BOLSONARO
		 PARTIDO: PARTIDO LIBERAL
		 SIGLA: PL
		 Nº: 22
		 
		 
		 CANDIDATO 2
		 NOME: LUIS INÁCIO LULA DA SILVA
		 PARTIDO: PARTIDO DOS TRABALHADORES
		 SIGLA: PT
		 Nº: 13
		 	 
		
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
		candidato2.setNome("LUIS INÁCIO LULA DA SILVA");
		candidato2.setPartido("PARTIDO DOS TRABALHADORES");
		candidato2.setSigla("PT");
		candidato2.setNumero(13);		
		
		
		System.out.println(" ================ PRESIDÊNCIA DA REPÚBLICA 2º TURNO - ELEIÇÕES 2022 =================");
		
		
		int quantidadeEleitores;
		int eleitoresFaltantes;
		int eleitoresVotantes;
		int numeroCandidato = 0;
		int contagem1 = 0;
		int contagem2 = 0;
		int votoNulo = 0;
		int votosValidos = 0;
		int sessao = 50;
		
		
		System.out.println("Bem Vindo!!! Qual é o seu nome? ");
		String nome = leitor.nextLine();
		
				
		System.out.println(nome + " Informe o nº do seu Título de Eleitor: ");
		String titulo = leitor.nextLine();
		
		
		System.out.println("Qual é o nº da sua sessão? ");
		sessao = leitor.nextInt();
		
		
		System.out.println("Quantos Eleitores Existem Na Sessão? ");
		quantidadeEleitores = leitor.nextInt();
		
		System.out.println("Quantos Votarão? ");
		eleitoresVotantes = leitor.nextInt();
		
		// Validação de Sessão
			if (sessao != 50) {
				System.out.println("Você está na sessão 50!!!" + "Por favor dirija-se à sua sessão correspondente");
				System.out.printf("SESSÃO ATUAL: 50 " + "\n" + "SESSÃO INFORMADA: " +  sessao + "\n");
			} else {
				System.out.println("Dirija-se à urna");	
			}
		
		// Contagem dos votos
		for (int total = 1; total <= eleitoresVotantes; total++) {	
			
			// Início da Votação
			System.out.println("Informe o candidato: ");
			numeroCandidato = leitor.nextInt();
			
			// Escolha dos Candidatos
			if (numeroCandidato == 22) {
				System.out.println("========== |CANDIDATO SELECIONADO| ==========");
				System.out.println("NÚMERO: " + candidato1.getNumero() + " || " + "NOME: " + candidato1.getNome());
				System.out.println("PARTIDO: " + candidato1.getPartido() + " || " + "SIGLA: " + candidato1.getSigla());
				System.out.println("=============================================" + "\n");
				contagem1++;
			} else if (numeroCandidato == 13) {
				System.out.println("============ |CANDIDATO SELECIONADO| ===========");
				System.out.println("NÚMERO: " + candidato2.getNumero() + " || " + "NOME: " + candidato2.getNome());
				System.out.println("PARTIDO: " + candidato2.getPartido() + " || " + "SIGLA: " + candidato2.getSigla());
				System.out.println("=================================================" + "\n");
				contagem2++;
			} else {
				System.out.println("ATENÇÃO " + "NÚMERO INVÁLIDO E ESSE VOTO SERÁ NULO. CONFIRMAR? 1 PARA SIM OU 2 PARA NÃO");
				int resposta = leitor.nextInt();
				if (resposta == 1) {
					System.out.println("VOTO NULO");
					votoNulo++;
				}
				
			}
			
			
			
			
		}
		
		// Final e lista das informaões
		System.out.println("============== |FINAL DA SESSÃO| ================" + "\n");
		
		System.out.println("=================================================");
		System.out.println("NÚMERO: " + candidato1.getNumero() + " || " + "NOME: " + candidato1.getNome());
		System.out.println("PARTIDO: " + candidato1.getPartido() + " || " + "SIGLA: " + candidato1.getSigla());
		System.out.println("Total de votos: " + contagem1);
		
		System.out.println("=================================================");
		System.out.println("NÚMERO: " + candidato2.getNumero() + " || " + "NOME: " + candidato2.getNome());
		System.out.println("PARTIDO: " + candidato2.getPartido() + " || " + "SIGLA: " + candidato2.getSigla());
		System.out.println("Total de votos: " + contagem2);
		System.out.println("=================================================" + "\n");
		
		// Validação da Contagem dos Votos
		if (contagem1 == contagem2) {
			System.out.println("OS CANDIDATOS ESTÃO EMPATADOS, SENDO NECESSÁRIO UM VOTO DE DESEMPATE");
			System.out.println("Informe o candidato para desempatar o placar: ");
			numeroCandidato = leitor.nextInt();
			if (numeroCandidato == 22) {
				System.out.println("========== |CANDIDATO SELECIONADO| ==========");
				System.out.println("NÚMERO: " + candidato1.getNumero() + " || " + "NOME: " + candidato1.getNome());
				System.out.println("PARTIDO: " + candidato1.getPartido() + " || " + "SIGLA: " + candidato1.getSigla());
				System.out.println("=============================================" + "\n");
				contagem1++;
			} else if (numeroCandidato == 13) {
				System.out.println("============ |CANDIDATO SELECIONADO| ===========");
				System.out.println("NÚMERO: " + candidato2.getNumero() + " || " + "NOME: " + candidato2.getNome());
				System.out.println("PARTIDO: " + candidato2.getPartido() + " || " + "SIGLA: " + candidato2.getSigla());
				System.out.println("=================================================" + "\n");
				contagem2++;
			} else {
				System.out.println("ATENÇÃO " + "NÚMERO INVÁLIDO E ESSE VOTO SERÁ NULO. CONFIRMAR? 1 PARA SIM OU 2 PARA NÃO");
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

		// Votos Válidos
		votosValidos = eleitoresVotantes - votoNulo;
		
		// Contagem Final
		System.out.println("============= RESULTADO FINAL ==============");
		System.out.println("Total de Eleitores da Sessão: " + quantidadeEleitores);
		System.out.println("Eleitores Que Votaram: " + eleitoresVotantes);
		System.out.println("Votos Válidos: " + votosValidos);
		System.out.println("Votos Nulos: " + votoNulo);
		System.out.println("Eleitores Indecisos Ou Que Não Votaram: " + eleitoresFaltantes);
		System.out.println("============================================");
		
		
	}

}
