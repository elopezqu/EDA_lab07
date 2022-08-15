<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
 <h3>INFORME DE LABORATORIO</h3>
</div>
<table>
 <theader>
  <tr><th colspan="6" bgcolor="red">INFORMACIÓN BÁSICA</th></tr>
 </theader>
 <tbody>
  <tr><td>ASIGNATUA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
  <tr><td>TÍTULO DE LA PRACTICA:</td><td colspan="4">Hashing<td></tr>
  <tr><td>NÚMERO DE PRÁCTICA:</td><td>Practica de Laboratorio 07</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td></tr>
  <tr><td>FECHA DE PRESENTACIÓN:</td><td>14-Agosto-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">11:30 p.m.</td></tr>
  <tr><td>INTEGRANTES:</td><td colspan="3">-Diego Ivan Pacori Anccasi<br>-Edson Joel López Quispe<br>-Oliver Alessandro Mayta Nolasco<br>-Edwin Francisco Aguilar Tancayo<br>-Jordy Emanuel Ayma Cutipa</td><td>NOTA:</td><td>...</td></tr>
  <tr><td>DOCENTE:</td><td colspan="5">Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</td></tr>
 </tbody>
</table>
<table>
 <theader>
  <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
 </theader>
 <tbody>
  <tr><td><strong>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS:</strong><br>
  <ul>
    <ol>
        <li>Deben contemplar como mínimo el desarrollo de todos los métodos en su clase
        </li>
        <h2>Método <em>ToString</em></h2>
        Este método recibe un parámetro, nos muestra fila por fila todos los elementos que estén en el HashMap en el siguiente formato: (Key: "llave" Value: "valor")<br>
        <img src="ejercicio1/imagenes/toString.PNG"><br>
        Lo que hace es que va pasa uno por uno cada elemento del arraylist y sobre cada elemento recorre la lista enlazada (siempre y cuando haya una elemento no NULO como siguiente nodo).
        <h2>Método <em>Clear</em></h2>
        Este método nos elimina cada elemento del HashMap.<br>
        <img src="ejercicio1/imagenes/clear.PNG"><br>
        Lo que hace es que elimina completamente todo el arrayList y posteriormente vuelve a inicializar todos los elementos en null, para posibilitar el volver a agregar elementos a nuestro hastMap VACÍO.
        <h2>Método <em>HashCode</em></h2>
        Este método nos retorna la clave de determinada "key".<br>
        <img src="ejercicio1/imagenes/hashCode.PNG"><br>
        Lo que hace es que utiliza el método hashCode() que tiene por defecto cualquier objeto(ya que hereda de "Object") y posteriormente le saca el módulo de la variable "numBuckets", que vendría a ser el número de filas del hashMap. Asi obteniendo el código hash.
        <li>Deben manejar las colisiones por Encadenamiento (Lista enlazada) y Sondeo Lineal. 
        </li>
        <li>Es posible agregar otros métodos que les ayuden a su resolución.     
        </li>
        <li>Crear un archivo de test donde incluyen casos de prueba.
        </li>
    </ol>
  </ul>

  <tr><td><strong>III. CONCLUSIONES:</strong>
  <br>-...</td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>III. RETROALIMENTACIÓN GENERAL</strong><br>
  </td><tr>
 </theader>
 <tbody>
  <tr><td>-...</td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>REFERENCIAS Y BIBLIOGRAFÍA</strong></td><tr>
 </theader>
 <tbody>
  <tr><td>....</td></tr>
  <tr><td>....</td></tr>
  <tr><td>....</td></tr>
  <tr><td>....</td></tr>
  <tr><td>....</td></tr>
 </tbody>
</table>
