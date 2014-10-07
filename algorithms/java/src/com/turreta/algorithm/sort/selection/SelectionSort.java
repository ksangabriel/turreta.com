/*
 * Copyright (C) 2014 Karl San Gabriel (www.turreta.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.turreta.algorithm.sort.selection;

public class SelectionSort {
	
	public static void main(String ...strings) {
		int [] randomIntegers = { 
				8047, 40351, 48771, 60110, 91119, 17073, 
				26768, 93844, 26411, 3210, 79469, 51816, 14413, 50571, 92522, 
				47339, 80789, 63692, 10067, 36455 
				};
		
		SelectionSort sort = new SelectionSort();
		sort.sort(randomIntegers, true); // Sort by ascending order
		
		for(int i : randomIntegers) {
			System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
		
		sort.sort(randomIntegers, false);		
		for(int i : randomIntegers) { // Sort by descending order
			System.out.print(i);
			System.out.print(",");
		}		
	}	
	
	/* Sort either by ascending or descending order */
	void sort(int [] integers, boolean ascendingOrder) {
		for(int i = 0; i < integers.length; i++) {			
			int minOrMax = i;			
			for(int j = i + 1; j < integers.length; j++) {
				if(ascendingOrder ? (integers[i] < integers[j])  
						: (integers[i] > integers[j])) {
					minOrMax = j;
				}
			}			
			if(i != minOrMax) {
				int tmp = integers[i];
				integers[i] = integers[minOrMax];
				integers[minOrMax] = tmp;
			}
		}
	}
}
