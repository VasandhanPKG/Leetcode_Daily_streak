# Sum of Four Divisors (2026-01-04)

## 📸 Proof of submission

<img width="1907" height="888" alt="image" src="https://github.com/user-attachments/assets/5b8b0dda-4d59-40b0-aa79-1c334a73c226" />

## Problem Overview

You are given an integer array `nums`.

For each number in the array:
- If it has **exactly four divisors**, calculate the **sum of those divisors**
- Add this sum to the final answer

Return the total sum of divisors for all such numbers.

---

## My Approach

I solved this problem by **checking the number of divisors for each element** in the array.

For every number:
- I iterate from `1` to `√n`
- If `i` divides `n`, then:
  - `i` and `n / i` are both divisors
- I count the total number of divisors and calculate their sum at the same time

This avoids unnecessary iterations and keeps the solution efficient.

---

## Key Observation

- Divisors always come in **pairs**
- If `i == n / i`, it contributes only **one divisor**
- Otherwise, it contributes **two divisors**

Only when the divisor count becomes **exactly 4**, the sum is added to the final result.

---

## Algorithm Steps

1. Initialize `tot_sum = 0`
2. For each number `n` in `nums`:
   - Initialize `count = 0` and `sum = 0`
   - Loop from `1` to `√n`
   - Count divisors and add them to `sum`
3. If `count == 4`, add `sum` to `tot_sum`
4. Return `tot_sum`

---

## Time and Space Complexity

- **Time Complexity:** `O(n * √m)`  
  (`m` = maximum value in the array)
- **Space Complexity:** `O(1)`

---

## Language Used

- Java
