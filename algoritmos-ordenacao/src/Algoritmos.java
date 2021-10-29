import java.util.Scanner;

public class Algoritmos {
	public void inserirValores(int[] vet) {
        Scanner in = new Scanner(System.in);
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print("[" + i + "] = ");
            vet[i] = in.nextInt();
            }
        }
       
	public void insertionSort(int [] vetor) {
		int x, j;
		for(int i = 1; i < vetor.length; i++) {
			x = vetor[i];
			j = i - 1;
			while((j >= 0 && vetor[j] > x)) {
				vetor[j+ 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = x;
		}
	}
	
	public void selectionSort(int [] v) {
		for(int i = 0; i < v.length; i++) {
			int menor = i;
			for (int j = i + 1; j < v.length; j++) {
				if(v[j] < v[menor]) 
				menor = j;
			}
			//trocando as posicoes
			int aux = v[i];
			v[i] = v[menor];
			v[menor] = aux;
				
				
			}
		}
	public void mergeSort(int [] v) {
		int len = v.length;
		if(len < 2) {
			return;
		}
		
		int mid = len /2;
		int [] left = new int[mid];
		int [] right = new int[len - mid];
		for(int i = 0; i < mid ; i++) {
			left[i] = v[i];
		}
		for(int i = mid; i < len ; i++) {
			right[i - mid] = v[i];
		}
		mergeSort(left);
		mergeSort(right);
		
		//concatenar as duas metades 
		Auxiliares aux = new Auxiliares();
		aux.merge(v,left,right);
		
		
	}
	
	public void quickSort(int [] v, int esq, int dir) {
		Auxiliares aux = new Auxiliares();
		if(esq < dir) {
			int j = aux.separate(v, esq, dir);
			quickSort(v, esq, j-1);
			quickSort(v, j+1,dir);
		}
	}

	public void bubbleSort(int[] vet) { // utilizando o algoritmo BubbleSort
        int pos = 0, i, aux;
        int fim = vet.length - 1;
        boolean troca = true;
        while (troca == true) {
            troca = false;
            for (i = 0; i < fim; i++) { // passagem ou varredura
                if (vet[i] > vet[i + 1]) {
                    aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    troca = true;
                    pos = i;
                     }
                 }
            fim = pos;
               }
         }

	

	
	


		
		
}
