# Maximum Product of Splitted Binary Tree (2026-01-07)

## 📸 Submission Proof
<img width="1895" height="885" alt="image" src="https://github.com/user-attachments/assets/513b7def-f21d-4865-a90b-15d22333f19a" />


## Problem Overview

You are given the root of a binary tree.

You can remove **one edge** to split the tree into **two subtrees**.
Your task is to find the **maximum product** of the sums of the two subtrees.

The result should be returned modulo **10⁹ + 7**.

---

## My Approach

I solved this problem in **two clear steps**.

### Step 1 – Find sum of every subtree  
I used **DFS** to calculate the sum of each subtree.

While returning from recursion, I:
- Added the left and right subtree sums to the current node
- Stored this total directly in `node.val`

So after DFS:
- Every node stores the **sum of its subtree**
- I also get the **total sum of the tree**

---

### Step 2 – Try every possible split  
After computing all subtree sums, I used **BFS traversal** to visit each node.

For every node:
- I considered cutting the edge above it
- One subtree sum = `node.val`
- Other subtree sum = `totalSum - node.val`
- Product = `(totalSum - node.val) * node.val`

I kept updating the **maximum product**.

---

## Why This Works

- Every valid split corresponds to choosing **one subtree**
- Precomputing subtree sums lets us evaluate each split in **O(1)** time
- Checking all nodes guarantees we find the **maximum possible product**

---

## Algorithm Steps

1. Run DFS to compute subtree sums and total tree sum  
2. Traverse the tree again using BFS  
3. For each node:
   - Calculate product of the two resulting subtrees
   - Update the maximum product  
4. Return the result modulo **10⁹ + 7**

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(n)`  
  (for recursion stack + queue)

---

## Language Used

- Java
