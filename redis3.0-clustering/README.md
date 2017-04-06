## Deployment architecture for the code

The following is the minimum deployment architecture for the sample program

```bash

                +----+   +----+
            +---| M1 |---| R1 |   
            |   +----+   +----+
            |  
 +---+      |   +----+   +----+
 | C |------+---| M2 |---| R2 | 
 +---+      |   +----+   +----+
            |
	    |   +----+   +----+
	    +---| M3 |---| R3 |
	        +----+   +----+ 

C - Client
M - Master
R - Replica (Slave)
```
