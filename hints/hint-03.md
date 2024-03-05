### Can I use more than one data structure?

Of course! You should consider the tradeoffs. If you give up a little
*Frugality* by using extra memory in a second data structure, are you
getting a lot of *Customer Obsession* to make up for it? Vice versa, if
you give up a little *Customer Obsession* to use a single data
structure, do you get a lot of *Frugality* to make up for it?

These aren't easy questions to answer. There's not "right" answer, there
are just defensible and indefensible opinions. (Using an `ArrayList` for
this is indefensible. It'll have poor complexity for all the use cases.)

If you're having lots of trouble making up your mind, practice *Bias for
Action* and take a guess. This is an exercise, and it's safe to make
mistakes.

[I'm worried that if I use multiple data structures, they won't stay in sync.](hint-04.md)
