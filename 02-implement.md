### Step 3: Release a new film

Implement the `releaseMovie()` method, and the `getActorsInMovie()`
method.

Note that `releaseMovie()` will overwrite an entire movie’s entry in
`Imdb`, so you don’t need to worry about the “old” actors associated
with a movie if this is called. We don’t anticipate a movie to be
released twice, but you never know. We just want the latest data.

Run the relevant unit tests by running the `maps-release-movie-test` RDE
workflow.

You might be wondering: "If I re-release a movie, then remove a movie,
am I expected to restore the older version fo the movie?" No: when a
movie is removed (see below), that completely wipes away any trace of
that movie from IMDB. So you don't need to worry about keeping
"versions" of each movie.

[I don't understand why my `releaseMovie()` tests are failing!](./hints/hint-07.md)

### Step 4: Oops, unrelease a film!

Occasionally, IMDB knows a lot about a film before the public does and
accidentally leaks some information about the cast. In order to clean up
if this occurs, we need a way to remove a movie from the database
completely.

Implement the `removeMovie()` method.

Run the relevant unit tests by running the `maps-remove-movie-test` RDE
workflow

[I don't understand why my `removeMovie` tests are failing!](./hints/hint-12.md)

### Step 5: Add a new movie credit for an actor

Implement the `tagActorInMovie()` method.

Remember that if you add a new credit for an actor, that actor should
show up in `getActorsInMovie()` for that movie.

Also think about the different states that `Imdb` can be in before
`tagActorInMovie()` is called. Maybe it's not the first time someone has
changed `Imdb`?...

Run the relevant unit tests by running the `maps-tag-actor-test` RDE
workflow.

[My whole cast changes to just one actor!](./hints/hint-13.md)
[The new actor doesn't get added to the cast!](./hints/hint-14.md)

### Step 6: Let them bask in the glory

Implement the `getMoviesForActor()` method.

Run the relevant unit tests by running the `maps-get-actors-movies-test`
RDE workflow.

[I don't understand why the `getMoviesForActor` tests are failing!](./hints/hint-15.md)

### Step 7: Data dump

Implement the `getAllActorsInImdb()`, and `getTotalNumCredits()`
methods.

Run the relevant unit tests by running the `maps-data-dump-test` RDE
workflow.

[How do I iterate through the set of entries in the map?](./hints/hint-06.md):

### Step 8: Push your code

When you're done with this coding activity, commit your changes, push to
origin/mainline, and post a link to your commit on Code Browser in the
Canvas quiz question, "Where's your code?“

Nice work! Now there are just a few more wrap-up questions to answer in
Canvas after posting your code.
