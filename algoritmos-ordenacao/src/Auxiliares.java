
public class Auxiliares {
	public void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}
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
				trocar(v,i,j);
				i++;
				j--;
			}
		}
		trocar(v,esq,j);
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
	
}
