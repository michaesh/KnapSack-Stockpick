#Using knapsack solution to solve portfolio composition

Knapsack problem is to use a finite resource e.g. carry weight to determine the composition of materials to carry in order to yield maximum value. 
The traditional approach is to use dynamic program to test out all combination of assets that satisfy the weight limit. 
My approach is similar, but constructs a binary tree, each level being an asset of buy/ dont buy. 

This approach could be faster than dynamic program, because instead of recomputing the entire solution space everytime a new asset is available, my approach would only need to append the new asset to the leaves of existing tree to determine maximum yielding portfolio composition. 

Momentum is defined as the growth of an asset over the period of last 12 to 2 months. By the 4-factor model, this is a good indicator of the prospect of a stock, i.e. its value.

Uses
- BST
