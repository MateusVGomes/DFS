package com.mycompany.grafos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Grafos {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\aluno.UNICAP\\Downloads\\pequenoG.txt");
        Scanner sc = new Scanner(file);
        int matrizG[][], i, arestas, vertices;
        String temporario, numerosTemp;

        LinkedList<String> listaTexto = new LinkedList<>();
        while (sc.hasNextLine()) {
            listaTexto.add(sc.nextLine());
        }
        temporario = listaTexto.pop();
        vertices = Integer.parseInt(temporario);
        temporario = listaTexto.pop();
        arestas = Integer.parseInt(temporario);
        temporario = null;
        matrizG = new int[listaTexto.size()][2];
        for (i = 0; i < listaTexto.size(); i++) {
            int aux = 0;
            numerosTemp = "";
            temporario = listaTexto.get(i);
            int a = temporario.indexOf(" ");
            while (aux < a) {
                numerosTemp = numerosTemp + String.valueOf(temporario.charAt(aux));
                aux++;
            }
            matrizG[i][0] = Integer.parseInt(numerosTemp);
            numerosTemp = "";
            aux++;
            while (aux <= temporario.length() - 1) {
                numerosTemp = numerosTemp + String.valueOf(temporario.charAt(aux));
                aux++;
            }
            matrizG[i][1] = Integer.parseInt(numerosTemp);
        }
        sc.close();
        
    }

		public void dfs (int vertice){
			Stack <Integer> stack = new Stack <Integer>();
			int atual = 0;
			int parentIndex = vertice;
			stack.push(vertice);			
			while (!stack.empty()){
				atual = stack.pop();
                                int size=0;
                            int[] visited = null;
				if (visited[atual] == 0){
					
					for (int i=size-1 ; i >= 0 ; i--){
						
					}
				}
			}
                        ////Professor eu comecei a fazer a logica do dfs porém não cosnegui terminar, meu código recebe o arquivo inteiro e eu tava preparando para a recepção sinto muito
		}

}
