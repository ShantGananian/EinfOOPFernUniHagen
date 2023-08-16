<h1>Algorithmik Aufgabe</h1>
<h2>Newton-Verfahren</h2>
<p>Um die Wurzel einer Zahl näherungsweise zu bestimmen, ist das Newtonverfahren hilfreich. Das Newtonverfahren um die Quadratwurzel einer Zahl $x$ zu bestimmen kann als Rekursionsformel wie folgt definiert werden:</p>

$x_{0}=x$

$x_{n+1}=x_{n}-\frac{x-x_n^2}{-2x_{n}}$

<p>Bestimmen Sie die fünfte Newtonapproximation $x_{5}$ für die Zahlen</p>

```java
double[] xs = new double[]{9317,3509,2749,4560,6740,7057,2854,6979,4531,2937,8902,8792,3908,9455,2295,7888,7385,7716,6327,3186,65,3446,7264,6396,3685,4716,2372,2404,1681,9175}
```

<p>und speichern Sie die Werte in einem double-Feld ys. Nutzen Sie dann die folgende Programmzeile, um das Ergebnis auszugeben:</p>

```java
for(int i=0; i<x.length; ++i) System.out.print(((int)(ys[i]*1000000)/1000000)+((i<x.length-1)?",":""));
```

<p><em>Zur Überprüfung Ihrer Lösung:</em></p>
<p>Wäre gegeben:</p>

```java
double[] xs = new double[]{2,4,10,24,33,15,100,7,12,44}
```

<p>So wäre die Ausgabe:</p>

```java
1.414213,2.0,3.162277,4.898979,5.744562,3.872983,10.000052,2.645751,3.464101,6.633249
```
