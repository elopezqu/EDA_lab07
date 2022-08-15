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
        <h2>Método <em>Remove</em></h2>
        Este método recibe un parámetro, este parámetro es una variable genérica a la que se le llama K y retorna tambien una variable generica V.<br>
        <img src="ejercicio1/imagenes/remove.png"><br>
        Esta variable genérica pasa por el hashCode, para poder buscarlo en el ArrayList, si existe y verdaderamente es la clave que se busca (de lo contrario sigue al siguiente HashNode), lo remplaza por el siguiente en el ArrayList y se resta a la variable size, que almacena el número de elementos contenidos en el ArrayList.
        <pre>
        if(head.key.equals(key)){
            V val=head.value;
            head=head.next;
            bucket.set(index, head);
            size--;
            return val;
        }
        else{...}
        </pre>
        Terminando el método con la devolución del elemento eliminado.
        <li>Deben manejar las colisiones por Encadenamiento (Lista enlazada) y Sondeo Lineal. 
        </li>
        <li>Es posible agregar otros métodos que les ayuden a su resolución.            
        </li>
        <em>Considerando que los métodos usados en este laboratorio son los suficientes para la implementación del Hash no se ha considerado aumentar métodos.</em>
        <li>Crear un archivo de test donde incluyen casos de prueba.
        </li>
    </ol>
  </ul>

  <tr><td><strong>III. CONCLUSIONES:</strong>
  <br>Una tabla hash tiene como principal ventaja que el acceso a los datos suele ser muy rápido, producto de la manipulación de las claves por ciertos algoritmos. Esta se implenta en tablas con indices producto de esa manipulación</td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>III. RETROALIMENTACIÓN GENERAL</strong><br>
  </td><tr>
 </theader>
 <tbody>
  <tr><td>El hash o hashing es un método para convertir algún tipo de datos en un número
relativamente pequeño que puede servir como una "huella digital" de los datos. El
algoritmo hash manipula los datos para crear tales huellas digitales, llamadas valores
hash. Estos valores hash se utilizan generalmente como índices en tablas hash.
Lo que hace el hashing es tener un balance entre la cantidad de memoria a utilizar y las
restricciones del tiempo al realizar operaciones en los registros (consultas, inserciones,
eliminaciones, etc....). </td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>REFERENCIAS Y BIBLIOGRAFÍA</strong></td><tr>
 </theader>
 <tbody>
  <tr><td>https://www.delftstack.com/es/howto/java/hashmap-hashset-hashtable-in-java/#:~:text=%2C%201%3Done%7D-,Java%20HashSet,m%C3%A1s%20la%20interfaz%20de%20Colecciones.</td></tr>
  <tr><td>https://sites.google.com/a/espe.edu.ec/programacion-ii/home/tablas-hash</td></tr>
  <tr><td>https://es.wikipedia.org/wiki/HashCode()_(Java)#:~:text=En%20el%20lenguaje%20de%20programaci%C3%B3n,defecto%2C%20por%20la%20clase%20Object.</td></tr>
 </tbody>
</table>
