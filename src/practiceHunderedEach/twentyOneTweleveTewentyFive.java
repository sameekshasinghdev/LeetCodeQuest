package practiceHunderedEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class twentyOneTweleveTewentyFive {

	public static void main(String[] args) {
//		🔥 ARRAY QUESTIONS MASTER LIST (100+)
//		🟢 LEVEL 1: BASIC ARRAY QUESTIONS (Must-Do) — 25 Questions
//
//		These are non-negotiable. Interview rejection happens here.
//		1. Find maximum and minimum element
		int[] arr = { 2, 4, 1, 7, 5 };
		findMinMax(arr);
//
//		2. Reverse an array
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println("Reversed Array : " + Arrays.toString(reverseArray(arr1)));
//		3. Find sum of array elements
		int[] arr2 = { 10, 5, 20, 8, 9 };
		System.out.println("Sum of all elements of array : " + sumOfAllElements(arr2));
//		4. Find average of array
		System.out.println("Average of Array : " + averageOfArray(arr2));
//		5. Find second largest element
		System.out.println("Second Largest element : " + secondLargestElement(arr2));
//		6. Find second smallest element
		System.out.println("Second Smallest element : " + secondSmallestElement(arr2));
//		7. Check if array is sorted
		System.out.println("Check if Array is sorted : " + checkSort(arr1));
//		8. Count even and odd numbers
		countEvenOdd(arr2);
//		9. Find number of occurrences of an element
		int[] arr3 = { 1, 2, 2, 3, 1 };
		System.out.println("frequency of elements : " + freqOfEle(arr3));
//		10. Copy elements from one array to another
		System.out.println("Copied Array: " + Arrays.toString(copyElement(arr3)));

//		11. Print array elements at even positions
		System.out.println("Elements at Even Position : " + Arrays.toString(evenPos(arr2)));
//		12. Print array elements at odd positions
		System.out.println("Elements at Odd Position : " + Arrays.toString(oddPos(arr2)));
//		13. Remove duplicate elements (unsorted)
		int[] arr4 = { 4, 2, 4, 5, 2, 3, 1 };
		System.out.println("Remove duplicate elements(unsorted) : " + Arrays.toString(rmvDuplicatesUnSort(arr4)));
//		14. Remove duplicate elements (sorted)
		int[] arr5 = { 1, 1, 2, 2, 3, 3, 4 };
		System.out.println("Remove duplicate elements(sorted) : " + Arrays.toString(rmvDuplicatesSort(arr5)));
//		15. Find largest three elements
		int[] arr6 = { 10, 4, 3, 50, 23, 90 };

//		16. Rotate array left by 1
		int k = 1;
		System.out.println("Rotate array left by 1 : " + Arrays.toString(rotateArrayByLeft(arr1, k)));
//		17. Rotate array right by 1
		// int m=1;
		System.out.println("Rotate array right by 1 : " + Arrays.toString(rotateArrayByRight(arr1, k)));

//		18. Merge two arrays
		int[] a1 = { 1, 3, 5, 9, 8, 3 };
		int[] a2 = { 2, 4, 6 };
		System.out.println("Merge two arrays : " + Arrays.toString(mergeArray(a1, a2)));
//		19. Find missing number (1 to N)
		// int N=5;
		int[] a3 = { 1, 2, 4, 5 };
		System.out.println("Find missing number (1 to 5) : " + findMissingNumber(a3));
//
//		***20. Replace every element with greatest element on right side
		int[] ar = { 16, 17, 4, 3, 5, 2 };
		System.out.println("Replace every element with greatest element on right side : "
				+ Arrays.toString(replaceWithGreatestOnRight(ar)));
//		21. Count frequency of elements
		System.out.println("Count frequency of elements : " + freqOfEle(arr3));
//		22. Find index of an element
		int[] a4 = { 10, 20, 30, 40 };
		int elem = 30;
		System.out.println("Find index of an element 30 : " + findIndexOfEl(a4, elem));
//		***23. Print unique elements
		int[] a5 = { 1, 2, 2, 3, 4, 4, 5 };
		System.out.println("Unique Elements : " + Arrays.toString(printUnique(a5)));
//		24. Check if two arrays are equal
		int[] a6 = { 1, 2, 3 };
		int[] a7 = { 3, 2, 1 };
		System.out.println("Check if two arrays are equal : " + areArraysEqual(a6, a7));
//		25. Find smallest element

//		🟡 LEVEL 2: INTERMEDIATE ARRAY QUESTIONS — 30 Questions
//
//		These show thinking ability (expected for 4+ yrs).
//
//		26.Two Pointer / Logic
//		27.Move all zeros to end
		int[] inputArr = { 0, 1, 0, 3, 12 };

		System.out.println("Move all zeros to end : " + Arrays.toString(moveAllZerosToEnd(inputArr)));
//		28.Move all negatives to one side
		int[] InputArr1 = { 1, -2, 3, -4, -1, 4 };
		// Output: [-2,-4,-1,1,3,4] (order not mandatory unless specified)
		System.out.println("Move all negatives to one side : " + Arrays.toString(moveAllNegativeToOneSide(InputArr1)));
//		29.Sort 0s, 1s, 2s (Dutch National Flag)
		int[] inputArr2 = { 2, 0, 2, 1, 1, 0 };
//		Output: [0,0,1,1,2,2]
		System.out.println("Sort 0s, 1s, 2s (Dutch National Flag) : " + Arrays.toString(dutchNationalFlag(inputArr2)));
//		30.Reverse array in groups of size K
		int[] inputArr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int v = 3;
		System.out.println("Reverse array in groups of size v : " + Arrays.toString(reverseArrayInGroup(inputArr3, v)));
//		31.Separate even and odd numbers
		System.out.println("Seperate even and odd numbers : " + Arrays.toString(seperateEvenOdd(inputArr3)));
//		32.Searching / Counting
		int[] inputArr4 = { 1, 2, 2, 2, 3, 4 };
		int search = 2;
		System.out.println("Count = " + countOccuernce(inputArr4, search));
//		33.Find duplicate number
		int[] inputArr5 = { 1, 3, 4, 2, 2 };
		System.out.println("Fnd duplicate number : " + findDuplicateNumber(inputArr5));
//		34.Find all duplicates
		int[] inputArr6 = { 1, 2, 3, 1, 3, 6, 6 };
		System.out.println("Fnd all duplicate number : " + Arrays.toString(findAllDuplicateNumber(inputArr6)));
//		35.Find first repeating element
		int[] inputArr7 = {10,5,3,4,3,5,6};
				//**Output:** `5`
		System.out.println("Find first repeating element : "+findFirstRepeateEl(inputArr7));
//		36.Find first non-repeating element
		int[] inputArr8 = {9,4,9,6,7,4};
		System.out.println("Find first non-repeating element : "+findFirstNonRepeatingEl(inputArr8));
//		37.Find majority element (n/2)
		int[] inputArr9 = {2,2,1,2,3,2,2};
		System.out.println("Find majority element (n/2) : "+findMajorityElHalfLen(inputArr9));
//		38.Count pairs with given sum
		int[] inpArr1 = {1,5,7,-1,5};
		int sum = 6;
		System.out.println("Count pairs with given sum : ");
		countPairSum(inpArr1,sum);
		
//		39.Subarray Basics
//		40.Maximum subarray sum (Kadane’s Algorithm)
//		41.Find subarray with given sum (positive numbers)
//		42.Find subarray with given sum (including negatives)
//		43.Longest subarray with sum K
//		44.Rotation & Rearrangement
//		45.Rotate array by K positions
//		46.Rearrange array alternatively (max, min)
//		47.Rearrange positive and negative numbers alternately
//		48.Find equilibrium index
//		49.Leaders in an array
//		50.Sorting & Comparison
//		51.Sort array without using sort
//		52.Find minimum number of swaps required to sort array
//		53.Check if array can be sorted by swapping two elements
//		54.Find common elements in 3 sorted arrays
//		55.Find intersection of two arrays
//		56.Find union of two arrays
//		57.Check if array is subset of another array
//		58.Find pair with minimum difference
//		59.Find triplet with given sum
//		60.Find all pairs with difference K

//		🟠 LEVEL 3: ADVANCED (Frequently Asked in Product Companies) — 25 Questions
//		61.	Sliding Window
//		62.	Maximum sum subarray of size K
//		63.	First negative number in every window of size K
//		64.	Count distinct elements in every window
//		65.	Maximum of all subarrays of size K
//		66.	Longest subarray with at most K distinct elements
//		67.	Prefix Sum
//		68.	Range sum queries
//		69.	Find subarray with sum zero
//		70.	Count subarrays with sum K
//		71.	Find equilibrium point using prefix sum
//		72.	Hashing Based
//		73.	Two Sum problem
//		74.	Three Sum problem
//		75.	Four Sum problem
//		76.	Longest consecutive subsequence
//		77.	Check if array contains duplicates within K distance
//		78.	Matrix / 2D Arrays
//		79.	Search element in sorted 2D matrix
//		80.	Spiral traversal of matrix
//		81.	Rotate matrix by 90 degrees
//		82.	Print matrix in zig-zag form
//		83.	Find row with maximum 1s
//		84.	Greedy / Optimization
//		85.	Buy and sell stock (one transaction)
//		86.	Buy and sell stock (multiple transactions)
//		87.	Trapping rain water
//		88.	Container with most water
//		89.	Chocolate distribution problem
//		90.	Minimum platforms problem

//		🔴 LEVEL 4: EXPERT / SYSTEM THINKING (Optional but Powerful) — 15+ Questions

//		You don’t need all, but 5–7 is enough.
//		91.	Maximum product subarray
//		92.	Find missing and repeating number
//		93.	Merge intervals
//		94.	Minimum jumps to reach end
//		95.	Array partition problem
//		96.	Kth largest element
//		97.	Median of two sorted arrays
//		98.	Maximum circular subarray sum
//		99.	Count inversions in array
//		100.	Find repeating and missing elements using XOR
//		101.	Find smallest subarray with sum greater than X
//		102.	Allocate minimum number of pages
//		103.	Aggressive cows problem
//		104.	Find peak element
//		105.	Maximum length bitonic subarray
//		106.	Majority element (n/3)
//		107.	Split array largest sum
//		108.	Subarray product less than K
//		109.	Count subarrays with equal 0s and 1s
//		110.	Find minimum in rotated sorted array
//		111.	Search in rotated sorted array
//		112.	Find floor and ceil of element
//		113.	Kth smallest element
//		114.	Maximum difference (j > i)

	}

	private static void countPairSum(int[] inpArr1, int sum) {
		// TODO Auto-generated method stub
		if (inpArr1 == null || inpArr1.length == 0) {
			//return -1; // Handle null or empty array
			System.out.println("array is empty");
		}
		
		boolean found = false;
		for(int i=0; i<inpArr1.length-1;i++) {
			for(int j = i+1; j < inpArr1.length; j++) {
				if ((inpArr1[i] +inpArr1[j])==sum) {
                   System.out.print("("+ inpArr1[i]+","+inpArr1[j]+")"+",");
                   found= true;
                }
			}
		}
		if (!found) System.out.print("No pairs found");
	    System.out.println();
		//return 0;
	    
	    //using hash map
//	    Map<Integer, Integer> freq = new HashMap<>();
//	    for(int num: inpArr1) {
//	    	int target = sum -num;
//	    	if (freq.getOrDefault(target, 0) > 0) {
//	            System.out.println("(" + num + "," + target + ")");
//	            freq.put(target, freq.get(target) - 1);
//	        } else {
//	            freq.put(num, freq.getOrDefault(num, 0) + 1);
//	        }
//	    }
	    
	    //using list
//	    List<String> pairs = new ArrayList<>();
//	    for (int i = 0; i < inpArr1.length - 1; i++) {
//	        for (int j = i + 1; j < inpArr1.length; j++) {
//	            if (inpArr1[i] + inpArr1[j] == sum) {
//	                pairs.add("(" + inpArr1[i] + "," + inpArr1[j] + ")");
//	            }
//	        }
//	    }
//
//	    if (pairs.isEmpty()) {
//	        System.out.println("No pairs found");
//	    } else {
//	        System.out.println(String.join(", ", pairs));
//	    }
	}

	private static int findMajorityElHalfLen(int[] inputArr9) {
		// TODO Auto-generated method stub
		if (inputArr9 == null || inputArr9.length == 0) {
			return -1; // Handle null or empty array
		}
		int n = inputArr9.length;
		int k = n/2;
		int count =0;
		Map<Integer, Integer> countMap = new HashMap<>();
		for(int num : inputArr9) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
			if(countMap.get(num)>k) {
				return num;
			}
		}
		return -1;
	}

	private static int findFirstNonRepeatingEl(int[] inputArr8) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> freq = new LinkedHashMap<>();

	    for (int num : inputArr8) {
	        freq.put(num, freq.getOrDefault(num, 0) + 1);
	    }

	    for (int num : inputArr8) {
	        if (freq.get(num) == 1) {
	            return num;
	        }
	    }
	    return -1;
	}

	private static int findFirstRepeateEl(int[] inputArr7) {
		// TODO Auto-generated method stub
		if (inputArr7 == null || inputArr7.length == 0) {
			return -1; // Handle null or empty array
		}
		else {
			Set<Integer> uniqueSet = new HashSet<Integer>();
			for(int num:inputArr7) {
				if(uniqueSet.contains(num)) {
					return num;
				}
				else {
					uniqueSet.add(num);
				}
			}
		}
		return 0;
	}

	private static int[] findAllDuplicateNumber(int[] inputArr6) {
		// TODO Auto-generated method stub
		if (inputArr6 == null || inputArr6.length == 0) {
			return null; // Handle null or empty array
		}
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> duplicates = new ArrayList<>();
		
		for (int num : inputArr6) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				// Print the key with max value
				duplicates.add(entry.getKey());
			}
		}
		int[] result = new int[duplicates.size()];
		for(int i=0;i<duplicates.size();i++) {
			result[i]=duplicates.get(i);
		}
		return result;

	}

	private static int findDuplicateNumber(int[] inputArr5) {
		// TODO Auto-generated method stub
		if (inputArr5 == null || inputArr5.length == 0) {
			return 0; // Handle null or empty array
		}
		int key = 0;
		Map<Integer, Integer> map = freqOfEle(inputArr5);
		// int maxValueInMap = (Collections.max(map.values()));
		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				// Print the key with max value
				key = entry.getKey();
			}
		}
		;
		// for()
		return key;
	}

	private static int countOccuernce(int[] inputArr4, int search) {
		// TODO Auto-generated method stub
		if (inputArr4 == null || inputArr4.length == 0) {
			return 0; // Handle null or empty array
		}
		int count = 0;
		for (int num : inputArr4) {
			if (num == search) {
				count++;
			}
		}
		return count;
	}

	private static int[] seperateEvenOdd(int[] inputArr3) {
		// TODO Auto-generated method stub
		if (inputArr3 == null || inputArr3.length == 0) {
			return null; // Handle null or empty array
		}
		int[] result = new int[inputArr3.length];
		int left = 0;
		int right = inputArr3.length - 1;

		for (int num : inputArr3) {
			if (num % 2 == 0) {
				// nonZeroIndex++;
				result[left++] = num;
			} else {
				// int positiveIndex =inputArr1.length-negativeIndex;
				result[right--] = num;
			}
		}
		return result;
	}

	private static int[] reverseArrayInGroup(int[] inputArr3, int v) {
		// TODO Auto-generated method stub
		if (inputArr3 == null || inputArr3.length == 0) {
			return null; // Handle null or empty array
		}
		int n = inputArr3.length;
		for (int i = 0; i < n; i += v) {
			int left = i;
			int right = Math.min(i + v - 1, n - 1);
			while (left < right) {
				int temp = inputArr3[left];
				inputArr3[left] = inputArr3[right];
				inputArr3[right] = temp;
				left++;
				right--;
			}
		}
		return inputArr3;
	}

	private static int[] dutchNationalFlag(int[] inputArr2) {
		// TODO Auto-generated method stub
		if (inputArr2 == null || inputArr2.length == 0) {
			return null; // Handle null or empty array
		}
		int[] result = new int[inputArr2.length];
		int left = 0;
		int right = inputArr2.length - 1;
		while (left < right) {
			if (left < right) {
				int temp = inputArr2[left];
				inputArr2[left] = inputArr2[right];
				inputArr2[right] = temp;
				left++;
				right--;
			}
		}
		return inputArr2;
	}

	private static int[] moveAllNegativeToOneSide(int[] inputArr1) {
		// TODO Auto-generated method stub
		// InputArr1= {1,-2,3,-4,-1,4}
		if (inputArr1 == null || inputArr1.length == 0) {
			return null; // Handle null or empty array
		}
		int[] result = new int[inputArr1.length];
		int left = 0;
		int right = inputArr1.length - 1;

		for (int num : inputArr1) {
			if (num < 0) {
				// nonZeroIndex++;
				result[left++] = num;
			} else {
				// int positiveIndex =inputArr1.length-negativeIndex;
				result[right--] = num;
			}
		}
		// [2, -4, -1, -4, -1, 4]

		return result;
	}

	private static int[] moveAllZerosToEnd(int[] inputArr) {
		// TODO Auto-generated method stub
		// output: Output: [1,3,12,0,0]
		if (inputArr == null || inputArr.length == 0) {
			return null; // Handle null or empty array
		}

		int nonZeroIndex = 0;

		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] != 0) {
				// nonZeroIndex++;
				inputArr[nonZeroIndex++] = inputArr[i];
			}
		}

		while (nonZeroIndex < inputArr.length) {
			inputArr[nonZeroIndex++] = 0;
		}

		return inputArr;
	}

	private static int[] replaceWithGreatestOnRight(int[] ar) {
		if (ar == null || ar.length == 0) {
			return ar;
		}

		int maxRight = -1;

		for (int i = ar.length - 1; i >= 0; i--) {
			int temp = ar[i];
			ar[i] = maxRight;
			if (temp > maxRight) {
				maxRight = temp;
			}
		}
		return ar;
	}

	private static boolean areArraysEqual(int[] a6, int[] a7) {
		// TODO Auto-generated method stub
		if (a6 == null || a7 == null) {
			return false;
		}

		if (a6.length != a7.length) {
			return false;
		}

		for (int i = 0; i < a6.length; i++) {
			if (a6[i] != a7[i]) {
				return false;
			}
		}
		return true;

	}

	private static int[] printUnique(int[] a5) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : a5) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}

		int count = 0;
		for (int num : freq.keySet()) {
			if (freq.get(num) == 1)
				count++;
		}

		int[] result = new int[count];
		int idx = 0;
		for (int num : a5) {
			if (freq.get(num) == 1) {
				result[idx++] = num;
			}
		}
		return result;
	}

	private static int findIndexOfEl(int[] a4, int elem) {
		// TODO Auto-generated method stub
		if (a4 == null || a4.length == 0) {
			// System.out.println("The array is empty.Q17");
			return -1;
		}
		for (int i = 0; i < a4.length; i++) {
			if (a4[i] == elem) {
				return i;
			}
		}
		return -1;
	}

	private static int findMissingNumber(int[] arr1) {
		// TODO Auto-generated method stub
		if (arr1 == null || arr1.length == 0) {
			return -1;
		}
//		int j=1;
//		Arrays.sort(arr1);
//		for(int i=0;i<arr1.length-1;i++) {
//			if(arr1[i]!=j) {
//				
//				break;
//			}
//			j++;
//			
//			
//		}

		int n = arr1.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : arr1) {
			actualSum = actualSum + num;
		}
		int result = expectedSum - actualSum;

		// return j;
		return result;

	}

	private static int[] mergeArray(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		if (a1 == null || a1.length == 0) {
			// System.out.println("The array is empty.Q17");
			return a2;
		} else if (a2 == null || a2.length == 0) {
			return a1;
		} else if (a2 == null && a1 == null || a2.length == 0 && a1.length == 0) {
			System.out.println("Array are empty");
			return null;
		}
		int len = a1.length + a2.length;
		int[] newarr = new int[len];
//		newarr = Arrays.copyOf(a1, len);
		for (int i = 0; i < a1.length; i++) {
			newarr[i] = a1[i];
		}
		for (int j = 0; j < a2.length; j++) {
			newarr[a1.length + j] = a2[j];
		}

//		for(int num: a2) {
//			copyElement(newarr)
//		}
		return newarr;
	}

	private static int[] rotateArrayByRight(int[] arr1, int k) {
		// TODO Auto-generated method stub
		if (arr1 == null || arr1.length == 0) {
			// System.out.println("The array is empty.Q17");
			return null;
		}
//		int[] rotatedArr = new int [arr1.length];
//		int n=arr1.length;
//		int j=0;
//		for(int i=n;i>=1;i--) {
//			rotatedArr[j]= arr1[n-(n-i)];
//			j++;
//		}
//		return rotatedArr;

		int n = arr1.length;
		int[] res = new int[n];

		res[0] = arr1[n - 1];
		for (int i = 1; i < n; i++) {
			res[i] = arr1[i - 1];
		}
		return res;
	}

	private static int[] rotateArrayByLeft(int[] arr1, int k) {
		// TODO Auto-generated method stub
		if (arr1 == null || arr1.length == 0) {
			// System.out.println("The array is empty.Q16");
			return null;
		}
		int[] rotatedArr = new int[arr1.length];
		int n = arr1.length;
		for (int i = 0; i < n; i++) {
			rotatedArr[i] = arr1[(i + k) % n];
		}
		return rotatedArr;
	}

	private static int[] rmvDuplicatesSort(int[] arr5) {
		// TODO Auto-generated method stub
		Arrays.sort(arr5);
		// Step 2: Use a temporary array to store unique elements
		int[] temp = new int[arr5.length];
		int j = 0;

		// Always add the first element
		temp[j++] = arr5[0];

		// Compare each element with the previous one
		for (int i = 1; i < arr5.length; i++) {
			if (arr5[i] != arr5[i - 1]) {
				temp[j++] = arr5[i];
			}
		}

		// Step 3: Copy unique elements into a new array of correct size
		return Arrays.copyOf(temp, j);
	}

	private static int[] rmvDuplicatesUnSort(int[] arr4) {
		// TODO Auto-generated method stub
		if (arr4 == null || arr4.length == 0) {
			return null;
		}
		LinkedHashSet<Integer> sortArr = new LinkedHashSet<>();
		for (int num : arr4) {
			sortArr.add(num);
		}
		int[] result = new int[sortArr.size()];
		int index = 0;
		for (int num : sortArr) {
			result[index++] = num;
		}
		return result;
	}

	private static int[] oddPos(int[] arr2) {
		// TODO Auto-generated method stub
		int l;
		if (arr2.length % 2 == 0) {
			l = arr2.length / 2;
		} else {
			l = (arr2.length / 2) + 1;
		}
		int[] oddArr = new int[l];
		if (arr2 == null || arr2.length == 0) {
			return null;
		} else {

			int j = 0;
			for (int i = 0; i <= arr2.length - 1; i++) {
				if ((i + 1) % 2 != 0) {
					oddArr[j] = arr2[i];
					j++;
				}
			}
		}
		return oddArr;
	}

	private static int[] evenPos(int[] arr2) {
		// TODO Auto-generated method stub
//		int l;
//		if(arr2.length%2==0) {
//			l=arr2.length/2;
//		}
//		else {
//			l=(arr2.length/2)+1;
//		}
		int[] evenArr = new int[arr2.length / 2];
		if (arr2 == null || arr2.length == 0) {
			return null;
		} else {

			int j = 0;
			for (int i = 0; i <= arr2.length - 1; i++) {
				if ((i + 1) % 2 == 0) {
					evenArr[j] = arr2[i];
					j++;
				}
			}
		}
		return evenArr;
	}

	private static int[] copyElement(int[] arr3) {
		// TODO Auto-generated method stub
		int[] copyArray = new int[arr3.length];

		for (int i = 0; i < arr3.length; i++) {
			copyArray[i] = arr3[i];
		}
		return copyArray;
	}

	private static Map<Integer, Integer> freqOfEle(int[] arr3) {
		// TODO Auto-generated method stub
		if (arr3 == null || arr3.length == 0) {
			// System.out.println("The array is empty.Q8");
			return null;
		} else {
			Map<Integer, Integer> freq = new HashMap<>();
			for (int num : arr3) {
				freq.put(num, freq.getOrDefault(num, 0) + 1);
			}
			return freq;
		}
	}

	private static void countEvenOdd(int[] arr2) {
		// TODO Auto-generated method stub
		if (arr2 == null || arr2.length == 0) {
			System.out.println("The array is empty.Q8");
		}
		int countEven = 0, countOdd = 0;
		for (int num : arr2) {
			if (num % 2 == 0) {
				countEven += 1;
			} else if (num % 2 != 0) {
				countOdd += 1;
			}
		}
		System.out.println("Even Numbers Count : " + countEven + " and Odd Numbers Count : " + countOdd);
	}

	private static boolean checkSort(int[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
		if (n <= 1)
			return true;
		else {
			for (int i = 1; i < n; i++) {
				if (arr1[i] < arr1[i - 1]) {
					return false;
				}
			}

		}
		return true;
	}

	private static int secondSmallestElement(int[] arr2) {
		// TODO Auto-generated method stub
		if (arr2 == null || arr2.length == 0) {
			// System.out.println("The array is empty.Q5");
			return -1;
		} else {
			int n = arr2.length;
			int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
			for (int num : arr2) {
				if (num < smallest) {
					smallest = num;

				} else if (num > smallest && num < secondSmallest) {
					secondSmallest = num;
				}
			}
			return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
		}
	}

	private static int secondLargestElement(int[] arr2) {
		// TODO Auto-generated method stub
		if (arr2 == null || arr2.length == 0) {
			System.out.println("The array is empty.Q4");
			return -1;
		} else {
			int n = arr2.length;

			// int secondlargest = -1, largest = -1;
			int secondlargest = Integer.MIN_VALUE, largest = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				if (arr2[i] > largest) {
					secondlargest = largest;
					largest = arr2[i];
				} else if (arr2[i] < largest && arr2[i] > secondlargest) {
					secondlargest = arr2[i];
				}
			}

			return secondlargest;
		}
	}

	private static int averageOfArray(int[] arr2) {
		// TODO Auto-generated method stub
		if (arr2 == null || arr2.length == 0) {
			return 0;
		} else {
			int l = arr2.length;

			int sum = sumOfAllElements(arr2);
			int average = sum / l;
			return average;
		}
	}

	private static int sumOfAllElements(int[] arr2) {
		// TODO Auto-generated method stub
		if (arr2 == null || arr2.length == 0)
			return 0;
		else {
			int sum = 0;
			for (int i : arr2) {
				sum = sum + i;
			}
			return sum;
		}
	}

	private static int[] reverseArray(int[] arr1) {
		// TODO Auto-generated method stub
		int[] newArr = new int[arr1.length];
		if (arr1 == null || arr1.length == 0) {
			System.out.println("The array is empty.");
		}
		for (int i = arr1.length - 1; i >= 0; i--) {
			newArr[newArr.length - i - 1] = arr1[i];
		}
		return newArr;
	}

	private static void findMinMax(int[] arr) {
		// TODO Auto-generated method stub
		int Min = arr[0], Max = arr[0];
		if (arr == null || arr.length == 0) {
			System.out.println("The array is empty.");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (Min > arr[i]) {
					Min = arr[i];
				} else if (Max < arr[i]) {
					Max = arr[i];
				}
			}
			System.out.println("Maximum : " + Max + " and Minimum : " + Min);
		}
	}
}
