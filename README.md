## IMDB Cast Credits

### Introduction
IMDB is a long-time Amazon subsidiary with the most extensive movie
database in the world. One of the core features of IMDB is the ability
to look up which actors have acted in a film, or to look up which films
an actor has acted in. IMDB has tons of data, and so these features must
be implemented in a way that makes these lookups fast!

You're going to recreate these pieces of IMDB's functionality.

You're starting with three classes:
* `Movie`: Represents a movie. The name field alone determines uniqueness/equality.
* `Actor`: Represents an actor (in movies). The name field alone determines uniqueness/equality.
* `Imdb`: The class that joins them together! You'll be implementing
  methods in this class (the method declarations are there, but you'll
  provide the implementations -- and any instance variables you need to
  make it all work). 
  
**Note:** IMDB refers to a "database", which in this implementation is
simply the data structure(s) you're adding to the `Imdb` class. Don't
worry: there's no actual database work here for you! (that comes later
in ATA!)

### Step 1: Design

In this step you'll be thinking about how you should store the
data necessary to support the methods in `Imdb`. What instance variable(s)
can you add to `Imdb` to track the appearances of actors in movies. You
should also consider the efficiency of your choice.
Getting the actors in a movie, and getting the movies an actor acts in 
are our two most frequently used operations. You'll need to ensure we 
can implement these so they have constant, O(1), runtimes.

Once you've made a decision, walk through each method again and make a note
of how you'll implement it. Will your implementations provide the efficiency
that we need for the IMDB website? 

[I read the methods' Javadocs, but I don't understand what to use to store the data.](./hints/hint-05.md)

Remember, the data needs to be consistent no matter how you add or remove a
`Movie` or an `Actor` to `Imdb`. For example, if you're releasing a new
`Movie`, make sure that on the next call to `getMoviesForActor()`, the new `Movie`
is returned! This may matter more when you're implementing logic, but it
might come into play in your data design as well.

[Can I use more than one data structure?](./hints/hint-03.md)

[I'm worried that if I use multiple data structures, they won't stay in sync.](./hints/hint-04.md)

When you think you've got it, go ahead and add your member variable
declaration(s) to the `Imdb` class that capture your approach.

### Step 2: Implement

We're going to walk through the implementation in a few steps, providing
some tests to make sure you are on track!

#### Release a new film

Implement the `releaseMovie()` method, and the `getActorsInMovie()`
method.

Note that `releaseMovie()` will overwrite an entire movie’s entry in
`Imdb`. We don't want to take credit away from actors, so you don’t 
need to worry about the "old" actors associated
with a movie if this is called. We don’t anticipate a movie to be
released twice, but you never know. We just want the latest data.

Run the relevant unit tests by running the `ReleaseMovieTest` tests

[I don't understand why my tests are failing!](./hints/hint-07.md)

#### Oops, unrelease a film!

Occasionally, IMDB knows a lot about a film before the public does and
accidentally leaks some information about the cast. In order to clean up
if this occurs, we need a way to remove a movie from the database
completely.

Implement the `removeMovie()` method.

Run the relevant unit tests by running the `RemoveMovieTest` tests

[I don't understand why my `removeMovie` tests are failing!](./hints/hint-12.md)

#### Add a new movie credit for an actor

Implement the `tagActorInMovie()` method.

Remember that if you add a new credit for an actor, that actor should
show up in `getActorsInMovie()` for that movie.

Also think about the different states that `Imdb` can be in before
`tagActorInMovie()` is called. Does the movie already have actors 
tagged in it? Is this the first actor tagged in the movie?

Run the relevant unit tests by running the `TagActorTest` tests.

[My whole cast changes to just one actor!](./hints/hint-13.md)
[The new actor doesn't get added to the cast!](./hints/hint-14.md)

#### Let them bask in the glory

Implement the `getMoviesForActor()` method.

Run the relevant unit tests by running the `GetMoviesTest` tests.

[I don't understand why the `getMoviesForActor` tests are failing!](./hints/hint-15.md)

#### Data dump

Implement the `getAllActorsInImdb()`, and `getTotalNumCredits()`
methods.

Run the relevant unit tests by running the `DataDumpTest` tests.

[How do I iterate through the set of entries in the map?](./hints/hint-06.md)


We have also provided a workflow that will run all of the tests in this pre-work. 
When the `maps-prework-imdb` workflow is passing, you have completed the pre-work.

**You have completed this pre-work when:**
* You have decided how to store the `Movie` and `Actor` data in the `Imdb` class
* You have update the `Imdb` class to include instance variables
* You have implemented all of the methods in the `Imdb` class
* All tests are passing
* You have committed and pushed your code
* You have answered the canvas quiz
