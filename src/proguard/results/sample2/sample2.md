### Результат запуска proguard на sample2

Две ветви условного оператора => два трейса, им соответствующие.

Trace 1

```
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:39
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:36
JvmStackLocation(0)@Ls1/Main;doSmth(I)V:35
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:32
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:29
JvmStackLocation(0)@Ls1/Main;doSmth(I)V:28
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:26
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:23
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:22
JvmStackLocation(0)@Ls1/Main;doSmth(I)V:20
```

Trace 2

```
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:68
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:65
JvmStackLocation(0)@Ls1/Main;doSmth(I)V:64
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:61
JvmStackLocation(1)@Ls1/Main;doSmth(I)V:58
JvmStackLocation(0)@Ls1/Main;doSmth(I)V:57
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:55
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:52
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:51
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:23
JvmLocalVariableLocation(4)@Ls1/Main;doSmth(I)V:22
JvmStackLocation(0)@Ls1/Main;doSmth(I)V:20
```
