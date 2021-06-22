
import espacoDeEstados.*;
import estrategiasDeBusca.heuristica.*;
import estrategiasDeBusca.cega.*;

import java.util.List;
import java.util.Scanner;

import Buscas.BuscaCega.Largura;
import Buscas.BuscaCega.Profundidade;
import Buscas.BuscaCega.ProfundidadeIterativa;
import Buscas.BuscaCega.ProfundidadeLimitada;
import Buscas.BuscaIterativa.Asterisco;
import Buscas.BuscaIterativa.EscalaDeColina;
import Buscas.BuscaIterativa.MelhorPrimeiro;

import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// System.out.println("Shaolin matador de porco!");
		// novo
		String escolha = "n";

		while("n".equals(escolha)){
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		
		System.out.println("\n\t.:Menu de Busca:.\n");
		System.out.println("1.Busca Cega.");
		System.out.println("2.Busca Informada.");
		System.out.print("\nDigite a Opcao: ");
		opcao = sc.nextInt();
		
		if(opcao == 1) {	
			System.out.println("\n1.Busca em Profundidade.");	
			System.out.println("2.Busca em Largura.");	
			System.out.println("3.Busca em Profundidade Limitada.");	
			System.out.println("4.Busca em Profundidade Iterativa.");	
			System.out.println("5.Voltar.");	
			System.out.print("\nDigite a Opcao: ");	
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("\n.:Busca em Profundidade:.");

				Profundidade p = new Profundidade();	
				p.profundidade();

				// System.out.println("Shaolin matador de porco!");
			}else if(opcao == 2) {
				System.out.println("\n.:Busca em Largura:.");	
				
				Largura l = new Largura();
				l.largura();
				
			}else if(opcao == 3) {
				System.out.println("\n.:Busca em Profundidade Limitada:.");
				
				ProfundidadeLimitada pl = new ProfundidadeLimitada();
				pl.profundidadeLimitada();
				
			}else if(opcao == 4) {
				System.out.println("\n.:Busca em Profundidade Iterativa:.");

				ProfundidadeIterativa pi = new ProfundidadeIterativa();
				pi.profundidadeIterativa();

			}else if(opcao == 5) {
				Main.main(args);		
			}else{
				System.out.println("\nOpcao invalida!");	
				Main.main(args);		
			}
		}else if (opcao == 2) {
			System.out.println("\n1.Busca Hill Climbing.");	
			System.out.println("2.Busca A*.");	
			System.out.println("3.Busca Best First ou busca Bidirecional.");	
			System.out.println("4.Voltar.");	
			System.out.print("\nDigite a Opcao: ");	
			opcao = sc.nextInt();
			// System.out.println("Loro quer biscoito!");	
			
			if(opcao == 1){
				System.out.println("\n.:Hill Climbing:.");	
				
				EscalaDeColina ec = new EscalaDeColina();
				ec.escalaDeColina();
				
			}else if(opcao == 2){
				System.out.println("\n.:A*:.");	

				Asterisco as = new Asterisco();
				as.asterisco();
				
			}else if(opcao == 3){
				System.out.println("\n.:Best First ou Busca Bidirecional:.");	

				MelhorPrimeiro mp = new MelhorPrimeiro();
				mp.melhorPrimeiro();
				
			}else if(opcao == 4){
				// System.out.println("Shaolin matador de porco!");	
				Main.main(args);		
			}else{
				System.out.println("\nOpcao invalida!");	
				Main.main(args);		
			}
		}else {
			System.out.println("\nOpcao invalida!");
			// Main.main(args);
		}
		
		System.out.print("\nDeseja Sair (s/n) ? ");
		escolha = sc.next();
		
		}
	}
}
