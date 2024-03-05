### I see the actor in the data structure, but nothing is being returned
Most data structures use the `equals()` method to check whether two
objects (such as an `Actor` we're searching for and one in a `Set`) are,
in fact, equivalent. Some data structures also use `hashCode()` to
narrow the search.

If you override the `equals()` that is inherited from `Object`, you must
also override `hashCode()`, and vice versa.

If you're still stuck, see if any of these apply to you and see if you
can get some help from someone else (or, if just thinking through these
cases helps you on its own, you've just experienced a variation on
rubber duck debugging!):

* I'm using two maps. I see the actor key in the data structure, but the
  movies for that actor are incorrect
* I'm using two maps. I see the actor key in the data structure, but it
  has two of the same movie in its set of values.
* I'm using two maps. I see the actor key in the data structure with the
  correct movies, but none are being returned.
* I'm using two maps. I see two keys for the same actor.
* I'm using one map. I don't know how to find all of the movies for an
  actor.
