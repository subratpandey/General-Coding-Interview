/**
 * @author GGPAUE
 * 
 * Given an integer array, find pairs in an array which sum up to a given number. 
 * For example: Array{4,5,1,3,2} and required sum=6 then output should be [1,5] and [2,4].
 * 
 */

import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> findPairs(int[] nums, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		if(nums == null || nums.length < 2) return null;
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		while(i < j) {
			if(nums[i] + nums[j] == target) {
				ArrayList<Integer> item = new ArrayList<Integer>();
				item.add(nums[i]);
				item.add(nums[j]);
				result.add(item);
				i++;
				j--;
				
				
			} else if(nums[i] + nums[j] < target) {
				i++;
			} else if(nums[i] + nums[j] > target) {
				j--;
			}
		}
		return result;	
	}
	
	public static void main(String[] args) {
		int[] nums = {4, 5, 5, 1, 3, 2};
		System.out.println(findPairs(nums, 6));
	}
}
