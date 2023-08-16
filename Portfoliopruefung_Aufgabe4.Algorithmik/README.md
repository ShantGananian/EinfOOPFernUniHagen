<h1>Algorithmik Aufgabe</h1>
<h2>Newton-Verfahren</h2>
<p>Um die Wurzel einer Zahl näherungsweise zu bestimmen, ist das Newtonverfahren hilfreich. Das Newtonverfahren um die Quadratwurzel einer Zahl <img src="https://i.upmath.me/svg/x" alt="x" /> zu bestimmen kann als Rekursionsformel wie folgt definiert werden:</p>
<p><img src="https://i.upmath.me/svg/x_%7B0%7D%3Dx" alt="x_{0}=x" </p>
<p><img src="https://i.upmath.me/svg/x_%7Bn%2B1%7D%3Dx_%7Bn%7D-%5Cfrac%7Bx-x_n%5E2%7D%7B-2x_%7Bn%7D%7D" alt="x_{n+1}=x_{n}-\frac{x-x_n^2}{-2x_{n}}" /></p>
<p>Bestimmen Sie die fünfte Newtonapproximation <img src="https://i.upmath.me/svg/x_%7B5%7D" alt="x_{5}" /> für die Zahlen</p>
<p>double[] xs = new double[]{9317,3509,2749,4560,6740,7057,2854,6979,4531,2937,8902,8792,3908,9455,2295,7888,7385,7716,6327,3186,65,3446,7264,6396,3685,4716,2372,2404,1681,9175}</p>
<p>und speichern Sie die Werte in einem double-Feld ys. Nutzen Sie dann die folgende Programmzeile, um das Ergebnis auszugeben:</p>

<p>for(int i=0; i&lt;x.length; ++i)
System.out.print(((int)(ys[i]*1000000)/1000000)+((i&lt;x.length-1)?&quot;,&quot;:&quot;&quot;));</p>

<p>Zur Überprüfung Ihrer Lösung:</p>
<p>Wäre gegeben:</p>

<p>double[] xs = new double[]{2,4,10,24,33,15,100,7,12,44}</p>

<p>So wäre die Ausgabe:</p>

<p>1.414213,2.0,3.162277,4.898979,5.744562,3.872983,10.000052,2.645751,3.464101,6.633249</p>
