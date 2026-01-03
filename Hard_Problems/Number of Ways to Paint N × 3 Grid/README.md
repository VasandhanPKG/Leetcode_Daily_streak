# Number of Ways to Paint N × 3 Grid (2026-01-03)

## 📸 Accepted Submission Proof

<img width="1907" height="911" alt="image" src="https://github.com/user-attachments/assets/a6de8480-6c04-4d38-9bb1-1fede1e9fd9a" />


## Problem Overview

You are given an integer `n` representing the number of rows in a grid with **3 columns**.
Each cell can be painted using **3 colors**.

### Rules
- Adjacent cells in the **same row** must have different colors
- Cells in the **same column of consecutive rows** must have different colors

The task is to calculate the **total number of valid color combinations**.

---

## My Approach

I solved this problem using **recursion with dynamic programming (memoization)**.

Instead of trying to directly calculate the total count, I **build the grid row by row**.

For each row:
- I try all possible color combinations for the 3 columns
- I ensure that:
  - No two adjacent cells in the current row have the same color
  - No cell has the same color as the cell directly above it

To remember previous choices, I store the colors of the **previous row** and use them
while selecting colors for the current row.

---

## State Definition

I define a recursive function:

solve(i, prev1, prev2, prev3)

Where:
- `i` → current row index
- `prev1`, `prev2`, `prev3` → colors used in the previous row
- `-1` is used initially to indicate that there is no previous row

This function returns the number of valid ways to paint the grid from row `i` to row `n`.

---

## Transition Logic

For the current row, I try all color combinations:

(c1, c2, c3)

A combination is valid only if:
- `c1 != c2` and `c2 != c3`
- `c1 != prev1`
- `c2 != prev2`
- `c3 != prev3`

If valid, I recursively call the function for the next row.

---

## Memoization

To avoid repeated calculations, I use a **4D DP array**:

dp[row][prev1+1][prev2+1][prev3+1]

- Stores already computed results
- Improves performance significantly

---

## Base Case

When all rows are processed (`i == n`), I return `1`,
indicating one valid way to paint the grid.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

(The number of states is limited since only 3 colors are used.)

---

## Language Used

- Java
