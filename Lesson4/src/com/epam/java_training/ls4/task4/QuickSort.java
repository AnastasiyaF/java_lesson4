/*
 * На основании суммы оценок, сортируем массив по убыванию суммы оценок.
 * Используется алгоритм quick sort:
 * 
 * getSum_rates - сумма оценок по предмету 1 абитуриента.
 */

package com.epam.java_training.ls4.task4;

public class QuickSort {
	private Abiturient[] abiturients;
	private int count_abiturients;
	
	public QuickSort(Abiturient[] abiturients) {
        
        this.abiturients = abiturients;
        count_abiturients = abiturients.length;
	}
	
	public void runSort(){
		sort( 0, this.count_abiturients - 1);
	}
	
	public Abiturient[] getAbiturients(){
		return this.abiturients;
	}

	private void sort(int low_position, int high_position) {
        int i = low_position;
        int	j = high_position;
        
        Abiturient pivot;
        Abiturient temp_abiturient;
        
        pivot = abiturients[low_position + (high_position - low_position)/2];

        while (i <= j) {
               
        	while (abiturients[i].getSum_rates() > pivot.getSum_rates()) {
        		i++;
            }
            
            while (abiturients[j].getSum_rates() < pivot.getSum_rates()) {
            	j--;
            }

            if (i <= j) {
            	temp_abiturient = abiturients[i];
                abiturients[i] = abiturients[j];
                abiturients[j] = temp_abiturient;
                
                i++;
                j--;
            }
        }

        if (low_position < j)
        	sort(low_position, j);
        if (i < high_position)
        	sort(i, high_position);
	}
	
}
