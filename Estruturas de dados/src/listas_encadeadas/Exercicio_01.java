/*
Problema: Carregar um vetor [100] real de valores de saldos.
Calcular e exibir:
- M�dia dos saldos positivos entre 100 � 1000
- M�dia geral dos saldos
- Soma dos saldos negativos
Programador: Gabriel Rocha
Data: 08/02/2019
*/

package listas_encadeadas;

import java.util.Random;

public class Exercicio_01 {
	
	public static void main(String[] args) {
		Random r = new Random();
		double vet[] = new double[100];
		double medPos = 0, medGeral = 0, somaNeg = 0, pos = 0;
		for (int i = 0; i < 100; i++) {
			vet[i] = r.nextDouble() * 2000;
			System.out.println(vet[i]);
			medGeral += vet[i] / 100;
			if (vet[i] >= 100 && vet[i] <= 1000) {
				pos++;
				medPos += vet[i];
			} else if (vet[i] < 0) {
				somaNeg += vet[i];
			}
		}
		System.out.println("M�dia dos saldos positivos entre 100 e 1000: " + medPos / pos);
		System.out.println("M�dia geral dos saldos: " + medGeral);
		System.out.println("Soma dos saldos negativos: " + somaNeg);
	}
}
