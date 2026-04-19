# Sorting and Searching Algorithms

## Insertion Sort

![alt text](img/image.png)

## Selection Sort

![alt text](img/image-1.png)

## Bubble Sort

![alt text](img/image-2.png)

## Quick Sort

![alt text](img/image-5.png)

## Merge Sort

![alt text](img/image-6.png)

## Linear Search

![alt text](img/image-3.png)

## Binary Search

![alt text](img/image-4.png)

## BigO

![alt text](img/image-7.png)

# Linked Lists

![alt text](img/image-8.png)
![alt text](img/image-9.png)

# Stacks and Queues

## Stacks

- A structure in which elements are added and removed from only one end; a “last in, first out” (LIFO) structure 
- Push, pop --> add remove from top
- Top --> returns the top element
- Array based, linked list based

## Queues

- First in first out
- Array or linked list based
- Enqueue --> add element end of the que
- Dequeue --> remove element from the front of the queue.

![alt text](img/image-10.png)

## Hash Tables

- All types of data
- Hash function --> converts any key into an integer index.
- Load Factor --> once the table gets too full (typically > 0.7), it doubles its bucket count and rehashes everything. This keeps the average case at O(1), at the cost of occasional O(n) resize spikes.
- Collision:
- Seperate Chaning
  - Every bucket is a linked list
- Linear Probing
  - Go to next empty index
- Quadratic Probing
  - +1, +4, +9
  - Causes secondary clustering
- Double Hashing
  - Second hash function

## Binary Trees

- Level Order
- Pre-order - root, left, right
- In-order - lef, root, right
- Post-order - left, right, root

## Heaps

- Complete binary tree
- Max Heap --> Every parent is bigger than its child
- Min Heap --> Every parent is smaller than its child
- Organize data top down
  - Binary trees organize data left to right
- Sift-up operation
  - Add the node at the end
  - Compare with parent untill it is in place
- Delete (Extract the data at the roor)
  - Copy the last item to the root
  - Sift-down
- If the root is placed at index 1 in an array: The left child will be at 2 * index  The right child will be at 2 * index+1 Parent of any node will be at index/2 


## Graphs

- Directed and undirected
- Weighted and unweighted
- Depth First
  - Progress untill dead end
  - Needs a boolean visited array
  - Uses stack, if no unvisited neighbor left, remove node from stack

  ![alt text](img/image-11.png)

- Bredth First
  - Uses a queue and a visited array
  - Traverse nodes in layers
  - Like level-order

    ![alt text](img/image-12.png)

- Dijkstra, bellman-ford
- A* --> Dijkstra with heuristic approach