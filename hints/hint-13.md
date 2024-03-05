### The movie's whole cast changes to just one actor!
We have to cover two broad use cases here.

1. User tags actor in a nonexistent movie
   * In this case, checking to see if the Movie's key is already in the
     map will indicate that it is not, and we'll need to create a new
     Set<Actor> to add to the map.
1. User tags actor in a movie that already exists
   * If we create a new `Set<Actor>` here, it will *overwrite* the one
     we already have. (Is this what we want?)

Verify that your `tagActorInMovie()` method only creates a new
`Set<Actor>` for movies that haven't been added yet.

[The new actor doesn't get added to the cast!](./hints/hint-14.md)
