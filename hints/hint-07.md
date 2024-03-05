### I don't understand why my `releaseMovie()` tests are failing!
These tests add new movies with a cast, and then check that the actors
were actually added using the `getActorsInMovie()` method. They also overwrite 
old versions of movie casts with newer versions.

Something to double check is whether your key type in your `HashMap` implements 
that very important method. How does the key get turned into an
array index? Remember that it is very, very important to also implement `equals`
when you do this!
