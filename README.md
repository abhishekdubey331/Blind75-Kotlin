# Blind 75 LeetCode Questions

This repository contains solutions to the Blind 75 LeetCode questions. The Blind 75 list is a curated collection of 75 LeetCode questions that are frequently asked in technical interviews at major tech companies. These questions cover a wide range of topics, including arrays, strings, linked lists, binary trees, dynamic programming, and more.

## Introduction

The Blind 75 LeetCode Questions list is an invaluable resource for anyone preparing for technical interviews or looking to improve their problem-solving skills. By solving these questions and understanding their solutions, you can gain a deeper understanding of common algorithms and data structures used in software development.

## Blind 75 Questions and Solutions

### Array
1. [Two Sum](https://leetcode.com/problems/two-sum/description/)  

   Given an array of integer nums and an integer target, return indices of the two numbers such that they add up to the target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.  
   Example:-  
   Input: nums = [ 2, 7, 11, 15 ], target = 9  
   Output: [ 0, 1 ]  
   Explanation: Because nums[ 0 ] + nums[ 1 ] == 9, we return [ 0, 1 ].  

   #### Solution 1:- Brute Force  
   Here we have an array, nums = [ 1, 8, 2, 15, 5 ], target = 13      
   Step 1 -> 13 - 1 = 12, check 12 exists or not in nums -> In this case not exits    
   Step 2 -> 13 - 8 = 5, check 5 exists or not in numbs -> In this case exits.  
   Step 3 -> Return [1, 4]
   Time complexity is O(n2)  

   #### Solution 2:-
   Here we have an array, nums = [1, 8, 2, 15, 5], target = 13
   Step 1 -> Sort the array, nums = [1, 2, 5, 8, 15]
   Step 2 -> 13 - 1 = 12 -> Do binary search on nums -> Check 12 exit or not
   Step 3 -> 13 - 8 = 5 -> Do binary search on nums -> Check 5 exit or not -> Exiting
   Step 4 -> Return [1, 4]
   Time Complexity in 0(nLogn) because logn for sorting

   #### Solution 3:-
   Here we have an array, nums = [1, 8, 2, 15, 5], target = 13  
   Step 1 -> Create a hashMap to store value and index  
   | Key      | Value |
   |----------|----------|

   Step 2:- 13 - 1 = 12 -> Check 12, exists or not in this hashMap -> Not exits
   Store the value and index in hashMap  
   | Key      | Value    |  
   |----------|----------|
   |    1     |     0    |
   
   Step 3:- 13 - 8 = 5 -> Check 5, exists or not in this hasMap -> Not exists
   Store the value and index in hashMap  
   | Key      | Value    |  
   |----------|----------|
   |    1     |     0    |
   |    8     |     1    |
   
   Step 4: 13 - 2 = Check 11, exists or not in this hasMap -> Not exists
   Store the value and index in hashMap  
   | Key      | Value    |  
   |----------|----------|
   |    1     |     0    |
   |    8     |     1    |
   |    2     |     2    |

   Step 5: 13 - 15 = Check -2, exists or not in this hasMap -> Not exists
   Store the value and index in hashMap
   | Key      | Value    |  
   |----------|----------|
   |    1     |     0    |
   |    8     |     1    |
   |    2     |     2    |
   |    15     |     3    |

   Step 6: 13 - 5 = Check 8, exists or not in this hasMap -> exists
   | Key      | Value    |  
   |----------|----------|
   |    1     |     0    |
   |    8     |     1    |
   |    2     |     2    |
   |    15     |     3    |

   Return the index of 8 that is 1, and return the index of 5 that is 4  
   Return [1, 4]  
   Time Complexity O(n)  
   Space Complexity O(n)  
   Solution:- [TwoSum](https://github.com/shyakdas/Blind75-Kotlin/blob/main/src/array/Q1TwoSum.kt)
 
3. [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
4. [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/)
5. [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/)
6. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/)
7. [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/description/)
8. [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/)
9. [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)
10. [3 Sum](https://leetcode.com/problems/3sum/description/)
11. [Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)

### Binary
1. [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/description/)
2. [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/description/)
3. [Counting Bits](https://leetcode.com/problems/counting-bits/description/)
4. [Missing Number](https://leetcode.com/problems/missing-number/description/)
5. [Reverse Bits](https://leetcode.com/problems/reverse-bits/description/)

### Dynamic Programming
1. [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/description/)
2. [Coin Change](https://leetcode.com/problems/coin-change/description/)
3. [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/description/)
4. [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/description/)
5. [Word Break Problem](https://leetcode.com/problems/word-break/description/)
6. [Combination Sum](https://leetcode.com/problems/combination-sum-iv/description/)
7. [House Robber](https://leetcode.com/problems/house-robber/description/)
8. [House Robber II](https://leetcode.com/problems/house-robber-ii/description/)
9. [Decode Ways](https://leetcode.com/problems/decode-ways/description/)
10. [Unique Paths](https://leetcode.com/problems/unique-paths/description/)
11. [Jump Game](https://leetcode.com/problems/jump-game/description/)

### Graph
1. [Clone Graph](https://leetcode.com/problems/clone-graph/description/)
2. [Course Schedule]([URL](https://leetcode.com/problems/course-schedule/description/))
3. [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/description/)
4. [Number of Islands](https://leetcode.com/problems/number-of-islands/description/)
5. [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/)
6. [Alien Dictionary (Leetcode Premium)](https://leetcode.com/problems/alien-dictionary/description/)
7. [Graph Valid Tree (Leetcode Premium)](https://leetcode.com/problems/graph-valid-tree/description/)
8. [Number of Connected Components in an Undirected Graph (Leetcode Premium)](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/description/)

### Interval
1. [Insert Interval](https://leetcode.com/problems/insert-interval/description/)
2. [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/)
3. [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/description/)
4. [Meeting Rooms (Leetcode Premium)](https://leetcode.com/problems/meeting-rooms/description/)
5. [Meeting Rooms II (Leetcode Premium)](https://leetcode.com/problems/meeting-rooms-ii/description/)

### Linked List
1. [Reverse a Linked List](https://leetcode.com/problems/reverse-linked-list/description/)
2. [Detect Cycle in a Linked List](https://leetcode.com/problems/linked-list-cycle/description/)
3. [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)
4. [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/description/)
5. [Remove Nth Node From End Of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
6. [Reorder List](https://leetcode.com/problems/reorder-list/description/)

### Matrix
1. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/description/)
2. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/description/)
3. [Rotate Image](https://leetcode.com/problems/rotate-image/description/)
4. [Word Search](https://leetcode.com/problems/word-search/description/)

### String
1. [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)
2. [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/description/)
3. [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/description/)
4. [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/)
5. [Group Anagrams](https://leetcode.com/problems/group-anagrams/description/)
6. [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)
7. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)
8. [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/description/)
9. [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/description/)
10. [Encode and Decode Strings (Leetcode Premium)](https://leetcode.com/problems/encode-and-decode-strings/description/)

### Tree
1. [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)
2. [Same Tree](https://leetcode.com/problems/same-tree/description/)
3. [Invert/Flip Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/)
4. [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/description/)
5. [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/description/)
6. [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/)
7. [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/description/)
8. [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/)
9. [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/description/)
10. [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/)
11. [Lowest Common Ancestor of BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/)
12. [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/description/)
13. [Add and Search Word](https://leetcode.com/problems/design-add-and-search-words-data-structure/description/)
14. [Word Search II](https://leetcode.com/problems/word-search-ii/description/)

### Heap
1. [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/description/)
2. [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/)
3. [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/description/)

## Acknowledgments

Special thanks to the creators of the Blind 75 LeetCode Questions list for compiling such a comprehensive resource for interview preparation.
