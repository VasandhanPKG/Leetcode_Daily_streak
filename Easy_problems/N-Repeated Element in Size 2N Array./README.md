# N-Repeated Element in Size 2N Array(02-01-2026)

<img width="1914" height="900" alt="image" src="https://github.com/user-attachments/assets/8b0543a8-f98b-410c-8e27-bf44ee4970ba" />


## Problem Overview

You are given an integer array `nums` of size `2 * n`.

The array contains:
- `n + 1` unique numbers
- One number that is repeated exactly `n` times

From this information, it is clear that **only one number can be repeated** in the array.

---

## Key Hint

Since the size of the array is `2 * n` and there are `n + 1` unique numbers,  
the remaining occurrences must belong to **a single repeating number**.

---

## Approach

Using the above observation, the task is reduced to **finding the first number
that appears more than once**.

To achieve this:
- Traverse the array
- Store each element in a `HashSet`
- If an element is already present in the set, it is the repeating number

Once found, return that number immediately.

---

## Algorithm

1. Create an empty `HashSet`
2. Iterate through the array
3. Check if the current number exists in the set
4. If it exists, return the number
5. Otherwise, add it to the set

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Language Used

- Java
