# Практика #1
## Какого типа может быть переменная в switch? Приведите примеры для всех возможных случаев.

# Практика #2
## Что произойдет, если в некоторых частях case будет отсутствовать break, как в следующем примере?

```
...
case 1:
    i = 1;
    break;
case 2:
    i = 2;
case 3:
    i = 3;
    break;
...
```

Если в некоторых частях case отсутствует break, выполнение будет продолжаться до следующего case или break. Это называется "провал" (fall-through). Все последующие инструкции будут выполнены, независимо от их условий.
Если value = 1, i = 1.
Если value = 2, то:

i = 2 (из case 2).
Затем выполняется case 3, и i = 3.

Если value = 3, i = 3.
Если значение не попадает ни в один из case, выполняется default, и i = 4.
