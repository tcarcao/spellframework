The SPELL Framework
==============

The **SPELL Framework** is a framework that analyzes automatically the energy leaks (anomalous consumption values) of the software's source code. This framework encloses three separate tools that represent the methodology followed in the :green_book: [dissertation](https://github.com/tcarcao/spellframework/blob/master/spell.pdf), also present in this repo. 

This methodology is divided in the three steps that follow:

1. Instrumentation, Compilation & Test suite execution -- (C programs)
2. Results Treatment -- (Program language independent)
3. Energy Analysis -- (Program language independent)

In this repository contains the source code of this framework and also the runnables.

Each tool is separeted in a folder, and can be executed as a stand alone.

The framework has been developed and tested in a specific environment. There are no garanties that it will function in other conditions.
The environment settings are listed above:

* Clang 6.0
* Java 8
* Perl 5.0
* Intel Power Gadget Tool 2.0
* Mac OSX 10.9
* Intel Haswell

This work was developed during my (Tiago Carção's) masters Thesis in [University of Minho](http://www.uminho.pt) and my lab is the [Green Software Lab @ PT](http://greenlab.di.uminho.pt/).
