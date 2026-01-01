# Plus One – Java Array Problem (2026-01-01)

This repository contains a Java solution for the **Plus One** problem, where a number is
represented as an array of digits and incremented by one.

---

## 📸 Problem Illustration
<img width="1891" height="895" alt="image" src="https://github.com/user-attachments/assets/6bf9aca6-23ea-40f5-931d-b3b498c67d84" />


---

## Problem Description

You are given an integer array `digits` where each element represents a single digit of a
non-negative number. The digits are arranged from most significant to least significant.

The task is to add **one** to the number and return the resulting array of digits.

---

## Example

Input:
[9, 9, 9]

Output:
[1, 0, 0, 0]

---

## Approach Explanation

The solution simulates normal addition by starting from the **last digit** of the array.

- If a digit is `9`, it is changed to `0` and a carry is generated.
- If a digit is not `9`, it is incremented by one and the process stops.
- If all digits are `9`, a new array with one extra digit is created.

This approach correctly handles carry propagation in all cases.

---

## Algorithm Steps

1. Traverse the array from right to left.
2. Convert `9` to `0` and continue the loop.
3. Increment the first non-9 digit and return the array.
4. If all digits are processed, create a new array with `1` as the first element.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)` (only when all digits are `9`)

---

## Language Used

- Java
