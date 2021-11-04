
public class Auxiliares {
	
	public int separate(int[] v, int esq, int dir) {
		int i = esq + 1;
		int j = dir;
		int pivot = v[esq];
		while(i <= j) {
			if(v[i] <= pivot) {
				i++;
			}else if(v[j] > pivot) {
				j--;
			}else if(i <= j) {
				//trocando
				int aux = v[i];
				v[i] = v[j];
				v[j] = aux;
				i++;
				j--;
			}
		}
		//trocando
		int aux = v[esq];
		v[esq] = v[j];
		v[j] = aux;
		return j;
	}
	public void merge(int[] v, int [] l, int [] r) {
		int lSize = l.length;
		int rSize = r.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < lSize && j < rSize) {
			if(l[i] <= r[j]) {
				v[k] = l[i];
				i++;
			}else {
				v[k] = r[j];
				j++;
			}
			k++;
		}
		while(i < lSize) {
			v[k] = l[i];
			i++;
			k++;
		}
		while(j < rSize ) {
			v[k] = r[j];
			j++;
			k++;
		}
		
	}
	public void heapify( int v[],  int n,  int i) {
        // Encontra o maior entre raiz, o filho esquerdo e o filho direito.
        int maior = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && v[l] > v[maior])
            maior = l;

        if (r < n && v[r] > v[maior])
            maior = r;

        // faz a substituicao e continua empilhando caso a raiz nao seja o maior.
        if (maior != i) {
            int troca = v[i];
            v[i] = v[maior];
            v[maior] = troca;

            heapify(v, n, maior);
        }
    }
	
}
