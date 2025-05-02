# Programmer Humor Weekly

Welcome to the repository of my submissions in **r/ProgrammerHumor Weeklies**! 🎉

# About

This was an event organized by [r/ProgrammerHumor](https://www.reddit.com/r/ProgrammerHumor/) subreddit in July 2023 for fun coding challenges (event info is in their [Discord](https://discord.gg/rph)). I submitted the first two challenges.

# Submissions info

## Weekly 1 - "Obscurus Programmare":

*Language:* Java

*Difficulty:* Difficult

*Notes:* Last commit obscures almost all variable/method names and also removes almost all unnecessary whitespace. To see a readable code, one must look at the penultimate git commit version. 😄

It was said to avoid **IF** statements. 😏 
So I did, by using ternary operations instead of most "if"-s.

## Weekly 2 - "Graph": 

*Language:* Java

*Difficulty:* Intermediate (Easy should be also easily findable from git history 🙂 )


# Instructions for challenges

## Challenge - 010723
For our first ever challenge, we'll start off with something simple, something you all know: `FizzBuzz`

### Easy: 
Create a program in any language, that will loop from 1 to 100, and upon reaching a multiple of 3, it will output "Fizz", upon reaching a multiple of 5 it'll output "Buzz".
If it reaches a multiple of both 3 and 5, it will output "FizzBuzz" on a single line. 
If it is not a multiple of either, output the number itself.

### Intermediate: 
Everything said before, if it reaches a multiple of 7, it must output "Rizz", if it reaches a multiple of 11, it must output "Jazz". 
If it reaches a divisor of 120, it must output "Dizz", the divisors must not be hard coded and should be found algorithmically. 
**Use as least if statements as possible.**

### Difficult: 
Everything said before, and for every prime number reached, have it output "Prizz" but if and only if, there are no prime numbers between it and the next multiple of 7 or 11. Here's an example:
```
79
Buzz (80)
Fizz (81)
82
Prizz (83)
FizzRizz (84)
```

79 is prime, but it does not output Prizz, because there's a closer prime to 84 (multiple of 7) than it, which in this case is 83, and 83 does get to be Prizz because there are really no primes between it and 84. (Do not include the numbers with parenthesis () in your code, that here is just for demonstration)

### Points
- Base reward: 5 points
- Each difficulty up from easy: 1 points
- Total possible base points: 7 points
- Funniness bonus: 3 points

Total: 10 points 

## Challenge #2 - 020723
A graph is a set of nodes with a set distance between each of them. Each node is represented by a string of any length. 2 nodes that are connected to each other are called a 'pair'. Not every node is a pair with every other node (i.e. in a graph with nodes 'a', 'b', and 'c', 'a' may be a pair with 'b', and 'b' may be a pair with 'c', but 'a' may not be a pair with 'c'.) However, every node must be a pair with at least one other node. The distance between nodes are constant. 

An example of a representation of a graph 

```
graph = [
 # a   b   c   d
  [0, 20, 42, 35],  # a
  [20, 0, 30, -1], # b
  [42, 30, 0, 12],  # c
  [35, -1, 12, 0]  # d
]
```


Where the inner list represents the distance of each point, 'a', 'b', 'c', and 'd' from each point, 'a', 'b', 'c', and 'd' respectively.
`nan` or `-1` can be used to represent nodes who are not pairs with each other. 

The nodes are named alphabetically, where the 1st to 26th node is a-z, the 27th to 52nd node is aa to az, etc.

Easy: 
- Given a graph of at most 10 nodes, write a function to find the shortest distance between any two given nodes
- Assuming two outputs with the same distance, print any of the outputs.
- The function should take two inputs, the graph, and an array of strings to contain the nodes.
- It should print the shortest distance between the given nodes.

Intermediate: 
- Given a graph where `3 < the number of nodes < 5.0e+2`, write an algorithm to find the shortest distance and the nodes to traverse between two given nodes
- Assuming two outputs with the same distance, print any of the outputs.
- The function should take two inputs, the graph, and an array of strings to contain the nodes.
- It should print the nodes traversed in the route with the shortest distance, separated by commas, then the distance between the two nodes on a newline. The output need not be printed all at once.

Difficult:
- Given a graph where `10 < number of nodes <= 25`, write an algorithm to find the sequence of nodes that results in the shortest distance to visit every node at least once.
- Assuming two outputs with the same distance, print any of the outputs.
- The function should take one input, the graph
- Output requirements are the same as intermediate

**Required time complexity: Code runs within 1 hour (3600 seconds).**

Points
- Completing easy: 3 points
- Completing intermediate: 5 points
- Completing hard: 7 points
- Funniness bonus: 3 points

Total possible points: 10