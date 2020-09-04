package Ordenacao;

public class Selection_sort {
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vetor1 = new int[]{77, 99, 44, 55, 22, 88, 11, 27, 66, 33};
        System.out.println("Antes da ordena��o: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(" " + vetor1[i]);
        }
        System.out.println();
        ordenacao_bubbleSort(vetor1);
        System.out.println("Depois da ordena��o: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(" " + vetor1[i]);
        }
        System.out.println(" ");
        System.out.println("________________________________________________");
        System.out.println("Antes da ordena��o: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(" " + vetor1[i]);
        }
        System.out.println();
        ordenacao_Selection_Sort(vetor1);
        System.out.println("Depois da ordena��o: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(" " + vetor1[i]);
        }

    }

    public static void ordenacao_bubbleSort(int[] vetor) {
        int out, in;
        int nElems = vetor.length;
        int temp = 0;
        for (out = nElems - 1; out > 0; out--) // loop externo (tr�s para frente)
        {
            for (in = 0; in < out; in++) // loop interno (em frente)
            {
                if (vetor[in] > vetor[in + 1]) { // fora de ordem?
                    temp = vetor[in];
                    vetor[in] = vetor[in + 1];
                    vetor[in + 1] = temp;
                }
            }
        }
    } // fim bubbleSort()

    public static void ordenacao_Selection_Sort(int[] vetor) {
        int out, in, min, temp, temp1;
        int nElems = vetor.length;
        for (out = 0; out < nElems - 1; out++) { // loop externo
            min = out++; // minimum
            for (in = out + 1; in < nElems; in++) // loop interno
            {
                if (vetor[in] < vetor[min]) // se min � maior,
                {
                    min = in; // temos um novo m�nimo
                }// Coloca o novo m�nimo no seu lugar correto no vetor
            }
            temp = vetor[out-1];
            vetor[out-1] = vetor[min];
            vetor[min] = temp;
            
            
        } // fim do la�o externo
    } // fim do selectionSort()
}
