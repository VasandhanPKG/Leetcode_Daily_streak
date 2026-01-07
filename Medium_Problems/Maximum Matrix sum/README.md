# Maximum Matrix Sum (2026-01-05)

## 📸 Proof of submission
![WhatsApp Image 2026-01-05 at 10 40 15 PM](https://github.com/user-attachments/assets/1555cf9d-17c8-441b-a4f1-09716abcb576)


## Problem Overview

You are given an integer matrix.

You are allowed to **flip the sign of any element any number of times**.
The goal is to find the **maximum possible sum of all elements** in the matrix
after performing optimal operations.

---

## My Approach

I solved this problem by focusing on **absolute values and parity of negative numbers**.

Instead of performing actual flips, I observed that:
- Flipping signs does not change the absolute value
- The total sum is maximized when as many values as possible are positive

So my strategy was:
- Convert every element to its **absolute value**
- Keep track of:
  - The total sum of absolute values
  - The count of negative numbers
  - The smallest absolute value in the matrix

---

## Key Observation

- If the number of negative elements is **even**, all values can effectively be made positive
- If the number of negative elements is **odd**, one element must remain negative

To minimize loss in this case, the element with the **smallest absolute value**
is chosen to remain negative.

---

## Algorithm Steps

1. Initialize `sum`, `negCount`, and `minAbs`
2. Traverse the entire matrix:
   - Count negative elements
   - Add absolute value of each element to `sum`
   - Track the minimum absolute value
3. If `negCount` is even, return `sum`
4. If `negCount` is odd, subtract `2 × minAbs` from `sum`

---

## Why This Works

- Absolute values maximize contribution to the sum
- Only the **parity of negative numbers** matters
- Keeping the smallest absolute value negative minimizes reduction

---

## Time and Space Complexity

- **Time Complexity:** `O(m × n)`
- **Space Complexity:** `O(1)`

---

## Language Used

- Java
