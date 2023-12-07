package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] Arrayfinal = new int[size1 + size2];

        int i = 0;
        int j = 0; 
        int k = 0;

        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                Arrayfinal[k] = array1[i];
                i++;
            } else {
                Arrayfinal[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            Arrayfinal[k] = array1[i];
            i++;
            k++;
        }

        while (j < size2) {
            Arrayfinal[k] = array2[j];
            j++;
            k++;
        }

        return Arrayfinal;
    }
}