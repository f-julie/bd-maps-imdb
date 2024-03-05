### I don't understand why the `getMoviesForActor` tests are failing
These tests add movies with casts, tag actors in movies, remove movies,
and check if `getMoviesForActor()` returns *all* the actor's movies.

Try running the debugger and seeing what's in your data structures when
`getMoviesForActor()` is called.

[Your tests are wrong: the movie is clearly right there in the actor's set of movies.](./hint-16.md)
[I see the actor in the data structure, but nothing is being returned.](./hint-17.md)

