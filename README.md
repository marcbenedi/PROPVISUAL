# PROPVISUAL

## Synopsis
This is a university project for PROP (Projecte de Progrmació)
The program builds a graph wich connects Authors Papers and Term.
Author can be connected with Papers and Terms but no with other Authors.
Papers and Terms can only be connected to Authors.

The user can do querys to the program (or use some predefined templates).
For example:
- "name of an author" "name of a paper" AUTHOR
This quey returns all the authors that wrote the paper "name of a paper" with the author "name of an author".
The querys can have different lengths.
The only rule is that the first parameter has to be a name.

The user can also add some rules.
For example:
- 3 != "excluded author" 
This rule applies to the 3rd parameter -> AUTHOR
It don't allow the system add the author "excluded author" to the list pf results.
There are a lot of other rules you can apply to a query.

Finally the system shows the results (and make some decisions) based on Page Rank punctuation of each node.

## Collaborators
- Miquel Baena.
- Fabio Mazzocchetti.
- Guillem Gili.
