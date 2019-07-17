# The Password-strength Checker TDD Kata

## TL;DR

Build a simple tool to check the strength of a supplied password. Adapted from http://tech.groups.yahoo.com/group/testdrivendevelopment/message/35005

### Iteration 1

* The length of the password must be at least 7 characters in length
* The password must contain at least 1 letter
* The password must contain at least 1 digit

### Iteration 2

We need to add support for checking admin passwords

* Admin passwords must be at least 10 characters in length
* Admin passwords must contain at least 1 special character

### Iteration 3

We need to provide feedback to the user about the strength of their password

* Provide the user with a list of reasons why their password is 'weak'

## More information here

From https://groups.yahoo.com/neo/groups/testdrivendevelopment/conversations/messages/35005

Hi, Kay,

The first, smallest TDD lab I give people in my course looks like this:

----

Product Champion: "Create a password-strength checker, to be called when a user is registering on our site. Our UI team has requested a single simple method call (no web service, no JavaScript) telling them if a string represents a weak or strong password. They have also assured us that the string cannot possibly be null or nil (whatever that means to you).

"In order to be an acceptable password, a string must:

* Have a length greater than 7 characters.
* Contain at least one alphabetic character.
* Contain at least one digit."

----

That's it! Seems very simple, though people run into the "hard to test" or "now I have to change multiple tests" dilemmas very quickly. The lesson here is that when things become hard to test, we need to step back and consider refactoring our design so that testing is incredibly simple.

If anyone finishes early (there are some clever-but-obfuscated solutions), I give the whole group the following "2nd iteration":

----

"Folks, we have new information regarding user registration:

First, we need to require stronger passwords for our admins.
Admin passwords must also...
* Be > 10 chars long
* Contain a special character

"The UI developers tell us that they will know whether this user is registering as an admin or one of our prospective customers. They will pass a flag to your method."

"Secondly, users who have tried to register on our site are already complaining. Seems that they would like to know *all* the reasons why their password is not strong enough. Give us a way to call your password-strength-checker (perhaps twice) so that we can learn that the password is weak or strong, and if it's weak, all the reasons why it's weak (i.e., not just the first reason in a list)."

"The UI developers suggest that they are willing to call your code once or twice. You can provide them with the list of weaknesses in whatever form you deem appropriate. The UI folks will do what it takes to internationalize."

"Please note: Other stronger rules may apply to either user-type later. However, we really do not anticipate having other forms of users besides the two."

----

These new requirements encourage people to move away from the ultra-obfuscated solutions, and nudge them into thinking about what seems to be varying most frequently, and why testing just keeps getting harder and harder on such a "simple" problem. Those are two thought-paths to one-and-the-same root challenge. 

I did not invent this little coding lab, but I've used it so many times now, and I like it more than any of the other tiny labs I've used to get things started. I've added things to keep people from getting distracted by minutiae and then over-engineering (e.g., "no nulls" and "no other user types" are sincere and certain).

I learn a lot about the participants from this one exercise, too. It provides feedback that I use to steer the full TDD course in particular directions.

Hope that helps. Feel free to ask for clarification, or let me know how it goes for you.

Take care,

Rob Myers
Twitter: @agilecoach
http://www.agileInstitute.com/
