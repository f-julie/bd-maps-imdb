### Your tests are wrong: the movie is clearly right there in the actor's set of movies 

Make sure that *all* the methods that modify the data actually modify
*all* the data. For instance, is the movie removed from the actor's set
of movies if we `removeMovie()`? Is the movie added when we
`tagActorInMovie()`?

Do you have two maps? Do the two maps' data agree with one another?
(Each movie-actor pair in one is also present in the other). Maybe use
the debugger to verify if this invariant is maintained through out the
tests that are failing.

[I see the actor in the data structure, but they aren't returned in the results.](./hint-17.md)
