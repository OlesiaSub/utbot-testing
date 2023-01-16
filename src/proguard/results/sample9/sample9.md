Динамический вызов обрабатывается и если source-ом ставить один из методов детей -- то трейс найдется.

Trace:
```
JvmStackLocation(1)@Ls1/Main;util()V:48
JvmStackLocation(1)@Ls1/Main;util()V:45
JvmStackLocation(0)@Ls1/Main;util()V:44
JvmStackLocation(1)@Ls1/Main;util()V:41
JvmStackLocation(1)@Ls1/Main;util()V:38
JvmStackLocation(0)@Ls1/Main;util()V:37
JvmLocalVariableLocation(1)@Ls1/Main;util()V:36
JvmStackLocation(0)@Ls1/Main;util()V:35
```