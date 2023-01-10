### Результаты запусков ProGuard-core

Тестовые файлы лежат в директории `src/proguard/sources`.

Результаты запусков и полученные трейсы лежат в директории `src/proguard/results`.

### Запуск на TEAMMATES

ProGuard был запущен на проекте teammates (main module) с установленными source и sink, цепочка вызовов между которыми предположительно содержала 3 шага.
ProGuard упал со следующим стектрейсом:

<details>
<summary>Stacktrace</summary>

```
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at proguard.classfile.instruction.InstructionFactory.create(InstructionFactory.java:214)
	at proguard.classfile.instruction.InstructionFactory.create(InstructionFactory.java:43)
	at proguard.classfile.attribute.CodeAttribute.instructionsAccept(CodeAttribute.java:173)
	at proguard.classfile.attribute.CodeAttribute.instructionsAccept(CodeAttribute.java:147)
	at proguard.analysis.cpa.jvm.cfa.visitors.JvmIntraproceduralCfaFillerAllInstructionVisitor.visitCodeAttribute(JvmIntraproceduralCfaFillerAllInstructionVisitor.java:98)
	at proguard.analysis.cpa.jvm.util.CfaUtil$1.visitCodeAttribute(CfaUtil.java:86)
	at proguard.classfile.attribute.CodeAttribute.accept(CodeAttribute.java:138)
	at proguard.classfile.ProgramMethod.attributesAccept(ProgramMethod.java:148)
	at proguard.classfile.attribute.visitor.AllAttributeVisitor.visitProgramMember(AllAttributeVisitor.java:94)
	at proguard.classfile.visitor.MemberVisitor.visitProgramMethod(MemberVisitor.java:57)
	at proguard.classfile.ProgramMethod.accept(ProgramMethod.java:140)
	at proguard.classfile.ProgramClass.methodsAccept(ProgramClass.java:695)
	at proguard.classfile.visitor.AllMethodVisitor.visitAnyClass(AllMethodVisitor.java:46)
	at proguard.classfile.visitor.ClassVisitor.visitProgramClass(ClassVisitor.java:40)
	at proguard.classfile.ProgramClass.accept(ProgramClass.java:544)
	at proguard.classfile.ClassPool.classesAccept(ClassPool.java:291)
	at proguard.analysis.cpa.jvm.util.CfaUtil.createIntraproceduralCfaFromClassPool(CfaUtil.java:76)
	at proguard.analysis.cpa.jvm.util.CfaUtil.createIntraproceduralCfaFromClassPool(CfaUtil.java:65)
	at proguard.analysis.cpa.jvm.util.CfaUtil.createInterproceduralCfaFromClassPool(CfaUtil.java:150)
	at MainKt.main(Main.kt:13)
```
	
</details>

### Комментарии по proguard

В отличие от UTBot-а смотрит на реальное возможное поведение программы. Т.е. например не подставляет искусственно значения в поля, если в реальном коде этого не происходит.  
Если есть потенциальное место, где какие-то данные меняются - будут создаваться assumptions и рассматриваться разные варианты исполнения.

