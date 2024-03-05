
**branch name:** maps-prework

## IMDB Cast Credits
IMDB is a long-time Amazon subsidiary with the most extensive movie
database in the world. One of the core features of IMDB is the ability
to look up which actors have acted in a film, or to look up which films
an actor has acted in.

You're going to recreate this piece of IMDB's feature set (using `Map`,
of course!)

### Step 0: Check out the code
You're starting with three classes:
* `Movie`: Represents a movie
* `Actor`: Represents an actor (in movies)
* `Imdb`: The class that joins them together! You'll be implementing
  methods in this class (the method declarations are there, but you'll
  provide the implementation--and any instance variables you need to
  make it all work).

You may well need to make modifications to the Movie and Actor classes
as well (remember that `HashMap`, `HashSet` use `hashCode()` and
`equals()`!).

#### On verification

Note that when you get to the implementation phase of this try, there
will be an RDE workflow for you to run for each "Step" of the
implementation process. Try to make sure your tests all pass for one
step in the process before you move on to the next one, as there may
have been something that you missed.

#### On equality

Let’s focus on the movie.name and actor.name attributes as being the key
data to determine uniqueness/equality, so base your `hashCode()` and
`equals()` methods on those.

Make sure you understand what each of the methods in `Imdb` is intended
to do, so that your design accommodates them.

Note that Imdb refers to a "database", which in this implementation is
simply the data structure(s) you're adding to the Imdb class. Don't
worry: there's no actual database work here for you! (that comes later
in ATA!)





### Step 1: Think about your design

Look through each of the methods in `Imdb`. Each one represents a use
case that you'll need to support. Think about the preconditions,
invariants, and postconditions for each use case. Also think about the
edge cases!

It's probably a good idea to write down your thinking, even if it's just
in a text file or on paper.

Now, think about what data you'll use in `Imdb`: how can you store the
data needed so that you can efficiently support each of the use cases
represented by `Imdb`'s methods? See if you can achieve constant O(1)
runtime for the cases where it's possible (and think about where O(n)
might be the best you can do!).

[I read the methods' Javadoc, but I don't understand what to use for my 'database'.](./hints/hint_01.md)

### Step 2: Mentally test your design

Now that you have an idea of the how to represent the movie and actor
data in Imdb, think through each use case and verify that it'll work.

Remember that the data need to be consistent no matter how you add a
movie or an actor to the dataset. For example, if you're releasing a new
movie, make sure that when you get movies for the actor, that new movie
shows up! This may matter more when you're implementing logic, but it
might come into play in your data design as well.

[I'm worried that if I use multiple data structures, they won't stay in sync.](./hints/hint_04.md)

When you think you've got it, go ahead and add your member variable
declaration(s) to the `Imdb` class that capture your approach. Then
paste the member variable declaration section from your `Imdb` class in
the first Canvas quiz question: "Hey, what's your design?".

(end of this phase: go back to Canvas to find the Implement phase!)
