### Результаты запусков ProGuard-core

Тестовые файлы лежат в директории `src/proguard/sources`.

Результаты запусков и полученные трейсы лежат в директории `src/proguard/results`.


### Комментарии по proguard

В отличие от UTBot-а смотрит на реальное возможное поведение программы. Т.е. например не подставляет искусственно значения в поля, если в реальном коде этого не происходит.  
Если есть потенциальное место, где какие-то данные меняются - будут создаваться assumptions и рассматриваться разные варианты исполнения.
