### I'm worried that if I use multiple data structures, they won't stay in sync.

You're right; they won't. You'll have to write extra code to keep them
in sync. If you have one data structure that maps `Movie` to
`Set<Actor>`, and you want to make actor lookup faster by keeping a
second data structure that maps `Actor` to `List<Movie>`, then you'll
have to update *both* data structures in any method that modifies
*either* of them.

Luckily, you can encapsulate them by declaring them `private` and not
providing any getters or setters. Then you have complete control over
keeping them in sync.

Can you find every method that modifies data? Is the extra complexity
worth the improved customer experience?

Remember that there are at least a couple of ways of solving this, so
there isn't a "right" answer to the above question. If you're still
curious and/or frustrated by this step in the design by the time you get
to class, that's ok. Definitely bring it up for discussion! In the mean
time, pick an approach that you think will work and get some practice
using `Map`s!
