## Deployment architecture for the code

The following is the minimum deployment architecture for the sample program

```bash
 +----+          +----+
 |  M |----------|  R |
 +----+    |     +----+
           |
  +-----------------+
  |        |        |
  |        |        |
+----+   +----+   +----+
| S1 |   | S2 |   | S3 |
| C1 |   | C2 |   | C3 |
+----+   +----+   +----+

M = Master Node
R = Replica/ Salve Node
S = Sentinel
C = Client
```

The clients connect through the sentinels (quorum = 2)