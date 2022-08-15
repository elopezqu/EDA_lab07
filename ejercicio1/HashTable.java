

public interface HashTable <K, V>{
    /**
     * Retorna el numero de clave-valor registrado en la tabla hash.
     *
     * @return Retorna el numero de clave-valor registros en la tabla hash.
     */
    public int size();

    /**
     * Retorna {@code true} si la tabla hash no contiene ningun registro.
     *
     * @return {@code true} si la tabla hash no contiene registros.
     */
    public boolean isEmpty();

    /**
     * Retorna {@code true} Si la tabla contiene una clave determinada. Retorna {@code true} si y solo si 
     * existe la clave {@code k} una sola vez)
     *
     * @param key la clave cuya existencia sera validada
     * @return {@code true} si la tabla contiene un la clave determinada
     * @throws NullPointerException si la clave es null
     * (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
     */
    public boolean containsKey(K key);

    /**
     * Returns {@code true} Si la tabla contiene uno o mas registros asociados a   
     * cierto valor especificado.
     *
     * @param value valor cuya existencia sera validada
     * @return {@code true} si la tabla contiene una o mas claves asociadas al valor determinado
     * @throws NullPointerException si el valor es null
     * (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
     */
    public boolean containsValue(V value);

    /**
     * Retorna el valor el cual corresponde a la clave o 
     * {@code null} si la tabla no contiene el registro para la clave.
     * @param key la clave cuyo valor asociado sera retornado
     * @return el valor correspondiente a la clave o 
     *         {@code null} si no se encuentra un registro para la clave
     * @throws NullPointerException si la clave es null
     * (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
     */
    public V get(K key);


    /**
     * Asocia el valor especificado con la clave especificada a la tabla hash
     * Si la tabla tiene un registro previo para la clave,
     * el valor viejo es reemplazado por el nuevo valor ingresado.
     *
     * @param key la clave
     * @param value el valor
     * @return El valor previo al valor asociado con la clave {@code key}, o
     *         {@code null} si no existia previamente un reistro con la clave {@code key} y 
	 * 			este fue agregado correctamente.
     * @throws NullPointerException si la clave o valor son nulos
     * @throws ErrorException para otros tipos de error
     */
    public void put(K key, V value);

    /**
     * Elimina el registro de una clave, si la clave existe 
     * o {@code null} si no existe un registro para la clave.
     *
     * @param key clave a ser removida de la tabla hash
     * @return el valor que fue eliminado y asociado a {@code key}, o
     *         {@code null} si no existe el registro para {@code key}.
     * @throws NullPointerException si la clave es nula
     * (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
     */
    public V remove(K key);
    /**
     * Elimina todos los registros de la tabla hash
     * La tabla hash estara vacia despues de llamar a este metodo.
     */
    public int hashCode(K key);
    
    /**
     * Retorna todos los elementos de la tabla hash.
     */
    public String toString();

    void clear();

}
