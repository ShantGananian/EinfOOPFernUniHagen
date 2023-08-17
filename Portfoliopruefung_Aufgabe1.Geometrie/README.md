<h1>Geometrie Aufgabe</h1>
<h2>Identifikation von Quadraten</h2>
<p>Über die Angabe zweier Punkte kann man rechtwinklige Rechtecke in der Ebene definiert. Gegeben zwei Punkte $p_{1} = (x_{1},y_{1})$, $p_{2} = (x_{2},y_{2})$ $x_{1}\neq x_{2}$ und $y_{1}\neq y_{2}$, können wir $p_{1}$ und $p_{2}$ als die zwei diagonal gegenüberliegenden Eckpunkte eines rechtwinkligen Rechtecks auffassen, dessen Eckpunkte die Punkte $p_{1}$, $p_{2}$, $(x_{1},y_{2})$ und $(x_{2},y_{1})$ sind. Beachten Sie, dass falls $x_{1}=x_{2}$ oder $y_{1}=y_{2}$ ist, sich auf diese Weise kein Rechteck, sondern eine Gerade ergibt, oder aber, wenn beide Identitäten gelten, nur ein Punkt.</p>
<p>Ein Qudrat ist ein rechtwinkliges Rechteck, bei dem alle vier Seiten die gleiche Länge haben. Gegeben seien die zwei folgenden Felder $x$ und $y$:</p>

```java
double[] x = new double[]{6,13,7,11,4,13,2,14,10,6,10,14,9,7,5,7,12,9,10,5,6,10,8,15,13,14,7,4,5,2,2,2,6,11,13,14,11,6,12,5,2,11,5,15,14,11,11,3,5,14}
double[] y = new double[]{3,11,11,14,13,15,15,2,4,14,1,11,8,2,4,15,4,6,11,10,3,13,8,12,13,3,14,6,4,10,10,12,10,13,3,6,14,14,1,3,2,12,4,13,4,2,8,6,1,7}
```

<p>Ermitteln Sie, wie viele Indexpaare $(i,j)$ existieren, so dass $p_{1}=(x[i],y[i])$ und $p_{2}=(x[j],y[j])$ im oben beschriebenen Sinne ein Quadrat definieren. Geben Sie als Antwort die Zahl der so definierten Quadraten an.</p>
<p><em>Zur Überprüfung Ihrer Lösung:</em></p>
<p>Wenn die Felder $x$ und $y$  wie folgt gegeben wären:</p>

```java
double[] x = new double[]{1,2,3,324,2,23,145,2,4,6,32,45,3,12,54,34,23,12};
double[] y = new double[]{23,12,1,2,3,324,2,23,145,2,4,6,32,45,3,12,54,34};
```

<p>so wäre die Ausgabe $6$.</p>

> [Meine Lösung](https://github.com/ShantGananian/EinfOOPFernUniHagen/blob/master/Portfoliopruefung_Aufgabe1.Geometrie/src/main/java/Geometrie.java)
